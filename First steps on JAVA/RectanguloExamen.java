import java.util.*;
public class RectanguloExamen{
	protected Segmento s1, s2;
	public RectanguloExamen (Segmento s1, Segmento s2){
		if((s1.p.x==s2.p.y)&&(s1.p.y==s2.p.y)){
			this.s1=s1;
			this.s2=s2;
		}else{
			System.out.println("No se pudo crear el rectángulo.");
		}
	}
	public double area(){return s1.longitudSegmento()*s2.longitudSegmento();}
	public double perimetro(){return 2*(s1.longitudSegmento()+s2.longitudSegmento());}
}
