import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.WINDOWS;

class CalculatorTest {

    Calculator calculadora = new Calculator();

    @Test
    @EnabledOnOs(WINDOWS)
    public void sumaTest() {
        assertEquals(10, calculadora.add(5, 5));
    }

    @Test
    @EnabledOnOs(LINUX)
    public void multiTest() {
        assertEquals(4, calculadora.multiply(2, 2));
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "DEV")
    void onlyInDev() {
        assertEquals(10, calculadora.add(5, 5));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    void paramsSuma(int num) {
        assertEquals((10 + num), calculadora.add(10, num));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    void paramsRest(int num) {
        assertEquals((2 * num), calculadora.multiply(2, num));
    }

    @Test
    @DisplayName("Suma de dos numeros pares")
    public void sumPar() {
        assertEquals(4, calculadora.add(2, 2));
    }

    @Test
    void imprimirVariablesAmbiente() {
        Map<String, String> getEnv = System.getenv();
        getEnv.forEach((k, v) -> System.out.println(k + " = " + v));
    }

}