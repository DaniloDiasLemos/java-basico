package estudos.estruturascondicionais;

public class Simples {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;
        // double valorSolicitado = 177.0; //não entra no if

        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
        }

        System.out.println(saldo);

    }
}
