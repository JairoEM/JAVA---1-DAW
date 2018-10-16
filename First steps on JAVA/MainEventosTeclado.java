import java.awt.*;

public class MainEventosTeclado{
	public static void main (String[] args){
		EventosTeclado ventana=new EventosTeclado("GUI06");
		//ventana.setSize(200,100);
		ventana.setVisible(true);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
	}
}
