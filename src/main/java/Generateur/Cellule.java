package Generateur;

import java.util.ArrayList;

public class Cellule {

    Disponibilite[] temp_emp;
    boolean seen;
    int size;

    public Cellule() {

        temp_emp = new Disponibilite[8]; // From monday to saturday, Change other one in Arbre
        seen = false;
        size = 0;
    }

    public void populate(ArrayList<Disponibilite> contraintes) {
        for (int i = 0; i < contraintes.size(); i++) {
            Disponibilite current_dispo = contraintes.get(i);
            temp_emp[current_dispo.getJour() * 2 + current_dispo.getHeure()] = current_dispo;
        }
    }

    public Disponibilite[] getTemp_emp() {
        return temp_emp;
    }

    public void setTemp_emp(Disponibilite[] temp_emp) {
        this.temp_emp = temp_emp;
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

    public String getTemp_emp_String() {
        String str = "";
        for (int i = 0 ; i < temp_emp.length; i++){
            if(temp_emp[i] != null) str += "\t" + temp_emp[i].toString() + "\n";
        }
        return str;
    }
}


