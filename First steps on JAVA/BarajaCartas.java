public class BarajaCartas{
	protected Carta baraja[][];
	public BarajaCartas(){
		Carta baraja[][]=new Carta[4][10];
		int i, j;
		for(i=0; i<4; i++){
			for(j=0; j<10; j++){
				if(j<=6){
					baraja[i][j]=new Carta(i+1,j+1);
				}else{
					baraja[i][j]=new Carta(i+1,j+3);
				}
			}
		}
	public Carta sacaCarta(){	
		int numero=(int)(Math.random()*10);
		int palo=(int)(Math.random()*4);
		Carta carta=baraja[palo][numero];
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
