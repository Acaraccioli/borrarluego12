import java.util.Scanner;
class Clase {
	public static void main(String[] args) {
		System.out.println((6+3)+("\n")+(6+8));
		System.out.println(7-4);
		System.out.println(8/3);
		System.out.println(9*2);
		System.out.println(10%5);
		System.out.println(6.8%3);
		/*
		*Enteros*
		byte (1 byte)
		short (2 byte)
		int (4 bytes)
		long (8 bytes)
		
		*Decimales*
		float (4 bytes)
		double (8 bytes)
		*/
		int prod1=190,prod2=567;
		String saludo="Hola";
		double descuento=(prod1+prod2)*.20, subtotal=prod1+prod2;
		boolean verdadero=true;
		char ochenta='P';
		
		System.out.println((ochenta+prod2)+("\n")+(prod1+prod2));
		System.out.println(saludo+" Usuario");
		//descuento
		System.out.println(("Subtotal:")+(subtotal));
		System.out.println(("Descuento:")+(descuento));
		System.out.println(("Total:")+(subtotal-descuento));
		
		Scanner sc = new Scanner(System.in);
	char d =sc.next().charAt(1);
	System.out.println(d+1);
	}
}