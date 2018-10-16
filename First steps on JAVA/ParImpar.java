public class ParImpar{
	public static void main(String []arg){
		int n;
		System.out.print("Introduce el número que quieras comprobar: ");
		n=EntradaConsola.leeEntero();
		if (n%2==0){
			System.out.println(n+" es par.");
		}else{
			System.out.println(n+" es impar.");
		}
	}
}
		
