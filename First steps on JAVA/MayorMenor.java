public class MayorMenor{
	public static void main (String[] arg){
		int mayor, menor, n;
		System.out.print("Introduce el primer numero: ");
		n=EntradaConsola.leeEntero();
		mayor=n;
		menor=n;
		while (n!=0){
			if (n>mayor){
				mayor=n;
			}else{
				if (n<menor){
					menor=n;
				}
			}
			System.out.print("Introduce el siguiente numero: ");
			n=EntradaConsola.leeEntero();
		}
		System.out.println("El numero mas grande es "+mayor);
		System.out.println("El numer mas pequeno es "+menor);
	}
}
