package org.lessons.java.oop.snacks;

public class Studente {
    private String firstname;
    private String lastname;
    private int age;

    public Studente(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public void setFirstname(String newFirstname) {
        if (newFirstname != null && !newFirstname.trim().isEmpty()
                && newFirstname.trim().matches("[a-zA-ZàèéìòùÀÈÉÌÒÙ' ]+"))
            this.firstname = newFirstname.trim();
    }

    public void setLastname(String newLastname) {
        if (newLastname != null && !newLastname.trim().isEmpty()
                && newLastname.trim().matches("[a-zA-ZàèéìòùÀÈÉÌÒÙ' ]+"))
            this.lastname = newLastname.trim();
    }

    public void setAge(int newAge) {
        if (newAge >= 3 && newAge <= 130) {
            this.age = newAge;
        }
    }

    public String getInfos() {

        if (this.firstname != null && this.lastname != null && this.age >= 3 && this.age <= 130) {
            String infos = String.format("%s %s, %d anni", this.firstname, this.lastname, this.age);
            return infos;
        }

        return null;
    }
}
