import java.util.*;
public class MediaAritmetica{
	public static void main (String[] arg){
		Scanner sc=new Scanner (System.in);
		int n, suma, cont=0, media;
		System.out.print("Introduce el primer numero: ");
		n=sc.nextInt();
		suma=n;
		while (n!=0){
			System.out.print("Introduce el siguiente numero: ");
			n=sc.nextInt();
			suma=suma+n;
			cont++;
		}
		media=(suma/cont);
		System.out.println("La media aritmetica es "+media);
	}
}
