public class SieteYMedia{
	public static void main(String[] args){
		
		// Creamos objetos e iniciamos variables
		BarajaDeCartas baraja=new BarajaDeCartas();
		double totalJugador=0, totalOrdenador=0;
		char continuar;
		
		// Juega el jugador
		do{
			Carta carta=baraja.sacaCarta();
			carta.visualizarCarta();
			totalJugador+=carta.valorCarta();
			System.out.print("Quieres sacar otra carta?(S/N): ");
			continuar=EntradaConsola.leeCaracter();
		}while((continuar=='s' || continuar=='S')&&(totalJugador<=7.5));
		if(totalJugador>7.5){
			System.out.println("Te has pasado de 7.5, has perdido.");
			return;
		}
		
		// Juega el ordenador
		do{
			Carta carta=baraja.sacaCarta();
			totalOrdenador+=carta.valorCarta();
		}while(totalOrdenador<=6);
		
		// Ver quien gana
		if(totalOrdenador>7.5){
			System.out.println("Enhorabuena, la banca se ha pasado, has ganado.");
		}else{
			if(totalOrdenador>=totalJugador){
				System.out.println("La banca se ha acercado mas que tú a 7.5, has perdido.");
			}else{
				System.out.println("Enhorabuena te has acercado mas a 7.5 que la banca, has ganado.");
			}
		}
	}
}
