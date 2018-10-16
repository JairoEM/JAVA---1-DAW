public class Coche extends Vehiculo{
	protected String modelo, matricula, color;
	public Coche (int x, int y, int estado, int direccion, String modelo, String matricula, String color){
		super (x, y, estado, direccion);
		this.modelo=modelo;
		this.matricula=matricula;
		this.color=color;
	}
	public Coche(){
		this(0, 0, 0, 1, "Mercedes SLK", "1992FCK", "gris plateado");
	}
	public String getModelo(){
		return modelo;
	}
	public String getMatricula(){
		return matricula; 
	}
	public String getColor(){
		return color;
	}
	public void imprimeEstado(){ 
		super.imprimeEstado();
		System.out.print(", su modelo es "+modelo+", su matricula "+matricula+" y es de color "+color+".");
	}
}
	
