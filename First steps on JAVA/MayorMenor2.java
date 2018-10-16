import java.util.*;
public class MayorMenor2{
	public static void main (String[] arg){
		Scanner sc=new Scanner (System.in);
		int mayor, menor, n;
		System.out.print("Introduce el primer numero: ");
		n=sc.nextInt();
		mayor=n;
		menor=n;
		do{
			if(n>mayor){
				mayor=n;
			}else{
				if (n<menor){
					menor=n;
				}
			}
			System.out.print("Introduce el siguiente numero: ");
			n=sc.nextInt();
		}while(n!=0);
		System.out.println("El numero mas grande es "+mayor);
		System.out.println("El numero mas pequeno es "+menor);
	}
}
