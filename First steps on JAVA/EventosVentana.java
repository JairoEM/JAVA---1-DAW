import java.awt.*;
import java.awt.event.*;

public class EventosVentana extends Frame{
	public EventosVentana(String titulo){
		super(titulo);
		ControlVentana cv=new ControlVentana();
		this.addWindowListener(cv);
	}
	public EventosVentana(){
		this("");
	}
}

//Objeto Listener y Event de Window, implementar en cada programa
class ControlVentana implements WindowListener{
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
}
