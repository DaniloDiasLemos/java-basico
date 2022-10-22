package estudos.repeticao;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce do valor de " + valorDoce + " adicionado no carrinho.");
            mesada -= valorDoce;
        }
    }

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
