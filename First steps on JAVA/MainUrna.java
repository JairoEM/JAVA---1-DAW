public class MainUrna{
	public static void main (String[] arg){
		Urna urna1=new Urna(6, 6);
		urna1.totalBolas();
		System.out.println(urna1.totalBolas());
		
		
		System.out.println(urna1.negras);
		System.out.println(urna1.blancas);
		
		int color;
		color=urna1.sacaBola();
		System.out.println(color);
		
		
		System.out.println(urna1.negras);
		System.out.println(urna1.blancas);
		
		
		urna1.totalBolas();
		System.out.println(urna1.totalBolas());
		
		
		urna1.meteBola(1);
		
		urna1.totalBolas();
		System.out.println(urna1.totalBolas());
	}
}
