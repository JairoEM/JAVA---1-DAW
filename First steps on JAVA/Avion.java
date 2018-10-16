public class Avion extends Vehiculo{
	protected int altura, despegado;
	public Avion (int x, int y, int estado, int direccion, int altura, int despegado){
		super (x, y, estado, direccion);
		this.altura=altura; // Eje z
		this.despegado=despegado; // despegado 1, no despegado 0
	}
	public Avion(){
		this (0, 0, 0, 1, 0, 0);
	}
	public void parar(){
		if((despegado==0)&(altura==0)){
			if(estado==1){
				estado=0;
				System.out.println("Has apagado el vehículo.");
			}else{
				System.out.println("El vehículo ya estaba apagado.");
			}
		}else{
			System.out.println("No puedes apagar el vehiculo,¡esta en el aire!");
		}
	}
	public void despegar(){
		if (estado==1){
			despegado=1;
			altura=1;
		}
	}
	public void subir(){
		if (despegado==1){
			altura++;
		}
	}
	public void subir(int n){
		if (despegado==1){
			altura=altura+n;
		}
	}
	public void bajar(){
		if (despegado==1){
			altura--;
			if (altura<=0){
				despegado=0;
				altura=0;
			}
		}
	}
	public void bajar(int n){
		if(despegado==1){
			altura=altura-n;
			if (altura<=0){
				despegado=0;
				altura=0;
			}
		}
		
	}
	public void imprimeEstado(){
		super.imprimeEstado();
		String nDespegado="no ha despegado";
		if (despegado==0){
			nDespegado="no ha despegado";
		}else{
			nDespegado="ha despegado";
		}
		System.out.println(", ademas, es un avion que esta a una altura de "+altura+" por lo que "+nDespegado+".");
	}
}
