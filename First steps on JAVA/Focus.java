import java.awt.*;
import java.awt.event.*;

public class Focus extends Frame{
	private Button bBoton;
	private List list;
	private Choice ch;
	private TextField tf;
	private TextArea ta;
	public Focus(String titulo){
		super(titulo);
		setLayout(new GridLayout(2,1));
		Panel pNorte=new Panel();
		pNorte.setLayout(new BorderLayout());
		Panel pNorte2=new Panel();
		pNorte2.setLayout(new FlowLayout());
		tf=new TextField(15);
		pNorte2.add(tf);
		pNorte2.add(new Label("Etiqueta"));
		ch=new Choice();
		for(int i=1; i<=5; i++){
			ch.addItem("Item "+i);
		}
		pNorte2.add(ch);
		bBoton=new Button("Boton");
		pNorte2.add(bBoton);
		pNorte.add("North", pNorte2);
		list=new List();
		for(int i=1; i<=5; i++){
			list.addItem("Lista "+i);
		}
		pNorte.add("Center", list);
		this.add(pNorte);
		ta=new TextArea(10, 50);
		ta.setEditable(false);
		this.add(ta);
		this.addWindowListener(new ControlVentana());
		tf.addFocusListener(new ControlFoco());
		bBoton.addFocusListener(new ControlFoco());
		ch.addFocusListener(new ControlFoco());
		list.addFocusListener(new ControlFoco());
	}
	public Focus(){this("");}
	
	class ControlVentana extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
	class ControlFoco extends FocusAdapter{
		public void focusGained(FocusEvent fe){
			ta.append("Foco ganado: "+fe.getSource()+"\n");
		}
		public void focusLost(FocusEvent fe){
			ta.append("Foco perdido: "+fe.getSource()+"\n");
		}
	}
}
