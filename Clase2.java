import java.util.Scanner;
class Clase2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		sc.useDelimiter("\n");
		String mon="Hola. ", ica="Como te llamas?";
		int d;
		double t=3.927;
		char cientosiete='k';
		System.out.println(mon+ica);
		String nombre=sc.next();
		cientosiete=nombre.charAt(0);
	//
		System.out.println(("Mucho gusto ")+nombre);
		System.out.println("Cual es tu edad?");
		d=sc.nextInt();
		System.out.println(d+("?????? Estas Viejo!!!" ));
		
		nombre.charAt(0);
		System.out.println("Tu numero en la tabla ascii es: "+((1+cientosiete)-1));
		
		
	}
}