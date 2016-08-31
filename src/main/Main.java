package main;

import complex_ug.Complex;

public class Main {

	public static void main(String[] args) {
		Complex complejo1 = new Complex(3,2);
		Complex complejo2 = new Complex(5,10);
		Complex complejo3 = new Complex(0,0);
		Complex complejo4 = new Complex(0,0);
		Complex complejo5 = new Complex(0,0);
		
		complejo3.sum(complejo1, complejo2);
		complejo4.sub(complejo1, complejo2);
		complejo5.mult(complejo1, complejo2);
		
		System.out.println("Suma: Real = " + complejo3.getReal() + " " + "Img = " + complejo3.getImg());
		System.out.println("Resta: Real = " + complejo4.getReal() + " " + "Img = " + complejo4.getImg());
		System.out.println("Multiplicacion: Real = " + complejo5.getReal() + " " + "Img = " + complejo5.getImg());
	}

}
