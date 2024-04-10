import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("Digite o número da conta:");
        int numero = sc.nextInt();
        sc.nextLine();  // Limpar o buffer do scanner

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo:");
        double saldo = sc.nextDouble();

        // Exibir mensagem final com os dados inseridos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();  // Fechar o scanner ao finalizar
    }
}
