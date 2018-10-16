import java.util.*;
import java.math.*;
public class Moneda{
	public static void main (String[] arg){
		char continuar;
		Scanner sc=new Scanner (System.in);
		do{
			int moneda;
			moneda= (int)(Math.random()*2+1);
			switch (moneda){
			case 1: System.out.println("Cara");break;
			case 2: System.out.println("Cruz");break;
			}
			System.out.print("Pulsa S si deseas continuar...");
			continuar=sc.next().charAt(0);
		}while(continuar=='S'||continuar=='s');
	}
}
