import java.util.*;
public class Reptiles extends Animales{
	protected String sangre;
	public Reptiles(String nombreC, String nombreV, int patas, String sangre){
		super(nombreC, nombreV, patas);
		sangre="fria";
	}
	public Reptiles(){
		this("crocodylidae", "cocodrilo", 4, "fria");
	}
	public void describete(){
		super.describete();
		System.out.println(" Por ultimo, podemos destacar que es un reptil, por lo que es un animal de sangre "+sangre+".");
	}
}
