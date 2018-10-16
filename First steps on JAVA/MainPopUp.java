import java.awt.*;

public class MainPopUp{
	public static void main (String[] args){
		PopUp ventana=new PopUp("Ejercicio Raton");
		ventana.setSize(200,200);
		ventana.setVisible(true);
		//ventana.pack();
		ventana.setLocationRelativeTo(null);
	}
}
