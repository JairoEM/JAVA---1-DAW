public class HipotenusaTrianguloRectangulo{
	public static void main(String []arg){
		double n, m, hipotenusa;
		System.out.print("Introduce el valor del primer cateto:");
		n=EntradaConsola.leeReal();
		System.out.print("Introduce el valor del segundo cateto:");
		m=EntradaConsola.leeReal();
		hipotenusa=Math.sqrt((n*n)+(m*m));
		System.out.print("El valor de la hipotenusa es "+hipotenusa);
	}
}
