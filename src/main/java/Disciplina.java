package main.java;

public class Disciplina {
    public String name;
    private int workload;
    private double grade;

    public Disciplina(String name, int workload, double grade) {
        this.name = name;
        this.workload = workload;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void updateName(String newName) {
        setName(newName);
        System.out.println("Discipline updated: " + newName);
    }
}
