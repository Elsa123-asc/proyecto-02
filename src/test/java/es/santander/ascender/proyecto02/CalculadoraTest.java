package es.santander.ascender.proyecto02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {

    // Creamos una instancia de la clase Calculadora para usar en las pruebas
    Calculadora calculadora = new Calculadora();

    // Test para la suma
    @Test
    public void testSumar() {
        long sumando1 = 5;
        long sumando2 = 3;
        long resultadoEsperado = 8;
        
        long resultado = calculadora.sumar(sumando1, sumando2);
        
        // Comprobamos que el resultado de sumar 5 + 3 sea 8
        assertEquals(resultadoEsperado, resultado);
    }

    // Test para la resta
    @Test
    public void testRestar() {
        long sustraendo = 10;
        long minuendo = 4;
        long resultadoEsperado = 6;
        
        long resultado = calculadora.restar(sustraendo, minuendo);
        
        // Comprobamos que el resultado de restar 10 - 4 sea 6
        assertEquals(resultadoEsperado, resultado);
    }

    // Test para la multiplicación
    @Test
    public void testMultiplicar() {
        long factor1 = 4;
        long factor2 = 3;
        long resultadoEsperado = 12;
        
        long resultado = calculadora.multiplicar(factor1, factor2);
        
        // Comprobamos que el resultado de multiplicar 4 * 3 sea 12
        assertEquals(resultadoEsperado, resultado);
    }

    // Test para la división
    @Test
    public void testDividir() {
        long dividendo = 20;
        long divisor = 4;
        long resultadoEsperado = 5;
        
        long resultado = calculadora.dividir(dividendo, divisor);
        
        // Comprobamos que el resultado de dividir 20 / 4 sea 5
        assertEquals(resultadoEsperado, resultado);
    }

    // Test para la division por cero (debería lanzar una excepcion)
    @Test
    public void testDividirPorCero() {
        long dividendo = 20;
        long divisor = 0;
        
        // Comprobamos que se lance una excepcion ArithmeticException al dividir por cero
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(dividendo, divisor));
    
    }

    @Test 
    public void testpresentarTablaMultiplicar () {
        calculadora.presentarTablaMultiplicar(6);
    }

    @Test
    public void testCalcularTablaMultiplicar () {
        calculadora.calcularTablaMultiplicar(6);
    }

    @Test
    public void testCalcularTablaMultiplicarConwhile () {
        calculadora calculadora = new Calculadora ();
    }
}
