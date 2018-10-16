public class DivisionEntera{
	public static void main (String []arg){
		int num1, num2;
		System.out.print("Introduce el primer numero: ");
		num1=EntradaConsola.leeEntero();
		System.out.print("Introduce el segundo numero: ");
		num2=EntradaConsola.leeEntero();
		if ((num1%num2==0)|(num2%num1==0)){
			System.out.println("La division de ambos numeros entre si es entera.");
		}else{
			System.out.println("La division de ambos numeros entre si no es entera.");
		}}}
