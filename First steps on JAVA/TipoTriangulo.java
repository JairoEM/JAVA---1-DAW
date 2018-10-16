public class TipoTriangulo{
	public static void main(String []arg){
		double A, B, C;
		System.out.print("Introduce el mayor lado: ");
		A=EntradaConsola.leeReal();
		System.out.print("Introduce el segundo lado: ");
		B=EntradaConsola.leeReal();
		System.out.print("Introduce el tercer lado: ");
		C=EntradaConsola.leeReal();
		if ((A*A)==(B*B)+(C*C)){
			System.out.println("El triangulo es rectangulo.");
		}else{
			if ((A*A)>(B*B)+(C*C)){
				System.out.println("El triangulo es obtusangulo");
			}else{
				if ((A*A)<(B*B)+(C*C)){
					System.out.println("El triangulo es acutangulo");
				}else{
					System.out.println("No es un triángulo");
				}}}}}
			
			
