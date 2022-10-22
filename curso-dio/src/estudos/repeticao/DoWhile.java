package estudos.repeticao;
import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {

         System.out.println("Discando...");

         do { // executa pelo menos uma vez o bloco 'do'
            System.out.println("Telefone tocando");
         } while (tocando());

         System.out.println("Alouuu !!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);

        return !atendeu; // se atendeu (random for igual a 1) não está mais tocando(!atendeu)
    }
}
