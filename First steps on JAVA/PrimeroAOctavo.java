import java.awt.*;

public class PrimeroAOctavo extends Frame{
	private ScrollPane sp1;
	private Button b1, b2, b3, b4, b5, b6, b7, b8;
	public PrimeroAOctavo(String titulo){
		super(titulo);
		sp1=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		b1=new Button ("Primero");
		b2=new Button ("Segundo");
		b3=new Button ("Tercero");
		b4=new Button ("Cuarto");
		b5=new Button ("Quinto");
		b6=new Button ("Sexto");
		b7=new Button ("Septimo");
		b8=new Button ("Octavo");
		Panel central=new Panel();
		central.setLayout(new GridLayout(4,2));
		central.add(b1);
		central.add(b2);
		central.add(b3);
		central.add(b4);
		central.add(b5);
		central.add(b6);
		central.add(b7);
		central.add(b8);
		sp1.add(central);
		this.add(sp1);
	}
	public PrimeroAOctavo(){
	}
}


