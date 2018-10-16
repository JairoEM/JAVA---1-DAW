import java.util.*;
import java.math.*;
public class HolaAdios{
	public static void main (String[] arg){
		int i=0;
		do{
			int n;
			n= (int)(Math.random()*2+1);
			switch (n){
			case 1: System.out.println("Hola");break;
			case 2: System.out.println("Adios");break;
			}
			i++;
		}while(i!=100);
	}
}
