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

    public int getStudenti() {
        return studenti.size();
    }
}
