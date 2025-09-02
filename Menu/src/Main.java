import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("|       MENU      |");
            System.out.println("| --------------- |");
            System.out.println("| Opções:         |");
            System.out.println("|   1. Opção 1    |");
            System.out.println("|   2. Opção 2    |");
            System.out.println("|   3. Opção 3    |");
            System.out.println("|    4. Sair      |");
            System.out.println("|   5. Repetir    |");
            System.out.println("| --------------- |");
            System.out.println(" ");

            System.out.print("Selecione uma opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida! Por favor, digite novamente.");
                System.out.println(" --------------- ");
                System.out.print("Selecione uma opção: ");
                sc.next();
            }

            var process = "PROCESSANDO...";

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Opção 1 selecionada!");
                    System.out.println(process);
                    try {
                        Thread.sleep(750);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Opção  2 selecionada!");
                    System.out.println(process);
                    try {
                        Thread.sleep(750);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada!");
                    System.out.println(process);
                    try {
                        Thread.sleep(750);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                    try {
                        Thread.sleep(750);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.println("Repetindo...");
                    try {
                        Thread.sleep(750);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Seleção inválida!");
            }

        } while (op == 5);

        sc.close();
    }
}