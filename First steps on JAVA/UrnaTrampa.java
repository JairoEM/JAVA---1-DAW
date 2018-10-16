public class UrnaTrampa extends Urna{
	public UrnaTrampa(int blancas, int negras){
		super(blancas, negras);
	}	
	public boolean quedanBolas(){
		if(totalBolas()>0){
			return true;
		}
		return false;
		
	}
	public int sacaBola(){ // 0=blanca, 1=negra
		int cBola, aux, urnaTrampa;
		if(quedanBolas()==true){
			urnaTrampa=(int)(Math.random()*1000+1);
			if(urnaTrampa<=2){
				aux=(int)(Math.random()*2+1);
				if(aux==1){
					blancas--;
					negras++;
				}else{
					blancas++;
					negras--;
				}
			}
		}
		cBola=(int)(Math.random()*totalBolas()+1);
		if(cBola<=blancas){
			blancas--;
			return 0;
		}else{
			negras--;
			return 1;
		}		
	}
}
