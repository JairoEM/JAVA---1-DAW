import java.util.*;
public class Cola extends Lista{
	public Cola(){
		super();
	}
	public Cola (Object obj){
		super();
		addElement(obj);
	}
	public void extraeDeCola(){
		extraeUltimo();
	}
	public void ponEnCola(Object obj){
		ponPrimero(obj);
	}
	public void vacia(){
		removeAllElements();
	}
	public Object frente(){
		return lastElement();
	}
}
