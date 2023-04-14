package ifpr.edu.br;

public class VerificadorNomenclatura {
    
    boolean verificar(String str) {

        if(str.matches("[a-zA-Z0-9]+")) {
            String primeiraLetra = String.valueOf(str.charAt(0));

            if(primeiraLetra.matches("[a-zA-Z]")) {

                if(str.length() <= 6) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
