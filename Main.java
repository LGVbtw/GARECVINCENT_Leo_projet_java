public class Main {
    public static void main(String[] args) {
        // Instanciation des monstres
        MonstreFeu monstreFeu = new MonstreFeu("Feu", 296, 52);
        MonstreEau monstreEau = new MonstreEau("Eau", 150, 26);
        MonstrePlante monstrePlante = new MonstrePlante("Plante", 245, 43);

        // Combats entre les monstres
        System.out.println("Combats entre le Monstre Feu et le Monstre Eau:");
        afficherInfosMonstres(monstreFeu, monstreEau);
        simulationCombats(monstreFeu, monstreEau);
        restaurerPv(monstreFeu, 296);
        restaurerPv(monstreEau, 150);

        System.out.println("\nCombats entre le Monstre Eau et le Monstre Plante:");
        afficherInfosMonstres(monstreEau, monstrePlante);
        simulationCombats(monstreEau, monstrePlante);
        restaurerPv(monstreEau, 150);
        restaurerPv(monstrePlante, 245);

        System.out.println("\nCombats entre le Monstre Plante et le Monstre Feu:");
        afficherInfosMonstres(monstrePlante, monstreFeu);
        simulationCombats(monstrePlante, monstreFeu);
        restaurerPv(monstrePlante, 245);
        restaurerPv(monstreFeu, 296);

    }

    // Affichage des informations des monstres
    public static void afficherInfosMonstres(Monstre monstresCombattants1, Monstre monstresCombattants2) {
        System.out.println(monstresCombattants1.getClass().getSimpleName() + " - HP : " + monstresCombattants1.getHp() + ", Degats : " + monstresCombattants1.getAtk());
        System.out.println(monstresCombattants2.getClass().getSimpleName() + " - HP : " + monstresCombattants2.getHp() + ", Degats : " + monstresCombattants2.getAtk());
        System.out.println("-----------------------------------------------------------------------");
    }

    // Simulation des combatss entre les monstres
    public static void simulationCombats(Monstre monstresCombattants1, Monstre monstresCombattants2) {
        while (monstresCombattants1.getHp() > 0 && monstresCombattants2.getHp() > 0) {
            monstresCombattants1.attaquer(monstresCombattants2);
            System.out.println(monstresCombattants1.getClass().getSimpleName() + " attaque " + monstresCombattants2.getClass().getSimpleName() + " - " + monstresCombattants2.getClass().getSimpleName() + " a " + monstresCombattants2.getHp() + " hp restants.");
            System.out.println("-----------------------------------------------------------------------");
            if (monstresCombattants2.getHp() <= 0) {
                System.out.println("-------------------- " + monstresCombattants2.getClass().getSimpleName() + " est mort ! --------------------");
                break;
            }

            monstresCombattants2.attaquer(monstresCombattants1);
            System.out.println(monstresCombattants2.getClass().getSimpleName() + " attaque " + monstresCombattants1.getClass().getSimpleName() + " - " + monstresCombattants1.getClass().getSimpleName() + " a " + monstresCombattants1.getHp() + " hp restants.");
            System.out.println("-----------------------------------------------------------------------");
            if (monstresCombattants1.getHp() <= 0) {
                System.out.println("-------------------- " + monstresCombattants1.getClass().getSimpleName() + " est mort ! --------------------");
                break;
            }
        }
    }

    // Méthode afin de remettre les pv des monstres à leur valeur initiale après un simulationCombats
    public static void restaurerPv(Monstre monstre, int pvInitiaux) {
        monstre.setHp(pvInitiaux);
    }
}