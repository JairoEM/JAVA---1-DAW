public class OperacionesAritmeticas{
	public static void main (String []arg){
		int num1, num2, opt;
		System.out.print("Introduce el primer numero: ");
		num1=EntradaConsola.leeEntero();
		System.out.print("Introduce el segundo numero: ");
		num2=EntradaConsola.leeEntero();
		System.out.println("MENU");
		System.out.println("Sumar________1");
		System.out.println("Restar_______2");
		System.out.println("Multiplicar__3");
		System.out.println("Dividir______4");
		System.out.print("Introduce que operacion deseas realizar: ");
		opt=EntradaConsola.leeEntero();
		switch (opt){
			case 1: System.out.println("La suma de ambos numeros es igual a "+(num1+num2));break;
			case 2: System.out.println("La resta de ambos numeros es igual a "+(num1-num2));break;
			case 3: System.out.println("La multiplicacion de ambos numeros es igual a "+(num1*num2));break;
			case 4: System.out.println("La division de ambos numeros es igual a "+(num1/num2));break;
		}}}
