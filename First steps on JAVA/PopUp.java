import java.awt.*;
import java.awt.event.*;

public class PopUp extends Frame{
	
	//Declaramos variables
	private PopupMenu popup;
	private Panel p;
	
	//Inicializamos constructor
	public PopUp(String titulo){
		super(titulo);
		
		//Creamos variables
		p=new Panel();
		add(p);
		popup=new PopupMenu();
		MenuItem mi1=new MenuItem("Copiar ");
		MenuItem mi2=new MenuItem("Cortar ");
		MenuItem mi3=new MenuItem("Pegar ");
		
		//Insertamos variables
		popup.add(mi1);
		popup.add(mi2);
		popup.add(mi3);
		p.add(popup);
		
		//Insertamos controladores
		addWindowListener(new ControlVentana());
		p.addMouseListener(new ControlRaton());
	}
	
	
	//Sobrecargamos el constructor
	public PopUp(){this("");}
		
	//Creamos controladores
		//Controlador ventana
	class ControlVentana extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	
		//Controlador raton
	class ControlRaton extends MouseAdapter{
		public void mouseReleased(MouseEvent me){
			if(me.getButton()==me.BUTTON3){
				popup.show(p, me.getX(), me.getY());
			}
		}
	}
}
