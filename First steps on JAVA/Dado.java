import java.util.*;
import java.math.*;
public class Dado{
	public static void main (String[] arg){
		Scanner sc=new Scanner (System.in);
		int i=0, dado, cont=0;
		do{
			dado=(int)(Math.random()*6+1);
			switch (dado){
				case 1: System.out.println("1");break;
				case 2: System.out.println("2");break;
				case 3: System.out.println("3");break;
				case 4: System.out.println("4");break;
				case 5: System.out.println("5");break;
				case 6: System.out.println("6");cont++;break;
				}
				i++;
			}while (i<=100);
			System.out.println("El numero 6 ha salido "+cont+" veces");
		}
	}

		
