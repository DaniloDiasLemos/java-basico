package estudos.estruturascondicionais;

public class Ternaria {
    public static void main(String[] args) {
        int nota = 7; //Aprovado
        int nota2 = 6; //linha 8 = Reprovado / linha 12 = Recuperação

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

        String result = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(result);
    }
}
