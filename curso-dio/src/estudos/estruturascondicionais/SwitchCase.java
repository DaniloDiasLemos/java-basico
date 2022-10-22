package estudos.estruturascondicionais;

public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;

            case "M":
                System.out.println("Medio");
                break;

            case "G":
                System.out.println("Grande");
                break;

            default:
                System.out.println("Indefinido");
        }

        String plano = "M";

        switch (plano) { //Plano T contem o M e B por isso não usa o Break
            case "T":
                System.out.println("5Gb Youtube");
        
            case "M":
                System.out.println("Whats e instagram grátis");
        
            case "B":
                System.out.println("100 minutos de ligação");
                break;
        }
    }
}
