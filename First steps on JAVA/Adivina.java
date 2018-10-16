import java.util.*;
public class Adivina{
	public static void main (String[] arg){
		Scanner sc=new Scanner (System.in);
		int desde=1, hasta=100, n, i=1, aleatorio;
		boolean acertar=false;
		char opt;
		do{
			aleatorio=(int)(Math.random()*100+1);
			while ((i<=5)&&(acertar==false)){
				System.out.print("Introduce un numero: ");
				n=sc.nextInt();
				if(n==aleatorio){
					acertar=true;
					System.out.println("¡¡ENHORABUENA!! Has acertado, el numero era "+aleatorio+".");
				}else{
					i++;
					if(i<=5){
						if(n>aleatorio){
							hasta=n;
							System.out.println("El numero esta situado entre "+desde+" y "+hasta+".");
						}else{
							desde=n;
							System.out.println("El numero esta situado entre "+desde+" y "+hasta+".");
						}
					}
				}
			}
			if (acertar==false){
				System.out.println("Lo sentimos, el numero correcto era "+aleatorio+".");
			}
			System.out.println("Si desea continuar jugando pulse S...");
			opt=sc.next().charAt(0);
			acertar=false;
			desde=1;
			hasta=100;
			i=1;
		}while ((opt=='s')||(opt=='S'));
	}
}
