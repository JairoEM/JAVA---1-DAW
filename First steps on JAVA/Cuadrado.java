import java.util.*;
public class Cuadrado{
	private double lado;
	public Cuadrado (double lado){
		this.lado=lado;
	}
	public double area(){
		return lado*lado;
	}
	public double perimetro(){
		return 4*lado;
	}
}
