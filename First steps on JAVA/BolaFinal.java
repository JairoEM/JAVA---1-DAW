public class BolaFinal{
	public static void main (String[] arg){
		int bola1, bola2, bolaFinal;
		Urna urna1=new Urna(6, 6);
		do{			
			bola1=urna1.sacaBola();
			if (bola1==0){
				System.out.println("Ha salido una bola blanca.");
			}else{
				System.out.println("Ha salido una bola negra.");
			}
			bola2=urna1.sacaBola();
			if (bola2==0){
				System.out.println("Ha salido una bola blanca.");
			}else{
				System.out.println("Ha salido una bola negra.");
			}
			if(bola1==bola2){
				System.out.println("Metemos una bola negra.");
				urna1.negras++;
			}else{
				System.out.println("Metemos una bola blanca.");
				urna1.blancas++;
			}				
		}while (urna1.quedaMasDeUnaBola());
		bolaFinal=urna1.sacaBola();
		if (bolaFinal==0){
			System.out.println("La ultima bola es blanca.");
		}else{
			System.out.println("La ultima bola es negra.");
		}
	}
}
