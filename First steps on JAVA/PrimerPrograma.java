import java.awt.*;
public class PrimerPrograma extends Frame{
	private Button b1, b2;
	private TextArea ta1;
	private TextField tf1;
	private List lt1;
	private Choice c1;
	private Checkbox cb1;
	private Label l1;
	public PrimerPrograma(String titulo){
		super(titulo);
		lt1=new List (4);
		lt1.addItem("Lista-1");
		lt1.addItem("Lista-2");
		lt1.addItem("Lista-3");
		lt1.addItem("Lista-4");
		this.add("East",lt1);
		Panel pOeste=new Panel();
		pOeste.setLayout(new GridLayout(1,2));
		b1=new Button("Boton 1");
		b2=new Button("Boton 2");
		pOeste.add(b1);
		pOeste.add(b2);
		this.add("West",pOeste);
		Panel pCentro=new Panel();
		pCentro.setLayout(new BorderLayout());
		l1=new Label("Etiqueta");
		pCentro.add("North",l1);
		TextArea ta1=new TextArea("Area de Texto",10,20,TextArea.SCROLLBARS_BOTH);
		pCentro.add("Center",ta1);
		this.add("Center",pCentro);
		Panel pSur=new Panel();
		pSur.setLayout(new FlowLayout(FlowLayout.CENTER));
		tf1=new TextField("Campo de Texto",20);
		cb1=new Checkbox("Checkbox");
		c1=new Choice();
		c1.addItem("Manolo");
		c1.addItem("Antonio");
		c1.addItem("Carlos");
		c1.addItem("Jose");
		pSur.add(tf1);
		pSur.add(cb1);
		pSur.add(c1);
		this.add("South",pSur);
	}
	public PrimerPrograma(){
	}
}
