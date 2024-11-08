public class MonstrePlante extends Monstre {
    public MonstrePlante(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    // Attaque spéciale du Monstre Plante
    @Override
    public void attaquer(Monstre cible) {
        // Condition pour déterminer la cible du monstre afin de calculer les dégâts lors d'attaques
        if (cible instanceof MonstreEau) {
            cible.setHp(cible.getHp() - (int)(getAtk() * 2));
        } else if (cible instanceof MonstreFeu) {
            cible.setHp(cible.getHp() - (int)(getAtk() * 0.3));
        } else {
            super.attaquer(cible);
        }
    }
}