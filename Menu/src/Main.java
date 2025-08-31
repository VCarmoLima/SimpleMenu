import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("|       MENU      |");
        System.out.println("| --------------- |");
        System.out.println("| Opções:         |");
        System.out.println("|    1. Opção 1   |");
        System.out.println("|    2. Opção 2   |");
        System.out.println("|    3. Opção 3   |");
        System.out.println("|    4. Sair      |");
        System.out.println("| --------------- |");
        System.out.println(" ");

        System.out.print("Selecione uma opção: ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Opção 1 selecionada!");
                break;
            case 2:
                System.out.println("Opção  2 selecionada!");
                break;
            case 3:
                System.out.println("Opção 3 selecionada!");
                break;
            case 4:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Seleção inválida!");
        }

        sc.close();
    }
}