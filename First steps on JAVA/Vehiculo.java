public class Vehiculo{
	protected int x, y, estado, direccion; 
	public Vehiculo (int x, int y, int estado, int direccion){
		this.x=x;
		this.y=y;
		this.estado=estado; // arrancado 1, no arrancado 0
		this.direccion=direccion; // norte 0, este 1, sur 2, oeste 3
	}
	public Vehiculo(){
		this(0, 0, 0, 1);
	}
	public void parar(){
		if(estado==1){
			estado=0;
			System.out.println("Has apagado el vehiculo.");
		}else{
			System.out.println("El vehiculo ya estaba apagado.");
		}
	}
	public void arrancar(){
		if(estado==0){
			estado=1;
			System.out.println("Has encendido el vehiculo.");
		}else{
			System.out.println("El vehiculo ya estaba encendido.");
		}
	}
	public void mover(){
		if (estado==1){
			switch (direccion){
				case 0: y++; break;
				case 1: x++; break;
				case 2: y--; break;
				case 3: x--; break;
			}
		}
	}
	public void mover(int n){
		if (estado==1){
			switch (direccion){
				case 0: y=y+n; break;
				case 1: x=x+n; break;
				case 2: y=y-n; break;
				case 3: x=x-n; break;
			}
		}
	}
	public void girar(int giro){
		if (estado==1){
			giro=(giro%4);
			direccion=direccion+giro;
			if (direccion>3){
				direccion=direccion-4;
			}
		}
	}
	public boolean estaArrancado(){
		if(estado==0){
			return false;
		}else{
			return true;
		}
	}
	public int getDireccion(){
		return direccion;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void imprimeEstado(){
		String nEstado="apagado", nDireccion="este";
		if(estado==0){
			nEstado="apagado";
		}else{
			nEstado="encendido";
		}
		switch (direccion){
			case 0: nDireccion="norte"; break;
			case 1: nDireccion="este"; break;
			case 2: nDireccion="sur"; break;
			case 3: nDireccion="oeste"; break;
		}
		System.out.print("El vehiculo esta "+nEstado+", apuntando hacia el "+nDireccion+" y en las coordenadas x="+x+" e y="+y);
	}
}
