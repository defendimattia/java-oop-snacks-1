package org.lessons.java.oop.snacks;

import java.util.ArrayList;

public class RegistroStudenti {

    private ArrayList<Studente> studenti;

    public RegistroStudenti() {
        studenti = new ArrayList<>();
    }

    public void aggiungiStudente(Studente studente) {
        if (studente != null) {
            studenti.add(studente);
        }
    }

    public void getStudenti() {
        if (studenti.isEmpty()) {
            System.out.println("Nessuno studente presente.");
            return;
        }

        String output = "Registro studenti: ";

        for (int i = 0; i < studenti.size(); i++) {
            if (i < studenti.size() - 1) {
                output += String.format("%s; ", studenti.get(i).getInfos());
            } else {
                output += String.format("%s", studenti.get(i).getInfos());
            }
        }

        System.out.println(output);
    }
}
