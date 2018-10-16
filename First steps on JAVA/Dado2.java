import java.util.*;
import java.math.*;
public class Dado2{
	public static void main (String[] arg){
		Scanner sc=new Scanner (System.in);
		int dado1, dado2, cont=0, i;
		char continuar;
		do{
			for (i=0;i<=100;i++){
				dado1=(int)(Math.random()*6+1);
				dado2=(int)(Math.random()*6+1);
				if (dado1+dado2==10){
					cont++;
				}
				switch (dado1){
				case 1: System.out.print("El primer dado saca 1");break;
				case 2: System.out.print("El primer dado saca 2");break;
				case 3: System.out.print("El primer dado saca 3");break;
				case 4: System.out.print("El primer dado saca 4");break;
				case 5: System.out.print("El primer dado saca 5");break;
				case 6: System.out.print("El primer dado saca 6");break;
				}
				switch (dado2){
				case 1: System.out.println(" y el segundo dado saca 1.");break;
				case 2: System.out.println(" y el segundo dado saca 2.");break;
				case 3: System.out.println(" y el segundo dado saca 3.");break;
				case 4: System.out.println(" y el segundo dado saca 4.");break;
				case 5: System.out.println(" y el segundo dado saca 5.");break;
				case 6: System.out.println(" y el segundo dado saca 6.");break;		
				}
			}
			System.out.println("Ambos dados han sumado diez "+cont+" veces.");
			System.out.println("¿Desea volver a repetir las cien tiradas? S/N");
			continuar=sc.next().charAt(0);
			cont=0;
		}while(continuar=='S'||continuar=='s');
	}
}
			
