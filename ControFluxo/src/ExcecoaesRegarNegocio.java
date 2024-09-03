import java.security.cert.CertPathBuilderException;

public class ExcecoaesRegarNegocio {
    public static void main(String[] args) {
        String cepFormatado = formatarCep("23703234");
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

            return "23.703-234";
    }
}
