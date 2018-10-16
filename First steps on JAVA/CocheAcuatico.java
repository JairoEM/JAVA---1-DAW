public class CocheAcuatico extends Coche implements Sumergible{
	protected int profundidad;
	protected boolean medio, inmersion; 
	public CocheAcuatico(){
		super();
		profundidad=0;
		medio=true; // true tierra, false agua
		inmersion=false; // true inmerso, false no inmerso
	}
	public void cambioDeMedio(){
		if(medio==true){
			medio=false;
		}else{
			medio=true;
		}
	}
	public void inmersion(){
		if((estado==1)&(medio==false)){
			profundidad=-1;
			inmersion=true;
		}
	}
	public void ascender(int n){
		if((estado==1)&(medio==false)){
			profundidad=profundidad+n;
			if(profundidad>0){
				profundidad=0;
				medio=true;
				inmersion=false;
			}
		}
	}
	public void descender(int n){
		if((estado==1)&(medio==false)){
			profundidad=profundidad-n;
		}
	}
	public boolean estaInmerso(){
		return inmersion;
	}
	public boolean estaEnElAgua(){
		if(medio==false){
			return true;
		}else{
			return false;
		}
	}
	public void imprimeEstado(){ 
		super.imprimeEstado();
		String nInmersion, nMedio;
		if(inmersion==true){
			nInmersion=("esta inmerso");
		}else{
			nInmersion=("o esta inmerso");
		}
		if (medio==true){
			nMedio=("esta en tierra");
		}else{
			nMedio=("esta en agua");
		}
		System.out.print(" Además, el vehículo "+nMedio+" y "+nInmersion+".");
	}
}
