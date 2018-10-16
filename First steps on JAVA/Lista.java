import java.util.*;
public class Lista extends Vector{
	public Lista(){
		super();
	}
	public Lista (Object obj){
		super();
		addElement(obj);
	}
	public void ponPrimero(Object obj){
		insertElementAt(obj, 0);
	}
	public void ponUltimo(Object obj){
		addElement(obj); // insertElementAt(obj, size()-1);
		trimToSize();
	}
	public boolean estaVacia(){
		return isEmpty();
	}
	public Object extraePrimero(){
		Object obj=lastElement();
		if(obj!=null){
			removeElementAt(0);
		}
		return obj;
	}
	public Object extraeUltimo(){
		Object obj=lastElement();
		if(estaVacia()){
			return null;
		}
		if(obj!=null){
			removeElementAt(size()-1);
		}
		return obj;
	}
	public void visualizaElementos(){
		for(Enumeration e=elements(); e.hasMoreElements();){
			System.out.println(e.nextElement());
		}
	}
}
