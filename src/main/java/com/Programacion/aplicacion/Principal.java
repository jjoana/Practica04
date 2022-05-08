package com.Programacion.aplicacion;


import com.Programacion.dominio.Distancia;
import java.util.Scanner;

/**
 * Clase principal de la aplicación.
 *
 * @author Jesus Joana Azuara
 */
public class Principal {
    /**
     * Método principal del programa que llama al método distanciaEdicion con el que se calcula la distancia de edición entre dos palabras.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Creación del objeto a través del Scanner para meter los datos.
        System.out.println("Introduzca la primera palabra:"); // se introduce la primera palabra...
        String palabra1 = scanner.nextLine(); // Se procede a leer
        System.out.println("Introduzca la segunda palabra:"); // Segunda palabra
        String palabra2 = scanner.nextLine(); // Lectura de ella
        Distancia calculadora = new Distancia(); // Se crea un objeto para calcular Distancia
        System.out.println("La distancia de edición entre las palabras es: " + Distancia.distanciaEdicicion(palabra1, palabra2));

    }
}

