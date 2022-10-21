import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {

        // String nome = args[0]; pega o primeiro argumento passado ao executar a classe
        // String sobreNome = args[1];
        // System.out.println(nome + " " + sobreNome);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Digite sua idade: ");
        // int idade = sc.nextInt();
        // System.out.println("Sua idade é: " + idade);


        SmartTv smartTv = new SmartTv();


        System.out.println("TV ligada ? : " + smartTv.ligada);
        System.out.println("Canal atual? : " + smartTv.canal);
        System.out.println("Volume atual? : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada ? : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada ? : " + smartTv.ligada);

        smartTv.diminuirVolume();//24
        smartTv.diminuirVolume();//23
        smartTv.diminuirVolume();//22
        smartTv.aumentarVolume();//23

        System.out.println("Volume atual? : " + smartTv.volume);

        smartTv.mudarCanal(13);

        System.out.println("Canal atual? : " + smartTv.canal);
        

    }
}
