import java.awt.*;
public class GUI02 extends Frame{

	private Button bNorte, bSur, bEste, bOeste, bCentro;

	public GUI02(String titulo){
		super(titulo);
		Frame f = new Frame("GUI02");
		// this.setLayout(new BorderLayout()); NO ES NECESARIO POR QUE POR DEFECTO
		// ES BORDERLAYOUT
		bNorte = new Button("NORTE");
		bSur = new Button("SUR");
		bOeste = new Button("OESTE");
		bCentro = new Button("CENTRO");
		bEste = new Button("ESTE");

		add("North",bNorte);
		add("South",bSur);
		add("East",bEste);
		add("West",bOeste);
		// add("West", new Button("Ejemplo"));
		add("Center",bCentro);
	}

	public GUI02(){
		super("");
	}
}