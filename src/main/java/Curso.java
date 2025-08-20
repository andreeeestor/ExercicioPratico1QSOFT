package main.java;

import java.util.ArrayList;

public class Curso {
    private String name;
    private String time;
    private ArrayList<Disciplina> disciplines;

    public Curso(String name, String time) {
        this.name = name;
        this.time = time;
        this.disciplines = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void addDiscipline(Disciplina discipline) {
        disciplines.add(discipline);
    }

    public ArrayList<Disciplina> getDisciplines() {
        return disciplines;
    }

    public void updateName(String newName) {
        setName(newName);
        System.out.println("main.java.Curso atualizado: " + newName);
    }
}
