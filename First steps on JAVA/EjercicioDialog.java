import java.awt.*;
import java.awt.event.*;

public class EjercicioDialog extends Frame{
	private Button b1, b2, bAbrir;
	private Label l1, l2;
	private TextField tf1, tf2;
	private Dialog d1;
	private ControlVentana cv1;
	private AccionObjeto ao1;
	public EjercicioDialog(String titulo){
		setLayout(new FlowLayout());
		bAbrir=new Button("Pulse aqui");
		add(bAbrir);
		cv1=new ControlVentana();
		this.addWindowListener(cv1);
		ao1=new AccionObjeto();
		bAbrir.addActionListener(ao1);
		
		//Iniciamos el dialog
		d1=new Dialog(this,"Ventana de dialogo",true);
		d1.setLayout(new FlowLayout());
		d1.addWindowListener(cv1);
		
		//Rellenamos el Dialog
		l1=new Label("Usuario",Label.RIGHT);
		l2=new Label("Password",Label.RIGHT);
		
		tf1=new TextField("Jairo",15);
		tf2=new TextField("********",15);
		tf2.setEchoChar('*');
		
		b1=new Button("Aceptar");
		b2=new Button("Cancelar");
		
		Panel pSur=new Panel();
		Panel pNorte=new Panel();
		Panel pCentral=new Panel();
		pSur.setLayout(new FlowLayout());
		pNorte.setLayout(new FlowLayout());
		pCentral.setLayout(new GridLayout(2,5));
		
		pSur.add(new Label("   "));
		pNorte.add(new Label("   "));
		pCentral.add(new Label(" "));
		pCentral.add(l1);
		pCentral.add(tf1);
		pCentral.add(new Label(" "));
		pCentral.add(b1);
		pCentral.add(new Label(" "));
		pCentral.add(l2);
		pCentral.add(tf2);
		pCentral.add(new Label(" "));
		pCentral.add(b2);
		d1.add("North",pNorte);
		d1.add("South",pSur);
		d1.add("Center",pCentral);
		d1.addWindowListener(cv1);
		
	}
	public EjercicioDialog(){
		this("");
	}


//ActionListener
	class AccionObjeto implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			d1.pack();
			d1.setLocation(200,100);
			d1.show(true);
		}
	}

//WindowListener
	class ControlVentana implements WindowListener{
		public void windowActivated(WindowEvent we){}
		public void windowDeactivated(WindowEvent we){}
		public void windowClosed(WindowEvent we){}
		public void windowIconified(WindowEvent we){}
		public void windowDeiconified(WindowEvent we){}
		public void windowOpened(WindowEvent we){}
		public void windowClosing(WindowEvent we){
			if(we.getSource()==d1){
				d1.show(false);
			}else{
				System.exit(0);
			}
		}
	}
}
