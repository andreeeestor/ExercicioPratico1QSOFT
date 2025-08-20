package main.java;

public class Aluno {
    private String name;
    private int age;
    private Curso course;

    public Aluno(String name, int age, Curso course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Curso getCourse() {
        return course;
    }

    public void setCourse(Curso course) {
        this.course = course;
    }

    public void updateName(String newName) {
        setName(newName);
        System.out.println("main.java.Aluno atualizado: " + newName);
    }
}
