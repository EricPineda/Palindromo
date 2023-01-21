/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.palindromos;

import java.util.Scanner;

public class Palindromos {
 public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        String palabraInvertida = "";

        System.out.println("***Escribe una cadena***");
        String palabra = teclado.next();

        char caracter;

        for (int i = palabra.length() - 1; i >= 0; i--) {
            caracter = palabra.charAt(i);
            palabraInvertida += caracter;

        }

        System.out.println("Cadena ingresada: " + palabra.toUpperCase());
        System.out.println("Cadena invertida: " + palabraInvertida.toUpperCase());

        if (palabra.toUpperCase().equals(palabraInvertida.toUpperCase())) {
            System.out.println("SÍ es Palíndromo.");
        } else {
            System.out.println("NO es Palíndromo.");
        }

    }
}