public class Monstre {
    private String nom;
    private int hp;
    private int atk;

    // Constructeur de la classe Monstre
    public Monstre(String nom, int hp, int atk) {
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    // Méthode permettant l'affichage des informations du monstre
    public void afficherInfosMonstres() {
        System.out.println("Nom : " + nom + ", Hp : " + hp + ", Degats : " + atk);
    }

    // Méthode renvoyant un boolean pour savoir si le monstre est mort
    public boolean estMort() {
        return hp <= 0;
    }

    // Méthode permettant l'action d'attaquer un monstre
    public void attaquer(Monstre cible) {
        cible.setHp(cible.getHp() - atk);
    }
}
