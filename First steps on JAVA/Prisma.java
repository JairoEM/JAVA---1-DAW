import java.util.*;
public class Prisma extends Rectangulo{
	private double alto;
	public Prisma (double ancho, double largo, double alto){
		super(ancho, largo);
		this.alto=alto;
	}
	public Prisma(){
		this(1.0,2.0,3.0);
	}
	public double volumen(){
		return ancho*largo*alto;
	}
	public double area(){
		return ancho*largo*alto*2;
	}
}
