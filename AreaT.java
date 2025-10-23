import java.util.Scanner;
public class AreaT{
	public static void main(String args []){
		Scanner pou = new Scanner (System.in);
		float base = 0, altura = 0, are=0;
		System.out.println("\n\t**Áreas Triangulos**");
		System.out.println("Por favor, escribe la base del triángulo");
		base=pou.nextFloat();
		System.out.println("Escribe la altura del triángulo");
		altura=pou.nextFloat();
		are=(altura*base)/2;
		System.out.println("El área del triángulo es: " +are);
	}
}