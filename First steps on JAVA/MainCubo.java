import java.util.*;
public class MainCubo{
	public static void main (String[] args){
		System.out.print("Introduce lado: ");
		Scanner sc=new Scanner (System.in);
		double lado;
		lado=sc.nextDouble();
		Cubo cubo= new Cubo(lado);
		System.out.println("Volumen: "+cubo.volumen());
		System.out.println("Area: "+cubo.area());
		System.out.println("Numero de Cubos: "+cubo.getNumObjetos());
	}
}
