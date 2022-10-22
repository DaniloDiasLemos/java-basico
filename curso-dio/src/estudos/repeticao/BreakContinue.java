package estudos.repeticao;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; //quando i é igual a 3 entra no if e sai do for
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; //quando i é igual a 3 entra no if e passa para a proxima iteração
            }
            System.out.println(i); //numero 3 não é impresso
        }
    }
}
