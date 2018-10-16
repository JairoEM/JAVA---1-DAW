public class Carta{
	protected int numero, palo;
	public Carta(int numero, int palo){
		this.numero=numero;
		this.palo=palo;
	}
	public Carta(){
		this(1,1);
	}
	public void visualizarCarta(){
		if(numero <= 7){
			System.out.print(" "+numero+" de ");
		}else{
			if(numero == 10){
			System.out.print(" sota de ");
			}else{
				if(numero == 11){
					System.out.print(" caballo de ");
				}else{
					if(numero == 12){
						System.out.print(" rey de ");
					}
				}
			}
		}
		switch (palo){
			case 1: 
				System.out.println("oros");break;
			case 2:
				System.out.println("copas");break;
			case 3:
				System.out.println("bastos");break;
			case 4:
				System.out.println("espadas");
		}
	}
	public double valorCarta(){
		if(numero == 10 || numero == 11|| numero == 12)
			return 0.5;
		return numero;		
	}
}
