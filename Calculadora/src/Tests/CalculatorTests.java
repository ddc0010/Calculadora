package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Calculator;

class CalculatorTests {

	@Test
    void testAdd() {
        Calculator calculator = new Calculator();
        int sumaEsperada = 5; 
        int sumaObtenida = calculator.sumar(2, 3);
        assertEquals(sumaEsperada, sumaObtenida);
    }
    
    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int restaEsperada = 1;
        int restaObtenida = calculator.restar(5, 4);
        assertEquals(restaEsperada, restaObtenida);
    }
    
    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        int productoEsperado = 6;
        int productoObtenido = calculator.multiplicar(2, 3);
        assertEquals(productoEsperado, productoObtenido);
    }
    
    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        int cocienteEsperado = 2;
        int cocienteObtenido = calculator.dividir(6, 3);
        assertEquals(cocienteEsperado, cocienteObtenido);
    }

}
