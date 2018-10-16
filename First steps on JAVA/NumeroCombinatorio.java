import java.util.*;
public class NumeroCombinatorio{
	public static void main (String[] arg){
		int a, b, i;
		Scanner sc=new Scanner (System.in);
		System.out.print("Introduce el primer valor: ");
		a=sc.nextInt();
		System.out.print("Introduce el segundo valor: ");
		b=sc.nextInt();
		int faca=1, facb=1, facab=1;
		for (i=1; i<=a; i++){
			faca*=i;
		}
		for (i=1; i<=b; i++){
			facb*=i;
		}
		for (i=1; i<=a-b; i++){
			facab*=i;
		}
		System.out.println("Combinatorio de "+a+" sobre "+b+" es "+(faca/(facb*facab)));
	}
}
