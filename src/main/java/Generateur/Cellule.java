package Generateur;

import java.util.ArrayList;

public class Cellule {

    ArrayList<Disponibilite> disponibilites;
    boolean seen;
    int size;

    public Cellule() {
        disponibilites = new ArrayList<Disponibilite>(11);
    }

    public ArrayList<Disponibilite> getDisponibilites() {
        return disponibilites;
    }

    public void setDisponibilites(ArrayList<Disponibilite> disponibilites) {
        this.disponibilites = disponibilites;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}


