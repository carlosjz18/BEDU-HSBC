package com.example.ejemplo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @BeforeEach
    void setUp() {
        System.out.println("Me ejecuto antes de cada caso de prueba");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Me ejecuto al último de cada caso de prueba");
    }

    @Test
    @DisplayName("Prueba suma")
    void sumaTest() {
        int esperado = 5;
        assertEquals(esperado, calculadora.suma(3, 2));
    }

    @Test
    @DisplayName("Prueba resta")
    void restaTest() {
        int esperado = 1;
        assertEquals(esperado, calculadora.resta(3, 2));
    }

    @Test
    @DisplayName("Prueba multiplicación")
    void multiplicaTest() {
        int esperado = 6;
        assertEquals(esperado, calculadora.multiplica(3, 2));
    }

    @Test
    @DisplayName("Prueba división")
    void divideTest() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.divide(100, 0), "No es posible dividir un valor entre 0");
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void sumaTestTablaValores(int a, int b, int c) {
        assertEquals(c, calculadora.suma(a, b));
    }

    private static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(10, 10, 20),
                Arguments.of(1, 10, 11),
                Arguments.of(22, 23, 45),
                Arguments.of(5, 33, 38),
                Arguments.of(3, 3, 6)
        );
    }
}