import java.util.*;
public class NombreNota{
	public static void main (String[] arg){
		int nota;
		Scanner sc=new Scanner (System.in);
		do{
			System.out.print("Introduce una nota: ");
			nota=sc.nextInt();
		}while (nota<0 || nota>10);
		switch (nota){
			case 0:
			case 1:
			case 2: System.out.println("Muy deficiente.");break;
			case 3:
			case 4: System.out.println("Deficiente.");break;
			case 5: System.out.println("Suficiente.");break;
			case 6: System.out.println("Bien.");break;
			case 7:
			case 8: System.out.println("Notable.");break;
			case 9:
			case 10: System.out.println("Sobresaliente");break;
		}
	}
}
