public class Circulo{
	protected double radio;
	public Circulo (double radio){
		this.radio=radio;
	}
	public Circulo(){
		this(1.0);
	}
	public double area(){
		return (Math.PI)*radio*radio;
	}
	public double diametro(){
		return 2*(Math.PI)*radio;
	}
}
