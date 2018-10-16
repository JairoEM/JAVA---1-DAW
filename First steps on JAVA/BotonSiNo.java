import java.awt.*;

public class BotonSiNo extends Frame{
	private Button bNo, bSi;
	private Label l;
	public BotonSiNo(String titulo){
		super(titulo);
		this.setLayout(new FlowLayout());
		Button bSi = new Button("SI");
		Button bNo = new Button("NO");
		Label l = new Label("Nombre");
		this.add(l);
		this.add(bSi);
		this.add(bNo);
		this.pack();
		this.setVisible(true);
	}
	public GUI02(){this("");}
}
