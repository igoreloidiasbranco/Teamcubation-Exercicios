import org.example.Imprimir;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ImprimirTest {

    private Imprimir imprime;

    @BeforeEach
    public void setup() {
        imprime = new Imprimir();
    }


    @Test
    @DisplayName("Cenário que retorna uma String com valor Fizz")
    public void imprimirRetornoFizzTest() {
        String resultado = imprime.imprimir(3);
        Assertions.assertEquals("Fizz", resultado);
    }

    @Test
    @DisplayName("Cenário que retorna uma String com valor Buzz")
    public void imprimirRetornoBuzzTest() {
        String resultado = imprime.imprimir(5);
        Assertions.assertEquals("Buzz", resultado);
    }

    @Test
    @DisplayName("Cenário que retorna uma String com valor FizzBuzz")
    public void imprimirRetornoFizzBuzzTest() {
        String resultado = imprime.imprimir(15);
        Assertions.assertEquals("FizzBuzz", resultado);
    }

    @Test
    @DisplayName("Cenário que retorna uma String vazia")
    public void imprimirRetornoStringVaziaTest() {
        String resultado = imprime.imprimir(1);
        Assertions.assertEquals("", resultado);

    }
}
