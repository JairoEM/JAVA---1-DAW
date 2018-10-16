import java.awt.*;

public class MainPantallaVerde{
	public static void main (String[] args){
		PantallaVerde ventana=new PantallaVerde("Ejercicio Raton");
		//ventana.setSize(200,100);
		ventana.setVisible(true);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
	}
}
