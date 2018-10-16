public class AreaTriangulo{
	public static void main (String []arg){
		double area, t, s1, s2, s3;
		System.out.print ("Introduce el valor del primer lado:");
		s1=EntradaConsola.leeReal();
		System.out.print ("Introduce el valor del segundo lado:");
		s2=EntradaConsola.leeReal();
		System.out.print ("Introduce el valor del tercer lado:");
		s3=EntradaConsola.leeReal();
		t=(s1+s2+s3)/2;
		area=Math.sqrt(t*(t-s1)*(t-s2)*(t-s3));
		System.out.println ("El valor del area del triangulo es "+area);
	}
}
