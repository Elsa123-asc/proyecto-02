package es.santander.ascender.proyecto02;

public class Calculadora {
    public long sumar (long sumando1, long sumando2) {
        return sumando1 + sumando2; 
    }

    public long restar (long substraendo, long minuendo) {
        return substraendo - minuendo;
    }

    public long multiplicar (long factor1, long factor2) {
        return factor1 * factor2;
    }

    public long dividir (long dividendo, long divisor) {
        return dividendo / divisor;
    }

    public void presentarTablaMultiplicar (int numero) {
        for (int i = 0 ; i <= 10; i = i + 1 ) {
            System.out.println( i * numero);

        }
    }
}
