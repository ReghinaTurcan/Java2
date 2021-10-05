package main;

public class Box {

	public static void main(String[] args) {
		Boxx<Integer> ib = new Boxx<>(100); //row type
		Boxx ib1 = new Boxx("ewewe");
		Boxx ib2 = new Boxx(0.002);
	
		System.out.println(ib.value);
		System.out.println(ib1.value);
		System.out.println(ib2.value);

	}

}
 
				//HW2 different clases
//class Boxx {
//	int value;
//	public Boxx (int value) {
//		this.value = value;
//	}
//	String value1;
//	public Boxx (String value1) {
//		this.value1 = value1;
//	}
//	double value2;
//	public Boxx (double value2) {
//		this.value2 = value2;
//	}
//	
//}
				//HW2 polymorphism + inheritance
//class Boxx {
//	Object value;
//	public Boxx (Object value) {
//		this.value = value;
//	}
//}

			//Generics
			class Boxx <T> {
			T value;
				Boxx (T value) {
				this.value = value;
				}
			}

