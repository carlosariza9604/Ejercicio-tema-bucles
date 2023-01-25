package com.carlos;
/* En este ejercicio tenéis que crear un bucle que permita concatenar textos e
imprima el resultado final por consola.
 */


public class Bucle {
    public static void main(String[] args) {
        String [] nombres= {"Carlos","Camilo","karen", };
        for (int i=2;i< nombres.length;i++){
            System.out.println(nombres[0]+ " "+  nombres[1] +" " + nombres[2]);
        }
    }
}
