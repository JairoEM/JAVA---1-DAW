import java.awt.*;
import java.awt.event.*;

public class DatosPersonales extends Frame{
	
	//Declaramos variables
	private Choice estado;
	private List hijos;
	private Checkbox hombre, mujer;
	private TextArea ta;
	private CheckboxGroup cbg;
	
	//Inicializamos constructor
	public DatosPersonales(String titulo){
		super(titulo);
		
		//Creamos panels y layouts
		this.setLayout(new GridLayout(2,1));
		Panel pNorte=new Panel();
		Panel pNorteA=new Panel();
		Panel pNorteB=new Panel();
		Panel pNorteC=new Panel();
		pNorte.setLayout(new GridLayout(3,1));
		pNorteA.setLayout(new GridLayout(1,3));
		pNorteB.setLayout(new GridLayout(1,3));
		pNorteC.setLayout(new GridLayout(1,3));	
		
		//Creamos el checbox group
		cbg=new CheckboxGroup();	
		
		//Introducimos variables en los paneles
			//pNorteA
		pNorteA.add(new Label("Sexo"));
		pNorteA.add(new Label("Estado Civil"));
		pNorteA.add(new Label("Num. Hijos"));
		
			//pNorteB
		hombre=new Checkbox("Hombre",cbg,true);
		estado=new Choice();
		estado.addItem("Soltero");
		estado.addItem("Casado");
		estado.addItem("Viudo");
		estado.addItem("Divorciado");
		hijos=new List();
		for(int i=0; i<=5; i++){
			hijos.addItem(""+i);
		}
		hijos.addItem("6 o mas");
		pNorteB.add(hombre);
		pNorteB.add(estado);
		pNorteB.add(hijos);
		
			//pNorteC
		mujer=new Checkbox("Mujer",cbg,false);
		pNorteC.add(mujer);
		pNorteC.add(new Label(""));
		pNorteC.add(new Label(""));
		
			//pNorte (general)
		pNorte.add(pNorteA);
		pNorte.add(pNorteB);
		pNorte.add(pNorteC);
		
		
		//Introducimos paneles en nuestra GUI
		this.add(pNorte);
		ta=new TextArea(20, 100);
		this.add(ta);
		
		//Introducimos controladores
		this.addWindowListener(new ControlVentana());
		hombre.addItemListener(new ControlItem());
		mujer.addItemListener(new ControlItem());
		estado.addItemListener(new ControlItem());
		hijos.addItemListener(new ControlItem());
				
	}
	
	//Sobrecargamos el constructor
	public DatosPersonales(){this("");}
	
	
	//Creamos controladores
	class ControlVentana extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	
	class ControlItem implements ItemListener{
		public void itemStateChanged(ItemEvent ie){
			ta.append(ie.getItem()+"\n");
		}
	}
	
}	
