package estudos.estruturascondicionais;

public class Composta {
    public static void main(String[] args) {
        int nota =  6; // entra no else: reprovado
        // int nota =  7; entra no if: aprovado

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
