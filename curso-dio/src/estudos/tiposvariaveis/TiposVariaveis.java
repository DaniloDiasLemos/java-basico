package estudos.tiposvariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        //tipos primitivos:
        //byte, short, *int*, long, float, *double*
        // <TIPO> <NOME> <atribuicao>
        int idade = 0;
        double salarioMinimo = 3.500; //tres ponto quinhentos
        double salario = 2000.55;
        float pi = 3.14F; //float deve terminar em F para o java não confundir o valor com double
        long cpf = 98765432109L; //long deve terminar em L para o java não confundir com inteiro
    
        final double VALOR_DE_PI = 3.14; //variavel final não pode ser modificada (TODA EM MAIUSCULA)
    
        String meuNome = "DaniloDias"; //tipo string é uma classe chama String
    }
}
