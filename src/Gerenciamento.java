import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciamento {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Aluno> students = new ArrayList<>();
    static ArrayList<Disciplina> disciplines = new ArrayList<>();
    static ArrayList<Curso> courses = new ArrayList<>();

    public static void manageStudent() {
        String studentOption;
        do {
            System.out.println("\n===== Gerenciar ALUNOS =====");
            System.out.println("1 - Cadastrar ALUNOS");
            System.out.println("2 - Consultar ALUNOS");
            System.out.println("3 - Remover ALUNOS");
            System.out.println("4 - Atualizar ALUNOS");
            System.out.println("5 - Voltar para o menu");
            System.out.print("Escolha uma opção: ");
            studentOption = scanner.nextLine();

            switch (studentOption) {
                case "1":
                    registerStudent();
                    break;
                case "2":
                    viewStudent();
                    break;
                case "3":
                    removeStudent();
                    break;
                case "4":
                    updateStudent();
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (!studentOption.equals("5"));
    }

    public static void registerStudent() {
        System.out.print("Digite o nome do Aluno: ");
        String name = scanner.nextLine();

        System.out.print("Digite a idade do Aluno: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escolha um curso:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + " - " + courses.get(i).getName());
        }
        int courseOption = scanner.nextInt();
        scanner.nextLine();
        Curso selectedCourse = courses.get(courseOption - 1);

        students.add(new Aluno(name, age, selectedCourse));
        System.out.println("Aluno registrado com sucesso!");
    }

    public static void viewStudent() {
        System.out.print("Digite o nome do aluno a ser consultado: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Aluno student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                Curso c = student.getCourse();

                System.out.println("Aluno encontrado: " + student.getName() + " - " + student.getAge());
                System.out.println("Curso: " + c.getName());

                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void removeStudent() {
        System.out.print("Digite o nome do aluno a ser removido: ");
        String name = scanner.nextLine();
        boolean removed = students.removeIf(student -> student.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void updateStudent() {
        System.out.print("Digite onome do aluno a ser alterado: ");
        String lastName = scanner.nextLine();
        boolean found = false;
        for (Aluno student : students) {
            if (student.getName().equalsIgnoreCase(lastName)) {
                System.out.print("Digite o novo nome: ");
                String newName = scanner.nextLine();
                student.updateName(newName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static void manageDisciplines() {
        int disciplineOption;
        do {
            System.out.println("\n===== Gerenciar DISCIPLINA =====");
            System.out.println("1 - Cadastrar DISCIPLINA");
            System.out.println("2 - Consultar DISCIPLINA");
            System.out.println("3 - Remover DISCIPLINA");
            System.out.println("4 - Atualizar DISCIPLINA");
            System.out.println("5 - Voltar para o menu");
            System.out.print("Escolha uma opção: ");
            disciplineOption = scanner.nextInt();
            scanner.nextLine();

            switch (disciplineOption) {
                case 1:
                    registerDiscipline();
                    break;
                case 2:
                    viewDiscipline();
                    break;
                case 3:
                    removeDiscipline();
                    break;
                case 4:
                    updateDiscipline();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (disciplineOption != 5);
    }

    public static void registerDiscipline() {
        System.out.print("Digite o nome da disciplina: ");
        String name = scanner.nextLine();

        System.out.print("Digite a carga horária: ");
        int workload = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o grau da disciplina: ");
        double grade = Double.parseDouble(scanner.nextLine());

        disciplines.add(new Disciplina(name, workload, grade));
        System.out.println("Disciplina cadastrada com sucesso!");
    }

    public static void viewDiscipline() {
        System.out.print("Digite o nome da disciplina a ser consultada: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Disciplina discipline : disciplines) {
            if (discipline.getName().equalsIgnoreCase(name)) {
                System.out.println("Disciplina encontrada: " + discipline.getName());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Disciplina não econtrada.");
        }
    }

    public static void removeDiscipline() {
        System.out.print("Digite o nome da disciplina a ser removida: ");
        String name = scanner.nextLine();
        boolean removed = disciplines.removeIf(discipline -> discipline.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Disciplina removida com sucesso!");
        } else {
            System.out.println("Disciplina não encontrada.");
        }
    }

    public static void updateDiscipline() {
        System.out.print("Digite o nome da disciplina a ser atualizada: ");
        String oldName = scanner.nextLine();
        boolean found = false;
        for (Disciplina discipline : disciplines) {
            if (discipline.getName().equalsIgnoreCase(oldName)) {
                System.out.print("Digite o novo nome: ");
                String newName = scanner.nextLine();
                discipline.updateName(newName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Disciplina não encontrada.");
        }
    }

    public static void manageCourses() {
        int courseOption;
        do {
            System.out.println("\n===== Gerenciar CURSO =====");
            System.out.println("1 - Cadastrar CURSO");
            System.out.println("2 - Consultar CURSO");
            System.out.println("3 - Remover CURSO");
            System.out.println("4 - Atualizar CURSO");
            System.out.println("5 - Voltar para o menu");
            System.out.print("Escolha uma opção: ");
            courseOption = scanner.nextInt();
            scanner.nextLine();

            switch (courseOption) {
                case 1:
                    registerCourse();
                    break;
                case 2:
                    viewCourse();
                    break;
                case 3:
                    removeCourse();
                    break;
                case 4:
                    updateCourse();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (courseOption != 5);
    }

    public static void registerCourse() {
        System.out.print("Digite o nome do curso: ");
        String name = scanner.nextLine();

        System.out.print("Digite o periodo: ");
        String time = scanner.nextLine();

        Curso newCourse = new Curso(name, time);
        courses.add(newCourse);

        System.out.println("Curso cadastrado com sucesso!");

        int addDiscipline;
        do {
            System.out.println("Você quer adicionar disciplinas no curso?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            addDiscipline = scanner.nextInt();
            scanner.nextLine();

            if (addDiscipline == 1) {
                System.out.print("Digite o nome: ");
                String disciplineName = scanner.nextLine();

                System.out.print("Digite a carga horária: ");
                int workload = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite o grau da discplina: ");
                double grade = scanner.nextDouble();
                scanner.nextLine();

                Disciplina discipline = new Disciplina(disciplineName, workload, grade);
                newCourse.addDiscipline(discipline);
                System.out.println("Discplina adicionada ao curso!");
            }
        } while (addDiscipline != 2);
    }

    public static void viewCourse() {
        System.out.print("Digite o nome do curso a ser consultado: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Curso course : courses) {
            if (course.getName().equalsIgnoreCase(name)) {
                System.out.println("Curso encontrado: " + course.getName());
                System.out.println("Disciplinas");
                for (Disciplina d : course.getDisciplines()) {
                    System.out.println("- " + d.name);
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Curso não encontrado.");
        }
    }

    public static void removeCourse() {
        System.out.print("Digite o nome do curso a ser removido: ");
        String name = scanner.nextLine();
        boolean removed = courses.removeIf(course -> course.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Curso removido com sucesso!");
        } else {
            System.out.println("Curso não encontrado.");
        }
    }

    public static void updateCourse() {
        System.out.print("Digite o nome do curso a ser atualizado: ");
        String oldName = scanner.nextLine();
        boolean found = false;
        for (Curso course : courses) {
            if (course.getName().equalsIgnoreCase(oldName)) {
                System.out.print("Digite o novo nome: ");
                String newName = scanner.nextLine();
                course.updateName(newName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Curso não encontrado.");
        }
    }
}