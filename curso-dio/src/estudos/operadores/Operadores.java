package estudos.operadores;

public class Operadores {

    public static void main(String[] args) { 
        // = é operador de atribuição
        // + (adição), -(subtração), * (multiplicação), / (divisão), % (modulo/resto da divisão)
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicação = 20 * 7;
        int divisão = 15/3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);
    
        // + utilizado a tipos texto realizará concatenação
        String nomeCompleto = "Danilo" + "Dias";
        String concatenacao = "?";
    
        concatenacao = 1+1+1+"1"; //resultado "31"
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1; //resultado "1111"
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);//resultado "13"
        System.out.println(concatenacao);
        //a partir do momento que detecta um caractere ele trata todo o resto como string

        //++ (incremento), -- (decremento) , ! (negação)
        int numero = 5;
        numero++; //soma 1 (numero = 6)
        numero--; //subtrai 1 (numero = 4)

        //negando boolean
        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel); //imprime false

        //ternario <condição> ? <caso true> : <caso false>
        int a,b;

        a =5;
        b = 6;
        String result = a==b ? "verdadeiro" : "falso";
        System.out.println(result); //imprime false pois a não é igual a b

        //Relacionais
        //== (igual a), != (diferente), > (maior que), >= (maior ou igual a), < (menor que), <= (menor ou igual a)
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2) {
            System.out.println("Numero 1 é maior que numero 2");
        }else{
            if (numero1 == numero2) {
                System.out.println("Numero 1 não é igual ao numero 2");
            }
        }

        //Logicos 
        //&& (E), || (ou)

        if (numero1 != numero2 && numero1 < numero2) {
            System.out.println("numero 1 é diferente e menor que o numero 2");
        } //ambas condições devem ser true
        if (numero1 != numero2 || numero1 < numero2) {
            System.out.println("numero 1 é diferente ou menor que o numero 2");
        } //pelo menos uma condição deve ser true







    }
}
