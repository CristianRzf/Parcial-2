package Ejercicios;

import java.util.Scanner;

public class Frase {
	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("digita tu frase: ");
				String frase = scanner.nextLine();
				
				char[] caracteres = frase.toCharArray();
				
				System.out.println("Los caracteres de tu frase son: ");
				for (char c : caracteres) {
				    System.out.print(c + " ");
				}
			}
	    }
	}
