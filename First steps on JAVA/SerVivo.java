import java.util.*;
public class SerVivo{
	protected String nombreC, nombreV;
	public SerVivo(String nombreC, String nombreV){
		this.nombreC=nombreC;
		this.nombreV=nombreV;
	}
	public SerVivo(){
		nombreC="";
		nombreV="";
	}
	public void describete(){
		System.out.print("Sabemos del ser vivo que su nombre cientifico es "+nombreC+", y el vulgar "+nombreV+".");
	}
	public void setNombreC(String nombreAuxC){
		nombreC=nombreAuxC;
	}
	public void setNombreV(String nombreAuxV){
		nombreV=nombreAuxV;
	}		
}
