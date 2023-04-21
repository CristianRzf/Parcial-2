package Ejercicios;

import java.util.Scanner;

public class Libro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" Primwr libro ::");
		System.out.print("ISBN ");
		String ISBN1 = scanner.nextLine();
		System.out.print("Título ");
		String TITULO1 = scanner.nextLine();
		System.out.print("Autor ");
		String AUTOR1 = scanner.nextLine();
		System.out.print("Número de páginas ");
		int numeroPaginas2 = scanner.nextInt();
		scanner.nextLine();

		Libro libro1 = new Libro();

		System.out.println("Segundo libro :");
		System.out.print("ISBN: ");
		String ISBN2 = scanner.nextLine();
		System.out.print("Título: ");
		String TITULO2 = scanner.nextLine();
		System.out.print("Autor: ");
		String AUTOR2 = scanner.nextLine();
		System.out.print("Número de páginas: ");
		int numeroPaginas = scanner.nextInt();
		Libro libro2 = new Libro();

		if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
			System.out.println("El libro con más páginas es: " + libro1.getTitulo());
		} else if (libro2.getNumeroPaginas() > libro1.getNumeroPaginas()) {
			System.out.println("El libro con más páginas es: " + libro2.getTitulo());
		} else {
			System.out.println("LOs dos libros tienen el mismo número de páginas.");
		}
	}

	private String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}

	private int getNumeroPaginas() {
		// TODO Auto-generated method stub
		return 0;
	}
}
