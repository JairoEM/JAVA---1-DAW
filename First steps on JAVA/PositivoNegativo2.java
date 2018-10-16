import java.util.*;
public class PositivoNegativo2{
	public static void main (String[] arg){
		int num=-1, positivos=0, negativos=0;
		Scanner sc=new Scanner (System.in);
		while (num!=0){
			System.out.print("Introduce un numero: ");
			num=sc.nextInt();
			if(num>0){
				positivos++;
			}else{
				if(num<0){
					negativos++;
				}
			}		
		}
		System.out.println("Hay "+positivos+" numeros positivos.");
		System.out.println("Hay "+negativos+" numeros negativos.");
	}
}
