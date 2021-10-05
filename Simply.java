package main;

public class SimpleExemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer.printShort("Exemple start");
		Printer.printShort( 1 );
		Printer.printShort( 0.1 );
	}

}


//
//class Printer {
//	public static void printShort (String value) {
//	System.out.println(" [ " + value + " ] ");
//	}
//	public static void printShort (int value) {
//		System.out.println(" [ " + value + " ] ");
//		}
//	public static void printShort (double value) {
//		System.out.println(" [ " + value + " ] ");
//		}
//}

			//polymorphism - > inheritance---
			//HW1-- DEPENDENCY INVERSION Principle
//class Printer {
//public static void printShort (Object value) {
//System.out.println(" [ " + value + " ] ");
//	}
//}

		//Generics
class Printer {
public static <T> void printShort (T value) {
System.out.println(" [ " + value + " ] ");
	}
}
