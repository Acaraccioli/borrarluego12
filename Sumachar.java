import java.util.Scanner;
class sumachar{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String nombre = sc.nextLine();
		int suma=0;
		
		for(int x=0; x < nombre.length(); x++){
			
			suma+=nombre.charAt(x);
			
		}
		System.out.println("Suma: "+suma);
		
		
	}
}
