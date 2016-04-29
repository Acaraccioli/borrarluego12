import java.util.Scanner;
class EjBaleada{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		sc.useDelimiter("\n");
		String nomcliente;
		int numbaleadas,subtotal,opcion;
		double impuesto,total,recargo;
		System.out.println("Bienvenidos a Cyber Baleadas \nCual es tu nombre?");
		nomcliente = sc.next();
		System.out.println("Cuantas baleadas va a querer "+nomcliente+"?");
		numbaleadas=sc.nextInt();
		System.out.println("Estas baleadas las va a querer para llevar o comer aqui? \n Opciones: \n Ingrese 0 para comer aqui \n Ingrese 1 para llevar");
		opcion = sc.nextInt();
		
		
		subtotal = numbaleadas*20;
		impuesto = subtotal*.7;
		recargo=(numbaleadas*opcion)*.5;
		total=subtotal+impuesto+recargo;
		System.out.println("Subtotal: Lps."+subtotal+"\nRecargo: Lps."+recargo+"\nImpuesto: Lps."+impuesto+"\nTotal: Lps."+total+" por "+numbaleadas+" baleadas");