public class MonstreEau extends Monstre {
    public MonstreEau(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    // Attaque spéciale du Monstre Eau
    @Override
    public void attaquer(Monstre cible) {
        // Condition pour déterminer la cible du monstre afin de calculer les dégâts lors d'attaques
        if (cible instanceof MonstreFeu) {
            cible.setHp(cible.getHp() - (int)(getAtk() * 2));
        } else if (cible instanceof MonstrePlante) {
            cible.setHp(cible.getHp() - (int)(getAtk() * 0.4));
        } else {
            super.attaquer(cible);
        }
    }
}