import java.awt.*;
import java.awt.event.*;

public class ColoresJava extends Frame{
	
	//Declaramos variables
	private Scrollbar sbRoja, sbVerde, sbAzul;
	private Label lRojo, lVerde, lAzul;
	private Panel pNorte;
	private int rojo, verde, azul;
	
	//Inicializamos constructor
	public ColoresJava(String titulo){
		super(titulo);
		
		//Creamos paneles y layouts
		setLayout(new GridLayout(2,1,0,10));
		pNorte=new Panel();
		Panel pSur=new Panel();
		add(pNorte);
		add(pSur);
			
			//Creamos layouts
		pNorte.setBackground(Color.BLACK);
		pSur.setLayout(new GridLayout(3,1,0,10));
		
			//Creamos paneles secundarios
		Panel pSurA=new Panel(new GridLayout(1,3));
		Panel pSurB=new Panel(new GridLayout(1,3));
		Panel pSurC=new Panel(new GridLayout(1,3));
		
		//Creamos scrollbars
			//Scrollbar roja
		sbRoja=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		lRojo=new Label(" Rojo=0");
		pSurA.add(new Label(""));
		pSurA.add(sbRoja);
		pSurA.add(lRojo);
		pSur.add(pSurA);
		
			//Scrollbar verde
		sbVerde=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		lVerde=new Label(" Verde=0");
		pSurB.add(new Label(""));
		pSurB.add(sbVerde);
		pSurB.add(lVerde);
		pSur.add(pSurB);
		
			//Scrollbar azul
		sbAzul=new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		lAzul=new Label(" Azul=0");
		pSurC.add(new Label(""));
		pSurC.add(sbAzul);
		pSurC.add(lAzul);
		pSur.add(pSurC);
		
		//Introducimos controladores
		addWindowListener(new ControlVentana());
		sbRoja.addAdjustmentListener(new ControlBarra());
		sbVerde.addAdjustmentListener(new ControlBarra());
		sbAzul.addAdjustmentListener(new ControlBarra());
		
	}
	
	//Sobrecargamos constructor
	public ColoresJava(){this("");}
	
	//Creamos controladores
		//Controlador ventana
	class ControlVentana extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	
		//Controlador scrollbar (slider)
	class ControlBarra implements AdjustmentListener{
		public void adjustmentValueChanged(AdjustmentEvent ae){
			if(ae.getSource()==sbRoja){
				rojo=sbRoja.getValue();
				lRojo.setText(" Rojo="+rojo);
			}else{
				if(ae.getSource()==sbVerde){
					verde=sbVerde.getValue();
					lVerde.setText(" Verde="+verde);
				}else{
					azul=sbAzul.getValue();
					lAzul.setText(" Azul="+azul);
				}
			}
			pNorte.setBackground(new Color(rojo, verde, azul));
		}
	}
}
