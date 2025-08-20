import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String  option;

        do {
            showMenu();
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    Gerenciamento.manageStudent();
                    break;
                case "2":
                    Gerenciamento.manageDisciplines();
                    break;
                case "3":
                    Gerenciamento.manageCourses();
                    break;
                case "4":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (!option.equals("4"));
    }

    public static void showMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Gerenciar ALUNOS");
        System.out.println("2 - Gerenciar DISCIPLINAS");
        System.out.println("3 - Gerenciar CURSOS");
        System.out.println("4 - SAIR");
        System.out.print("Escolha uma opção: ");
    }
}
