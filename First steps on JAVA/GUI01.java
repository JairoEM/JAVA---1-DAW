import java.awt.*;
public class GUI01 extends Frame{
	// private Button bNo, bSi;
	// private Label L;

	public GUI01(String titulo){
		super(titulo);
		Frame f = new Frame("Ejemplo de GUI");
		this.setLayout(new FlowLayout());
		Button bSi = new Button("SI");
		Button bNo = new Button("NO");
		Label L = new Label("Nombre");

		this.add(L);
		this.add(bSi);
		this.add(bNo);
		this.pack();
		this.setSize(300, 200);
		this.setLocation(400,400);
		this.setVisible(true);
	}

	public GUI01(){
		super();
		this.setLayout(new FlowLayout());
		Button bSi = new Button("SI");
		Button bNo = new Button("NO");
		Label L = new Label("Nombre");

		this.add(L);
		this.add(bSi);
		this.add(bNo);
		this.pack();
		this.setSize(300, 200);
		this.setLocation(400,400);
		this.setVisible(true);
	}


}