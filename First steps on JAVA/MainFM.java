import java.awt.*;

public class MainFM{
	public static void main (String[] args){
		FuncionesMatematicas ventana=new FuncionesMatematicas("Funciones Matematicas");
		ventana.setSize(400,200);
		ventana.setVisible(true);
		//ventana.pack();
		ventana.setLocationRelativeTo(null);
	}
}
