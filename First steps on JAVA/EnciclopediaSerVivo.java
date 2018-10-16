import java.util.*;
public class EnciclopediaSerVivo{
	public static void main (String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Bienvenid@ a tu enciclopedia de seres vivos");
		char eleccion;
		do{
			System.out.println("-------------------------------------------");
			System.out.println("Introduce la clase de ser vivo que quieras agregar:");
			System.out.println("Animal--------------0");
			System.out.println("Vegetal-------------1");
			System.out.println("Cual va a ser? ");
			int nSer=sc.nextInt();
			if(nSer==0){
				System.out.println("Introduce ahora que tipo de animal vas a introducir:");
				System.out.println("Mamifero------------0");
				System.out.println("Ave-----------------1");
				System.out.println("Reptil--------------2");
				System.out.print("Cual va a ser? ");
				int nAnimal=sc.nextInt();
				if(nAnimal==0){
					Mamiferos mamifero=new Mamiferos();
					System.out.print("Introduce su nombre cientifico: ");
					String nombreC=sc.next();
					mamifero.cambiarC(nombreC);
					System.out.print("Introduce su nombre vulgar: ");
					String nombreV=sc.next();
					mamifero.cambiarV(nombreV);
					System.out.println("Has agregado la siguiente entrada:");
					mamifero.describete();
				}
				if(nAnimal==1){
					Aves ave=new Aves();
					System.out.print("Introduce su nombre cientifico: ");
					String nombreC=sc.next();
					ave.cambiarC(nombreC);
					System.out.print("Introduce su nombre vulgar: ");
					String nombreV=sc.next();
					ave.cambiarV(nombreV);
					System.out.println("Has agregado la siguiente entrada:");
					ave.describete();					
				}
				if(nAnimal==2){
					Reptiles reptil=new Reptiles();
					System.out.print("Introduce su nombre cientifico: ");
					String nombreC=sc.next();
					reptil.cambiarC(nombreC);
					System.out.print("Introduce su nombre vulgar: ");
					String nombreV=sc.next();
					reptil.cambiarV(nombreV);
					System.out.println("Has agregado la siguiente entrada:");
					reptil.describete();				
				}
			}
			if(nSer==1){
				Vegetales vegetal=new Vegetales(String nombreC, String nombreV, String partes);
				System.out.print("Introduce su nombre cientifico: ");				
				String nombreC=sc.next();
				vegetal.cambiarC(nombreC);				
				System.out.print("Introduce su nombre vulgar: ");
				String nombreV=sc.next();
				vegetal.cambiarV(nombreV);			
				System.out.println("Cuantas partes tiene el vegetal?");
				int numPartes=sc.nextInt();
				String partes[]=new String[numPartes];
				for(int i=0;i<numPartes;i++){
					System.out.println("Introduce la siguiente parte del vegetal:");
					partes[i]=sc.next();
				}				
			}
			
			System.out.print("Deseas introducir un nuevo ser vivo? S // N : ");
			eleccion=sc.next().charAt(0);	
		}while(eleccion=='S' || eleccion=='s');
		System.out.println("-------------------------------------------");
		System.out.println("Vuelve pronto :)");
	}
}
		
