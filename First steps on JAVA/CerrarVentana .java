import java.awt.*;
import java.awt.event.*;

public class CerrarVentana extends Frame{
	private Button b1, b2;
	private Label l1;
	private ControlVentana cv1;
	private AccionObjeto ao1;
	public CerrarVentana (String titulo){
		super(titulo);
		cv1=new ControlVentana();
		this.addWindowListener(cv1);
		ao1=new AccionObjeto();
		l1=new Label("                    ");
		b1=new Button("Aceptar");
		b1.addActionListener(ao1);
		b2=new Button("Cancelar");
		b2.addActionListener(ao1);
		this.setLayout(new FlowLayout());
		this.add(b1);
		this.add(b2);
		this.add(l1);
	}
	public CerrarVentana(){
		this("");
	}


//ActionListener
	class AccionObjeto implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==b1){
				l1.setText("Aceptar");
			}else{
				l1.setText("Cancelar");
			}
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
				System.exit(0);
		}
	}
}


