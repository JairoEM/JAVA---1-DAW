import java.util.*;
public class Carrete{
	private static int numFotografias;
	private static int capCarrete;
	private static int fotosValidas;//Creamos Constructor
	public Carrete(int capCarrete){
		if(capCarrete==12 || capCarrete==24 || capCarrete==36){
			this.capCarrete=capCarrete;
		}else{
			this.capCarrete=12;
			numFotografias=0;
			fotosValidas=0;
		}
	}
	public Carrete(){
		this(12);//Se llama al otros constructor con el this
	}
	public int nuevaFoto(){
		if(SePuedeHacer()){
			numFotografias++;
		}else{
			System.out.println("El carrete está completo.");
		}
	}
	public boolean SePuedeHacer(){
		if(numFotografias < capCarrete){
			return true;
		}else{
			return false;
		}
	}
	public boolean estaLleno(){
		if(numFotografias == capCarrete){
			return true;
		}else{
			return false;
		}
	}
	public int fotosValidas(){
		return fotosValidas;
	}
	public int revelar(){
		for(int i=1; i<=numFotografias;i++){
			int aleatorio=(int)(Math.random()*100+1);
			if(aleatorio <=98){
				fotosValidas++;
			}
		}
		return fotosValidas;
	}
}
