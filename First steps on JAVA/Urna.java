public class Urna{
	protected int blancas, negras;
	public Urna (int blancas, int negras){
		this.blancas=blancas;
		this.negras=negras;
	}
	public Urna (){ // Constructor por defecto en caso de que no pongan valores
		this(10,10); // 10 bolas blancas, 10 bolas negras
	}
	public int sacaBola(){ // 0=blanca, 1=negra
		int cBola;
		cBola=(int)(Math.random()*totalBolas()+1);
		if(cBola<=blancas){
			blancas--;
			return 0;
		}else{
			negras--;
			return 1;
		}		
	}
	public void meteBola(int color){
		if (color==1){
			negras++;
		}
		if(color==0){
			blancas++;
		}
	}
	public boolean quedanBolas(){
		if(totalBolas()>0){
			return true;
		}else{
			return false;
		}
	}
	public boolean quedaMasDeUnaBola(){
		if(totalBolas()>1){
			return true;
		}else{
			return false;
		}
	}
	public int totalBolas(){return blancas+negras;}
}
			
