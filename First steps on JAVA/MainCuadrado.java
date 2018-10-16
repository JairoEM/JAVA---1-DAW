import java.util.*;
public class MainCuadrado{
	public static void main (String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("Introduce el lado: ");
		double lado;
		lado=sc.nextDouble();
		CuadradoExtends cuadrado1 = new CuadradoExtends(lado);
		System.out.println("Area="+cuadrado1.area());
		System.out.println("Perimetro="+cuadrado1.perimetro());
		System.out.println("Numero de objetos="+cuadrado1.getNumObjetos());
		CuadradoExtends cuadrado2 = new CuadradoExtends(lado);
		System.out.println("Area="+cuadrado2.area());
		System.out.println("Perimetro="+cuadrado2.perimetro());
		System.out.println("Numero de objetos="+cuadrado2.getNumObjetos());	
	}
}
