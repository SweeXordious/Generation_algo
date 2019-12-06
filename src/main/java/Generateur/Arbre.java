package Generateur;

import java.util.ArrayList;

public class Arbre {

    ArrayList<Cellule> leaves;
    ArrayList<Cellule> tree;
    ArrayList<Disponibilite> disponibilites;
    ArrayList<Disponibilite> contraintes;

    public Arbre(ArrayList<Disponibilite> disponibilites, ArrayList<Disponibilite> contraintes) {
        this.disponibilites = disponibilites;
        this.contraintes = contraintes;
        leaves = new ArrayList<Cellule>();
        tree = new ArrayList<Cellule>();
    }

    public ArrayList<Cellule> getLeaves() {
        return leaves;
    }

    public void setLeaves(ArrayList<Cellule> leaves) {
        this.leaves = leaves;
    }

    public ArrayList<Cellule> getTree() {
        return tree;
    }

    public void setTree(ArrayList<Cellule> tree) {
        this.tree = tree;
    }

    public ArrayList<Disponibilite> getDisponibilites() {
        return disponibilites;
    }

    public void setDisponibilites(ArrayList<Disponibilite> disponibilites) {
        this.disponibilites = disponibilites;
    }

    public ArrayList<Disponibilite> getContraintes() {
        return contraintes;
    }

    public void setContraintes(ArrayList<Disponibilite> contraintes) {
        this.contraintes = contraintes;
    }

    private ArrayList<Cellule> generate_succ (Cellule c) {

    }

    public ArrayList<Disponibilite> go(){

    }
}
