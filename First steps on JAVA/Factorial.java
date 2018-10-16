public class Factoria{
	public static void main (String[] args){
		System.out.print("Introduce numero: ");
		int n= EntradaConsola.leeEntero();
		if(n<0){
			System.out.println(n+" no tiene factorial");
		}else{
			int fac=1;
			for(int i=1; i<=n; i++)
			fac*=i;
			System.out.println(n+"!= "+fac);
		}}}
