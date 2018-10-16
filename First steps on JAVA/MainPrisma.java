import java.util.*;
public class MainPrisma{
	public static void main (String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("Introduce el ancho: ");
		double ancho;
		ancho=sc.nextDouble();
		System.out.print("Introduce el largo: ");
		double largo;
		largo=sc.nextDouble();
		System.out.print("Introduce el alto: ");
		double alto;
		alto=sc.nextDouble();
		Prisma prisma1=new Prisma (ancho, largo, alto);
		System.out.print("El volumen del prisma es "+prisma1.volumen());
	}
}
