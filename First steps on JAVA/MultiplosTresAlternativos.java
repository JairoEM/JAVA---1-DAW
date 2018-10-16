public class MultiplosTresAlternativos{
	public static void main (String[] arg){
		int desde, hasta, i;
		boolean imprime=true;
		System.out.print("Introduce el primer numero: ");
		desde= EntradaConsola.leeEntero();
		System.out.print("Introduce el segundo numero: ");
		hasta= EntradaConsola.leeEntero();
		for(i=desde; i<=hasta; i++){
			if(i%3==0){
				if(imprime==true){
					System.out.println(i);
					imprime=false;
				}else{
					imprime=true;
				}
			}
		}
	}
}
		
