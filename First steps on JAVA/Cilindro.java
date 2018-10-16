public class Cilindro extends Circulo{
	protected double altura;
	public Cilindro (double radio, double altura){
		super (radio);
		this.altura=altura;
	}
	public Cilindro(){
		this(1.0,1.0);
	}
	public double area(){
		double areaLateral, areaBase;
		areaLateral=2*(Math.PI)*radio*altura;
		areaBase=2*(Math.PI)*radio*radio;
		return areaLateral+areaBase;
	}
	public double volumen(){
		return altura*radio*radio*(Math.PI);
	}
}
	
