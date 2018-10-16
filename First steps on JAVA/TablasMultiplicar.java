import java.util.*;
public class TablasMultiplicar{
	public static void main (String[] arg){
		Scanner sc=new Scanner (System.in);
		int i, opt, n;
		System.out.println("MENU");
		System.out.println("_______________________________");
		System.out.println("Tabla de multiplicar del 1____1");
		System.out.println("Tabla de multiplicar del 2____2");
		System.out.println("Tabla de multiplicar del 3____3");
		System.out.println("Tabla de multiplicar del 4____4");
		System.out.println("Tabla de multiplicar del 5____5");
		System.out.println("Tabla de multiplicar del 6____6");
		System.out.println("Tabla de multiplicar del 7____7");
		System.out.println("Tabla de multiplicar del 8____8");
		System.out.println("Tabla de multiplicar del 9____9");
		System.out.println("Tabla de multiplicar del 10__10");
		System.out.println("_______________________________");
		do{
			opt=sc.nextInt();
			System.out.println("Tabla de multiplicar del "+opt);
			for (i=1;i<=10;i++){
				n=opt*i;
				System.out.println(opt+"x"+i+"="+n);
			}
			System.out.println("_______________________________");
		}while (opt!=0);
	}
}
			
		
