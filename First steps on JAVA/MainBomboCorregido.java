public class MainBomboCorregido{
	public static void main (String[] args){
		System.out.println("BONOLOTO:");
		BomboCorregido bombo=new BomboCorregido(50);
		for(int i=1; i<=6; i++){
			System.out.print(bombo.sacaBola()+" ");
		}
	}
}
