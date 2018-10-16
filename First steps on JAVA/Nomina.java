import java.awt.*;
import java.awt.event.*;

public class Nomina extends Frame{
	
	//Declaramos variables
	private Choice chEstado;
	private Checkbox cbSi, cbNo;
	private CheckboxGroup cbgJefe;
	private TextField tfHijos, tfAnti, tfBase, tfBruto;
	private Button bCalcular, bLimpiar;
	
	//Creamos constructor
	public Nomina(String titulo){
		super(titulo);
		
		//Creamos variables
			//Choice
		chEstado=new Choice();
		chEstado.addItem("Soltero");
		chEstado.addItem("Casado");
		chEstado.addItem("Viudo");
		chEstado.addItem("Divorciado");
		
			//Checboxs
		cbgJefe=new CheckboxGroup();
		cbSi=new Checkbox("SI", cbgJefe, false);
		cbNo=new Checkbox("NO", cbgJefe, true);
		
			//Textfields
		tfHijos=new TextField("0",15);
		tfAnti=new TextField("0",15);
		tfBase=new TextField("0",15);
		tfBruto=new TextField("0",15);
		tfBruto.setEditable(false);
		
			//Buttons
		bCalcular=new Button("Calcular");
		bLimpiar=new Button("Limpiar");
		
			//Labels
		Label lSBa=new Label("Sueldo Base");
		Label lEC=new Label("Estado Civil");
		Label lJD=new Label("Jede Departamento");
		Label lH=new Label("Num. Hijos");
		Label lA=new Label("Antiguedad");
		Label lSBr=new Label("Sueldo Bruto");
		
		//Creamos paneles y layouts
		Panel pPrincipal=new Panel();
		pPrincipal.setLayout(new GridLayout(8,1));
		add(pPrincipal);
		
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		Panel p5=new Panel();
		Panel p6=new Panel();
		Panel p7=new Panel();
		Panel p8=new Panel();
		
		p1.setLayout(new GridLayout(1,4));
		p2.setLayout(new GridLayout(1,4));
		p3.setLayout(new GridLayout(1,4));
		p4.setLayout(new GridLayout(1,4));
		p5.setLayout(new GridLayout(1,6));
		p6.setLayout(new GridLayout(1,4));
		p7.setLayout(new FlowLayout());
		p8.setLayout(new GridLayout(1,4));
		
		pPrincipal.add(p1);
		pPrincipal.add(p2);
		pPrincipal.add(p3);
		pPrincipal.add(p4);
		pPrincipal.add(p5);
		pPrincipal.add(p6);
		pPrincipal.add(p7);
		pPrincipal.add(p8);
		
		//Rellenamos paneles
		p1.add(new Label());
		p1.add(lSBa);
		p1.add(tfBase);
		p1.add(new Label());
		
		p2.add(lEC);
		p2.add(chEstado);
		p2.add(lJD);
		p2.add(new Label());
		
		p3.add(new Label());
		p3.add(new Label());
		p3.add(cbSi);
		p3.add(new Label());
		
		p4.add(new Label());
		p4.add(new Label());
		p4.add(cbNo);
		p4.add(new Label());
		
		p5.add(new Label());
		p5.add(lH);
		p5.add(tfHijos);
		p5.add(lA);
		p5.add(tfAnti);
		p5.add(new Label());

		p6.add(new Label());
		p6.add(lSBr);
		p6.add(tfBruto);
		p6.add(new Label());
		
		p7.add(new Label());
		
		p8.add(new Label());
		p8.add(bCalcular);
		p8.add(bLimpiar);
		p8.add(new Label());
		
		//Insertamos controladores
		addWindowListener(new ControlVentana());
		bLimpiar.addActionListener(new AccionObjeto());
		bCalcular.addActionListener(new AccionObjeto());
		
	}
	
	//Sobrecargamos constructor
	public Nomina(){this("");}
	
	//Creamos controladores
		//Controlador ventana
	class ControlVentana extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
		//Controlador accion
	class AccionObjeto implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==bLimpiar){
				tfHijos.setText("0");
				tfAnti.setText("0");
				tfBase.setText("0");
				tfBruto.setText("0");
				chEstado.select("Soltero");
				tfBase.requestFocus();
				cbgJefe.setSelectedCheckbox(cbNo);
			}
			if(ae.getSource()==bCalcular){
					//Variables para sumar
				int total=0;
				int extraEstado=0;
				int extraJefe=0;
					//String a int
				int num1=Integer.parseInt(tfHijos.getText());
				int num2=Integer.parseInt(tfAnti.getText());
				int num3=Integer.parseInt(tfBase.getText());
					//Calculos y valores finales
				int calculoAnti=(int)(num2/3);
				int extraAnti=calculoAnti*30;
				int extraHijos=num1*18;
				if(chEstado.getSelectedItem()=="Casado"){
					extraEstado=30;
				}
				if(cbSi.getState()==true){
					extraJefe=42;
				}
					//Suma final
				total=num3+extraAnti+extraHijos+extraEstado+extraJefe;
				tfBruto.setText(total+" euros");
			}
		}
	}
}


	
