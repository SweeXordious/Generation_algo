package Generateur;

public class Disponibilite {

    int heure;
    int jour;
    String Prof;

    public Disponibilite(int heure, int jour, String prof) {
        this.heure = heure;
        this.jour = jour;
        Prof = prof;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
    }

    public String getProf() {
        return Prof;
    }

    public void setProf(String prof) {
        Prof = prof;
    }
}
