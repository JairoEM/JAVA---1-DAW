import java.awt.*;

public class EntradasYSubentradas extends Frame{
	private MenuBar mb1;
	private MenuShortcut ms1;
	private Menu m1, m2, m3, subm3;
	private MenuItem mi1, mi2, s1_1, s1_2;
	public EntradasYSubentradas(String titulo){
		super(titulo);
		mb1=new MenuBar();
		setMenuBar(mb1);
		
		//Menu Entradas Principales
		m1=new Menu("Entrada 1");
		m2=new Menu("Entrada 2");
		m3=new Menu("Ayuda");
		mb1.add(m1);
		mb1.add(m2);
		mb1.add(m3);
		
		//Menu de subentradas Entrada 1
		ms1=new MenuShortcut(69);
		mi1=new MenuItem("Subentrada 1.1");
		mi1.setEnabled(true);
		mi2=new MenuItem("Subentrada 1.2",ms1);
		mi2.setEnabled(true);
		subm3=new Menu("SueEntrada 1.3");
		subm3.setEnabled(true);
		m1.add(mi1);
		m1.addSeparator();
		m1.add(mi2);
		m1.add(subm3);
		
		//Menu de subentradas Subentrada 3
		s1_1=new MenuItem("Subentrada 1.3.1");
		s1_2=new MenuItem("Subentrada 1.3.2");
		s1_1.setEnabled(true);
		s1_2.setEnabled(true);
		subm3.add(s1_1);
		subm3.add(s1_2);
	}
}
