public class MonstreFeu extends Monstre {
    public MonstreFeu(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    // Attaque spéciale du Monstre Feu
    @Override
    public void attaquer(Monstre cible) {
        // Condition pour déterminer la cible du monstre afin de calculer les dégâts lors d'attaques
        if (cible instanceof MonstrePlante) {
            cible.setHp(cible.getHp() - (int)(getAtk() * 2));
        } else if (cible instanceof MonstreEau) {
            cible.setHp(cible.getHp() - (int)(getAtk() * 0.5));
        } else {
            super.attaquer(cible);
        }
    }
}
