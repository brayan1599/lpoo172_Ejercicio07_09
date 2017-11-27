/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_09;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in); // Create a Scanner
		double[] numeros = new double[10]; // Create array of length 10

		// Prompt the user to enter ten numbers
		System.out.print("Ingrese diez numeros: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextDouble();
		}

		// Display the minimum value
		System.out.println("El número mínimo es: " + min(numeros));
	}

	/** Method min returns the smallest element in an array of double values */
	public static double min(double[] array) {
		double min = array[0];	// The minimum value
		for (double i: array) {
			if (i < min)
				min = i;
		}
		return min;
	}
}
