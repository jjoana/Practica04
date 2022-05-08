package com.Programacion.dominio;

/**
 * Clase que calcula la distancia entre dos puntos
 *
 * @author Jesus Joana Azuara
 */
public class Distancia {

    /**
     * Método que calcula el mínimo de 3 valores.
     *
     * @param a valor
     * @param b valor a insertar
     * @param c vvalor que se va a sustituir
     * @return valor minimo
     */
    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    /**
     * Método que calcula la distancia de edicion entre dos palabras (String).
     *
      @param X 
      @param Y 
      @return distancia de edicion
     */
    public static int distanciaEdicicion(String X, String Y) {
        int n = X.length();
        int m = Y.length();
        int D[][] = new int[n + 1][m + 1];  //  matriz de dos dimensiones, con n+1 filas y m+1 columnas
        for (int i = 0; i <= n; i++) {     //  la primera fila
            D[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {    //  la primera columna
            D[0][j] = j;
        }
        for (int i = 1; i <= n; i++) {   // elemento que recorre la matriz por filas
            for (int j = 1; j <= m; j++) {  // elemento que recorre la matriz por columnas
                D[i][j] = min(D[i - 1][j] + 1, D[i][j - 1] + 1, D[i - 1][j - 1] + (X.charAt(i - 1) == Y.charAt(j - 1) ? 0 : 1 + 1));
                // calcula la distancia de edición con los distintos casos: a (deletion), b (insertion), c (substitution).
            }
        }
        return D[n][m];
    }
}

