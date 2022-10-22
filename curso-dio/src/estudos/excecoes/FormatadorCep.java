package estudos.excecoes;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("O cep deve ter 8 numeros");
        }
    }

    static String formatarCep(String cep) throws CepInvalidException{
        if (cep.length() != 8) {
            throw new CepInvalidException();
        }

        return "23.765-064";
    }

}
