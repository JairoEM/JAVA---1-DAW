import java.util.*;
public class Multiplos3{
	public static void main (String[] arg){
		int num1, num2, i, menor, mayor;
		Scanner sc=new Scanner (System.in);
		System.out.print("Introduce el primer numero: ");
		num1=sc.nextInt();
		System.out.print("Introduce el segundo numero: ");
		num2=sc.nextInt();
		if (num1>num2){
			menor=num2;
			mayor=num1;
		}else{
			menor=num1;
			mayor=num2;
		}
		for (i=menor;i<=mayor;i++){
			if ((i%3)==0){
				System.out.println("El numero "+i+" es multiplo de tres.");
			}
		}
	}
}
