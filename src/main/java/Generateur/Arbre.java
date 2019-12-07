package Generateur;

import java.util.ArrayList;

public class Arbre {

    private ArrayList<Cellule> tree;
    private ArrayList<Disponibilite> disponibilites;
    private ArrayList<Disponibilite> contraintes;
    private ArrayList<String> already;
    private Disponibilite[] best_so_far;
    private boolean done = false;

    public Arbre(ArrayList<Disponibilite> disponibilites, ArrayList<Disponibilite> contraintes) {
        this.disponibilites = disponibilites;
        this.contraintes = contraintes;
        tree = new ArrayList<Cellule>();
        already = new ArrayList<String>();
        best_so_far = new Disponibilite[8]; // Change other one in cellule
    }


    private ArrayList<Cellule> generate_succ (Cellule c) {
        ArrayList<Cellule> successeurs = new ArrayList<Cellule>();
        //System.out.println("After succ");

        for (int i= 0; i < disponibilites.size(); i++) {

            Disponibilite current_dispo = disponibilites.get(i);
            if(c.getTemp_emp()[current_dispo.getJour() * 2 + current_dispo.getHeure()] == null && check_already(current_dispo.getProf())) {
                // System.out.println("#Gen_succ: " +  disponibilites.get(i).toString());
                Cellule temp_cell = new Cellule();
                temp_cell.populate(contraintes);
                temp_cell.setTemp_emp(c.getTemp_emp());
                temp_cell.getTemp_emp()[current_dispo.getJour() * 2 + current_dispo.getHeure()] = current_dispo;
                successeurs.add(temp_cell);
                already.add(current_dispo.getProf());
                if (best(temp_cell.getTemp_emp())) best_so_far = temp_cell.getTemp_emp();
            }
        }
        c.setSeen(true);
        return successeurs;
    }

    private boolean best(Disponibilite[] temp_emp) {
        for (int i = 0; i < temp_emp.length; i++) {
            if (best_so_far[i] == null && temp_emp[i] != null) return true;
        }
        return false;
    }

    private boolean check_already(String str) {
        for(int i = 0; i < already.size(); i++) {
            if (already.get(i).equals(str)) return false;
        }
        return true;
    }

    public Disponibilite[] go(){
        tree.add(new Cellule());
        int i = 0;
        while( i < tree.size() && !tree.get(i).seen) {

            // Generate successors for the current cell
            ArrayList<Cellule> temp_succ = generate_succ(tree.get(i));
            tree.addAll(temp_succ);
            i++;
            // System.out.println("#Go: " +  tree.get(i).getTemp_emp_String());
            // Check if current cell can be a correct planning
            // Improvement: Make this check at the moment of creation of the cell in generate_succ...
            if (i < tree.size() && check_cell(tree.get(i))) return tree.get(i).getTemp_emp();
        }
        // Should never end with this
        return best_so_far;

    }

    private boolean check_cell(Cellule cellule) {
        // System.out.println("#Check: " +  cellule.getTemp_emp_String());
        Disponibilite[] emploi = cellule.getTemp_emp();
        for(int i = 0; i < emploi.length; i++) {
            if(emploi[i] == null) return false;
        }
        return true;
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

}
