import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int numero = 0;
        String agencia = "", nomeCliente = "";
        double saldo = 0;
     
        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite a Agência !");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o saldo disponível !");
        saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
