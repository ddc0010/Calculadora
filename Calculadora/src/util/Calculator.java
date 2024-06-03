package util;

public class Calculator {
	
	/**
     * Suma dos numeros enteros.
     * 
     * @param a el primer numero.
     * @param b el segundo numero.
     * @return la suma de a y b.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos numeros enteros.
     * 
     * @param a el primer numero.
     * @param b el segundo numero.
     * @return la resta de a y b.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos numeros enteros.
     * 
     * @param a el primer numero.
     * @param b el segundo numero.
     * @return el producto de a y b.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos numeros enteros.
     * 
     * @param a el dividendo.
     * @param b el divisor.
     * @return el cociente de a y b.
     * @throws IllegalArgumentException si b es 0.
     */
    public int dividir(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser 0");
        }
        return a / b;
    }

}
