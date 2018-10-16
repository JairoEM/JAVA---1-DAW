import java.util.*;
public class Segmento{
	protected Punto p, q;
	public Segmento(Punto p, Punto q){
		this.p=p;
		this.q=q;
	}
	public double longitudSegmento(){
		return p.distancia(q);
	}
}
		
