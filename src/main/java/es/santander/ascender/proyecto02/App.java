
package es.santander.ascender.proyecto02;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Crear una instancia de la clase Calculadora
        Calculadora calculadora = new Calculadora();
        
        // Llamar al método sumar usando el objeto calculadora
        long resultado = calculadora.sumar(4, 5); // Usamos el objeto calculadora y el método sumar
        
        // Mostrar el resultado en consola
        System.out.println(resultado);
    }
}
