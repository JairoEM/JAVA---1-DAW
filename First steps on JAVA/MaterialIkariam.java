import java.util.*;
public class MaterialIkariam{
	public static void main (String[] arg){
		Scanner sc=new Scanner (System.in);
		int ciudad, suma, necesito, falta;
		System.out.print("Introduce la cantidad de material de tu primera ciudad: ");
		ciudad=sc.nextInt();
		suma=ciudad;
		while (ciudad!=0){
			System.out.print("Introduce la cantidad de material de tu siguiente ciudad: ");
			ciudad=sc.nextInt();
			suma=suma+ciudad;
		}
		System.out.print("Introduce la cantidad de material requerido para la construccion: ");
		necesito=sc.nextInt();
		if (suma>necesito){
			System.out.println("Tienes material suficiente para la construccion, enhorabuena.");
		}else{
			falta=(necesito-suma);
			System.out.println("Te falta "+falta+" material.");
		}
	}
}
