import java.awt.*;
import java.awt.event.*;

public class EventosTeclado extends Frame{

	//Declaramos variables
	private TextArea ta1, ta2;
	
	//Inicializamos constructor
	public EventosTeclado(String titulo){
		super(titulo);
		
		//Creamos variables
		ta1=new TextArea(10,50);
		ta2=new TextArea(10,50);
		ta2.setEditable(false);
		
		//Creamos paneles y layouts
		this.setLayout(new GridLayout(2,1));
		add(ta1);
		add(ta2);
		
		//Introducimos controladores
		addWindowListener(new ControlVentana());
		ta1.addKeyListener(new ControlTeclado());
		
	}
	
	//Sobrecargamos constructor
	public EventosTeclado(){this("");}

	//Creamos controladores
	class ControlVentana extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	
	class ControlTeclado extends KeyAdapter{
		public void keyPressed(KeyEvent ke){
			if(ke.getKeyChar()==8){
				ta2.replaceRange("",ta1.getCaretPosition(),ta1.getCaretPosition()-1);
			}else{
				if(ke.getKeyChar()>=0 && ke.getKeyChar()<=255 && ke.getKeyChar()!=27 && ke.getKeyChar()!=127){
				ta2.append(""+ke.getKeyChar());
				}
			}
		}
	}
}
