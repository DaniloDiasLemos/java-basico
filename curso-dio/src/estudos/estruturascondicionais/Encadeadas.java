package estudos.estruturascondicionais;

public class Encadeadas {
    public static void main(String[] args) {
        int nota = 8; //entra 1 if: Aprovado
        int nota2 = 6; //entra 1 else e 2 if: Recuperação
        int nota3 = 4; //entra no 2 else: Reprovado

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >=5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
