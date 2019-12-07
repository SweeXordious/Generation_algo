import Generateur.Arbre;
import Generateur.Disponibilite;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        System.out.println("Start");


        Disponibilite prof1 = new Disponibilite(1, 1, "Rachid");
        Disponibilite prof2 = new Disponibilite(1, 1, "Hamid");
        Disponibilite prof3 = new Disponibilite(0, 0, "Karim");
        Disponibilite prof4 = new Disponibilite(1, 0, "Salim");
        Disponibilite prof5 = new Disponibilite(0, 1, "Hamid");
        Disponibilite prof6 = new Disponibilite(1, 0, "Karim");
        Disponibilite prof7 = new Disponibilite(1, 0, "Sa3id");
        Disponibilite prof8 = new Disponibilite(0, 3, "Sa3id");
        Disponibilite prof9 = new Disponibilite(1, 2, "Hakim");
        Disponibilite prof10 = new Disponibilite(0, 2, "Hakim");
        Disponibilite prof11 = new Disponibilite(0, 0, "Khalid");
        Disponibilite prof12 = new Disponibilite(1, 3, "Warid");
        Disponibilite prof13 = new Disponibilite(1, 2, "Khalid");
        Disponibilite prof14 = new Disponibilite(1, 0, "Hakim");

        ArrayList<Disponibilite> dispos = new ArrayList<Disponibilite>();
        dispos.add(prof1);
        dispos.add(prof2);
        dispos.add(prof3);
        dispos.add(prof4);
        dispos.add(prof5);
        dispos.add(prof6);
        dispos.add(prof7);
        dispos.add(prof8);
        dispos.add(prof9);
        dispos.add(prof10);
        dispos.add(prof11);
        dispos.add(prof12);
        dispos.add(prof13);
        dispos.add(prof14);


        Arbre a  = new Arbre(dispos, new ArrayList<Disponibilite>());
        Disponibilite[] result = a.go();

        for(int i = 0; i< result.length; i++) {
            if (result[i] != null) System.out.println(result[i].toString());
        }


        System.out.println("End");
    }
}
