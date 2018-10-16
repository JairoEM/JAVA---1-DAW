import java.util.*;
public class HolaAdios2{
	public static void main (String[] arg){
		boolean sw=true;
		for(int i=1; i<=100; i++){
			if(sw==true){
				System.out.println("Hola");
				sw=false;
			}else{
				System.out.println("Adios");
				sw=true;
			}
		}
	}
}
