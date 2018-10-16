public class TresNumeros{
	public static void main (String []arg){
		int num1, num2, num3;
		System.out.print("Introduce el primero numero: ");
		num1=EntradaConsola.leeEntero();
		System.out.print("Introduce el segundo numero: ");
		num2=EntradaConsola.leeEntero();
		System.out.print("Introduce el tercer numero: ");
		num3=EntradaConsola.leeEntero();
		if (num1>num2){
			if (num1>num3){
				System.out.println(num1+" es el numero mayor.");
			}else{
				if (num3>num2){
					System.out.println(num3+" es el numero mayor.");
				}
			}
		}else{
			if (num2>num3){
				System.out.println(num2+" es el numero mayor.");
			}else{
				System.out.println(num3+" es el numero mayor.");
			}}}}
