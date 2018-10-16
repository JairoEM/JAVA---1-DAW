import java.util.*;
public class Animales extends SerVivo{
	protected int patas;
	public Animales(String nombreC, String nombreV, int patas){
		super(nombreC, nombreV);
		this.patas=patas;
	}
	public Animales(){
		this("felis catus", "gato", 4);
	}
	public void describete(){
		super.describete();
		System.out.print(" Ademas sabemos que es un animal, por lo que se puede mover gracias a sus "+patas+" patas.");
	}
	public int getNumPatas(){return patas;}
	public void setNumPatas(int nPatas){patas=nPatas;}
}
