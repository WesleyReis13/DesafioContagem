import java.util.Scanner;

public class DesafioContagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();


        int n = -1;
        while (n < 0) {
            System.out.print("Digite um número positivo (n): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("O número precisa ser positivo. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
            }
        }


        System.out.println("\n--- Contagem Crescente (0 até " + n + ") ---");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("\n--- Contagem Decrescente (" + n + " até 0) ---");
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("\n--- Exibição do Nome ---");
        int quantidadeLetras = nome.length();
        System.out.println("Nome: " + nome + " (" + quantidadeLetras + " letras)");

        if (quantidadeLetras > 6) {

            for (int i = 1; i <= n; i++) {
                System.out.println(i + " - " + nome);
            }
        } else {

            System.out.println(nome);
        }

        scanner.close();
    }
}
