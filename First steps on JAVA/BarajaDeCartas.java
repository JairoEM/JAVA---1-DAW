public class BarajaDeCartas{ //corregido
	protected Carta baraja[][];
	public BarajaDeCartas(){
		Carta baraja[][]=new Carta[4][10];
		int i, j;
		for(i=0; i<=3; i++){
			for(j=0; j<=9; j++){
				if(j<=6){
					baraja[i][j]=new Carta(i,j);
				}else{
					baraja[i][j]=new Carta(i,j+3);
				}
			}		
		}	
	}
	public Carta sacaCarta(){
		int numero=(int)(Math.random()*10);
		int palo=(int)(Math.random()*4);
		Carta carta=carta[palo][numero];
		if (quedanCartas()){
			return carta;
		}else{
			System.out.print("No queda ninguna carta");
			return null;
		}
	}
	public boolean quedanCartas(){
		for (int i=0;i<=3 ;i++ ){
			for (int j=0;j<=9;j++ ){
				if (baraja[i][j] !=null){
					return true;
				}
			}
		}
		return false;	
	}
	public void meteCarta(Carta carta){
		baraja [carta.palo-1][carta.numero-1]=carta;	
	}
}
