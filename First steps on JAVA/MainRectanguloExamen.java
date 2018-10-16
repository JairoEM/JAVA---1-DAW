import java.util.*;
public class MainRectanguloExamen{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("Introduce coordenada x1: ");
		int x1=sc.nextInt();
		System.out.print("Introduce coordenada x2: ");
		int x2=sc.nextInt();
		System.out.print("Introduce coordenada y1: ");
		int y1=sc.nextInt();
		System.out.print("Introduce coordenada y2: ");
		int y2=sc.nextInt();
		Punto p1=new Punto(x1, y1);
		Punto q1=new Punto(x1, y2);
		Segmento s1=new Segmento(p1, q1);
		Punto p2=new Punto(x1, y1);
		Punto q2=new Punto(x2, y1);
		Segmento s2=new Segmento(p2, q2);
		RectanguloExamen rect=new RectanguloExamen(s1, s2);
		System.out.println("El valor del area será "+rect.area());
		System.out.println("El valor del perimetro será "+rect.perimetro());
	}
}
