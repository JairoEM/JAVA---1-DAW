import java.util.*;
public class Punto{
	protected int x, y;
	public Punto (int x, int y){
		this.x=x;
		this.y=y;
	}
	public double distancia(int px, int py){
		double distancia;
		distancia=Math.sqrt(((px-x)*(px-x))+((py-y)*(py-y)));
		return distancia;
	}
	public double distancia(Punto p){
		double distancia;
		int x2=p.x;
		int y2=p.y;
		distancia=Math.sqrt(((x2-x)*(x2-x))+((y2-y)*(y2-y)));
		return distancia;
	}
	public int getX(){return x;}
	public int getY(){return y;}
}
	
