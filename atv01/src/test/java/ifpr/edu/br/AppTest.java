package ifpr.edu.br;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

   @Test
   public void verificaCalculoArea() {

        int entrada1 = 10, entrada2 = 5;

        Retangulo retangulo = new Retangulo(entrada1, entrada2);

        int resultadoEsperado = 50;
        int resultadoObtido = retangulo.calcularArea();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void verificaCalculoAreaEntradaInvalida() {

        int entrada1 = 10, entrada2 = 0;

        Retangulo retangulo = new Retangulo(entrada1, entrada2);

        int resultadoEsperado = -1;
        int resultadoObtido = retangulo.calcularArea();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void verificaCalculoPerimetro() {
        int entrada1 = 10, entrada2 = 5;

        Retangulo retangulo = new Retangulo(entrada1, entrada2);

        int resultadoEsperado = 30;
        int resultadoObtido = retangulo.calcularPerimetro();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void verificaCalculoPerimetroEntradaInvalida() {
        int entrada1 = 10, entrada2 = 0;

        Retangulo retangulo = new Retangulo(entrada1, entrada2);

        int resultadoEsperado = -1;
        int resultadoObtido = retangulo.calcularPerimetro();

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void verificaLetrasOuNumerosValido() {
        String entrada = "Abc123";

        VerificadorNomenclatura verificadorNomenclatura = new VerificadorNomenclatura();

        boolean resultadoEsperado = true;
        boolean resultadoObtido = verificadorNomenclatura.verificar(entrada);

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void verificaLetrasOuNumerosInvalido() {
        String entrada = "Abc123!@";

        VerificadorNomenclatura verificadorNomenclatura = new VerificadorNomenclatura();

        boolean resultadoEsperado = false;
        boolean resultadoObtido = verificadorNomenclatura.verificar(entrada);

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void verificaComecoLetraValido() {
        String entrada = "Abc123";

        VerificadorNomenclatura verificadorNomenclatura = new VerificadorNomenclatura();

        boolean resultadoEsperado = true;
        boolean resultadoObtido = verificadorNomenclatura.verificar(entrada);

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void verificaComecoLetraInvalido() {
        String entrada = "0Abc123";

        VerificadorNomenclatura verificadorNomenclatura = new VerificadorNomenclatura();

        boolean resultadoEsperado = false;
        boolean resultadoObtido = verificadorNomenclatura.verificar(entrada);

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void verificaQuantidadeDeCaracteresValido() {
        String entrada = "Abc123";

        VerificadorNomenclatura verificadorNomenclatura = new VerificadorNomenclatura();

        boolean resultadoEsperado = true;
        boolean resultadoObtido = verificadorNomenclatura.verificar(entrada);

        assertEquals(resultadoEsperado, resultadoObtido);
    }

    @Test
    public void verificaQuantidadeDeCaracteresInvalido() {
        String entrada = "Abc123456";

        VerificadorNomenclatura verificadorNomenclatura = new VerificadorNomenclatura();

        boolean resultadoEsperado = false;
        boolean resultadoObtido = verificadorNomenclatura.verificar(entrada);

        assertEquals(resultadoEsperado, resultadoObtido);
    }

}
