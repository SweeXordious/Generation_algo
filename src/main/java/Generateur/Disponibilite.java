package Generateur;

public class Disponibilite {

    int heure; // 0 = matin, 1 = aprem
    int jour; // 0 = lundi, 5 = samedi
    String Prof; // nom du professeur en cas de disponibilite, vide en cas de contrainte

    public Disponibilite() {
    }

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

    @Override
    public String toString() {
        return "Disponibilite{" +
                "heure=" + heure +
                ", jour=" + jour +
                ", Prof='" + Prof + '\'' +
                '}';
    }
}
