import java.util.*;
public class Vegetales extends SerVivo {
	protected String partes[];
	public Vegetales(String nombreC, String nombreV, String partes[]){
		super(nombreC, nombreV);
		this.partes=partes;	
	}
	public void visualizarPartes(){
		for(int i=0;i<partes.length; i++){
			System.out.print(" "+partes[i]);
		}
	}
	public void describete(){
		super.describete();
		visualizarPartes();
	}		
}
