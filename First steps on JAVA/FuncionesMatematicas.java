import java.awt.*;
import java.awt.event.*;

public class FuncionesMatematicas extends Frame{
	
	//Declaramos variables
	private MenuBar mb;
	private Menu mOpciones, mSalir;
	private MenuItem miFac, miNum, miFun;
	private TextArea taNP;
	private TextField tfFacN, tfFacF, tfNPD, tfNPH, tfFunN, tfFunE;
	private Button bFacC, bFacL, bNPC, bNPL, bFunC, bFunL;
	private Dialog dFac, dNum, dFun;
	
	//Creamos constructor
	public FuncionesMatematicas(String titulo){
		super(titulo);
		
		//Creamos variables de Menu
			//Barra de menu
		mb=new MenuBar();
		setMenuBar(mb);
			
			//Menus
		mOpciones=new Menu("Opciones");
		mSalir=new Menu("Salir");
		mb.add(mOpciones);
		mb.add(mSalir);
		
			//Submenus
		miFac=new MenuItem("Factorial");
		miNum=new MenuItem("Numeros Primos");
		miFun=new MenuItem("Funcion Euler");	
		miFac.setEnabled(true);
		miNum.setEnabled(true);
		miFun.setEnabled(true);
		mOpciones.add(miFac);
		mOpciones.add(miNum);
		mOpciones.add(miFun);
		
		//Creamos variables de dialog y rellenamos
			//Dialog factorial
		dFac=new Dialog(this,"Factorial", true);
		dFac.setLayout(new GridLayout(4,2));
		dFac.setBackground(Color.GREEN);
				//1
		dFac.add(new Label(""));
		dFac.add(new Label(""));
				//2
		dFac.add(new Label("Numero:"));
		tfFacN=new TextField("0",15);
		dFac.add(tfFacN);
				//3
		dFac.add(new Label("Factorial:"));
		tfFacF=new TextField("0",15);
		tfFacF.setEditable(false);
		dFac.add(tfFacF);
				//4
		bFacC=new Button("Calcular");
		dFac.add(bFacC);
		bFacL=new Button("Limpiar");
		dFac.add(bFacL);
		
			//Dialog primos
		dNum=new Dialog(this,"Numeros Primos", true);
		dNum.setLayout(new GridLayout(5,2));
		dNum.setBackground(Color.GREEN);
				//1
		dNum.add(new Label(""));
		dNum.add(new Label(""));
				//2
		dNum.add(new Label("Desde:"));
		tfNPD=new TextField("0",15);
		dNum.add(tfNPD);
				//3
		dNum.add(new Label("Hasta:"));
		tfNPH=new TextField("0",15);
		dNum.add(tfNPH);
				//4
		dNum.add(new Label("Num. primos:"));
		taNP=new TextArea(4,15);
		taNP.setEditable(false);
		dNum.add(taNP);
				//5
		bNPC=new Button("Calcular");
		dNum.add(bNPC);
		bNPL=new Button("Limpiar");
		dNum.add(bNPL);
		
		//Dialog euler
		dFun=new Dialog(this,"Factorial", true);
		dFun.setLayout(new GridLayout(4,2));
		dFun.setBackground(Color.GREEN);
				//1
		dFun.add(new Label(""));
		dFun.add(new Label(""));
				//2
		dFun.add(new Label("Numero:"));
		tfFunN=new TextField("0",15);
		dFun.add(tfFunN);
				//3
		dFun.add(new Label("Euler:"));
		tfFunE=new TextField("0",15);
		tfFunE.setEditable(false);
		dFun.add(tfFunE);
				//4
		bFunC=new Button("Calcular");
		dFun.add(bFunC);
		bFunL=new Button("Limpiar");
		dFun.add(bFunL);
		
		//Declaramos controladores
		addWindowListener(new ControlVentana());
		mSalir.addActionListener(new AccionObjeto());
		
			//Factorial
		dFac.addWindowListener(new ControlVentana());
		miFac.addActionListener(new AccionObjeto());
		bFacC.addActionListener(new AccionObjeto());
		bFacL.addActionListener(new AccionObjeto());
		
			//Numeros primos
		dNum.addWindowListener(new ControlVentana());
		miNum.addActionListener(new AccionObjeto());
		bNPC.addActionListener(new AccionObjeto());
		bNPL.addActionListener(new AccionObjeto());
		
			//Funcion Euler
		dFun.addWindowListener(new ControlVentana());
		miFun.addActionListener(new AccionObjeto());
		bFunC.addActionListener(new AccionObjeto());
		bFunL.addActionListener(new AccionObjeto());		
	}
	
	//Creamos controladores
		//Controlador ventana
	class ControlVentana extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			if(we.getSource()==dFac){
				dFac.show(false);
			}else{
				if(we.getSource()==dFun){
					dFun.show(false);
				}else{
					if(we.getSource()==dNum){
						dNum.show(false);
					}else{
						System.exit(0);
					}
				}
			}
		}
	}
		//Controlador accion
	class AccionObjeto implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			
			//Dialog factorial
				//Aparece 
			if(ae.getSource()==miFac){
				dFac.pack();
				dFac.setLocation(200,100);
				dFac.show(true);
			}
				//Calculos
			if(ae.getSource()==bFacC){
				int numFac=Integer.parseInt(tfFacN.getText());
				int cumulo=1;
				for(int i=1; i<=numFac; i++){
					cumulo=cumulo*i;
				}
				tfFacF.setText(""+cumulo);
			}
				//Limpieza
			if(ae.getSource()==bFacL){
				tfFacF.setText("0");
				tfFacN.setText("0");
			}
				
			//Dialog euler
				//Aparece
			if(ae.getSource()==miFun){
				dFun.pack();
				dFun.setLocation(200,100);
				dFun.show(true);
			}
				//Calculos
			if(ae.getSource()==bFunC){
				int numEuler=Integer.parseInt(tfFunN.getText());
				tfFunE.setText(Mate.euler(numEuler)+"");
			}
				//Limpieza
			if(ae.getSource()==bFunL){
				tfFunE.setText("0");
				tfFunN.setText("0");
			}
			
			//Dialog numeros primos
				//Aparece
			if(ae.getSource()==miNum){
				dNum.pack();
				dNum.setLocation(200,100);
				dNum.show(true);
			}
				//Calculos
			if(ae.getSource()==bNPC){
				int numPrimo1=Integer.parseInt(tfNPD.getText());
				int numPrimo2=Integer.parseInt(tfNPH.getText());
				for(int i=numPrimo1; i<=numPrimo2; i++){
					if(Mate.primo(i)){
						taNP.append(i+"\n");
					}
				}
			}
				//Limpieza
			if(ae.getSource()==bNPL){
				tfNPD.setText("0");
				tfNPH.setText("0");
				taNP.setText("0");
			}
			
			//Menu salir
			if(ae.getSource()==mSalir){
				System.exit(0);
			}

		}
	}
}

