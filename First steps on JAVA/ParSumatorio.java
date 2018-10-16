import java.util.*;
public class ParSumatorio{
	public static void main (String[] arg){
		Scanner sc=new Scanner (System.in);
		int num1, num2, i, mayor, menor, suma=0, pares=0;
		System.out.print("Introduce el primer numero: ");
		num1=sc.nextInt();
		System.out.print("Introduce el segundo numer: ");
		num2=sc.nextInt();
		if (num1>num2){
			mayor=num1;
			menor=num2;
		}else{
			mayor=num2;
			menor=num1;
		}
		if (menor%2!=0){
			menor=menor+1;
		}
		for(i=menor;i<=mayor;i+=2){
			System.out.println(i);
			suma=suma+i;
			pares++;
		}	
		System.out.println("Entre los dos numeros hay "+pares+" numeros pares");
		System.out.println("La suma de todos los numeros pares es "+suma);
	}
}
				
