/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.conversionbinarios;

/**
 *
 * @author MSIBRAVO
 */
public class Operacion {
    public static String decimalABinario(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();

        while (decimal > 0) {
            binario.insert(0, decimal & 1);
            decimal = decimal >> 1;
        }

        return binario.toString();
    }

    public static void main(String[] args) {
        int numeroDecimal = 90;
        String representacionBinaria = decimalABinario(numeroDecimal);
        System.out.println("El número decimal " + numeroDecimal + " en binario es: " + representacionBinaria);
    }
}
