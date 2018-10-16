import java.util.*;
public class Aves extends Animales{
	protected String volar;
	public Aves(String nombreC, String nombreV, int patas, String volar){
		super(nombreC, nombreV, patas);
		volar="vuela";
	}
	public Aves(){
		this("ramphastidae", "tucan", 2, "vuela");
	}
	public void describete(){
		super.describete();
		System.out.println(" Por ultimo, podemos destacar que es un ave, por lo que "+volar+".");
	}
}
