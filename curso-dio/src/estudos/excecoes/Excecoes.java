package estudos.excecoes;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    
            System.out.println("Digite seu nome");
            String nome = sc.next();
    
            System.out.println("Digite seu sobrenome");
            String sobrenome = sc.next();
    
            System.out.println("Digite sua idade");
            int idade = sc.nextInt();
    
            System.out.println("digite sua altura");
            double altura = sc.nextDouble();
    
            System.out.println("Ola, me chamo " + nome.toUpperCase()+ " " + sobrenome.toUpperCase() + " .Tenho " + idade + " anos " + ".Minha altura é " + altura + " cm");
    
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("O campo idade e altura precisam ser numericos!");
        }

        
        Number valor;

        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
