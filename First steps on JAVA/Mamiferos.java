import java.util.*;
public class Mamiferos extends Animales{
	public Mamiferos(String nombreC, String nombreV){
		super(nombreC, nombreV, 4);
		patas=4;
	}
	public Mamiferos(){
		this("felis catus", "gato");
	}
	public void describete(){
		super.describete();
		System.out.println(" Por ultimo, podemos destacar que es un mamifero.");
	}
	public void setNumPatas(){}
}
