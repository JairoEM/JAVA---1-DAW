import java.awt.*;
import java.awt.event.*;

public class PantallaVerde extends Frame{
	
	//Declaramos variables
	private TextArea info;
	
	//Inicializamos constructor
	public PantallaVerde(String titulo){
		super(titulo);
		
		//Creamos variables
		info=new TextArea(10,50);
		info.setEditable(false);
		
		//Creamos paneles y layouts
		setLayout(new GridLayout(2,1));
		Panel pNorte=new Panel();
		Panel pSur=new Panel();
		pSur.add(info);
		pNorte.setBackground(Color.GREEN); 
			//Otra opcion seria pNorte.setBackground(new Color(0,255,0);
			//Incluso se podria crear la clase color --> Color color=new Color();
		add(pNorte);
		add(pSur);
		
		//Introducimos controladores
		addWindowListener(new ControlVentana());
		pNorte.addMouseListener(new ControlRaton());
		pNorte.addMouseMotionListener(new ControlMovimientoRaton());
			
	}
	
	//Sobrecargamos constructor
	public PantallaVerde(){this("");}

	//Creamos controladores
		//Controlador de ventana
	class ControlVentana extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
		
		//Controlador de raton
	class ControlRaton extends MouseAdapter{
		public void mouseClicked(MouseEvent me){
			info.append("Has pulsado el raton \n");
		}
		public void mouseEntered(MouseEvent me){
			info.append("El raton ha sido introducido en el area de trabajo \n");
		}
		public void mouseExited(MouseEvent me){
			info.append("El raton ha salido del area de trabajo \n");
		}
		public void mousePressed(MouseEvent me){
			int boton=me.getButton();
			if(boton==me.BUTTON1){
				info.append("Has pulsado el click izquierdo \n");
			}else{
				if(boton==me.BUTTON2){
					info.append("Has pulsado el click central \n");
				}else{
					if(boton==me.BUTTON3){
						info.append("Has pulsado el click derecho \n");
					}else{
						info.append("Has pulsado un click adicional \n");
					}
				}
			}
		}
		public void mouseReleased(MouseEvent me){
			info.append("El raton ya no esta pulsado \n");
		}
	}
		
		//Controlador de movimiento de raton
	class ControlMovimientoRaton extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent me){
		}
		public void mouseMoved(MouseEvent me){
			info.append("X="+me.getX()+" // Y="+me.getY()+"\n");
		}
	}
}		
