import java.util.*;
public class Pila extends Lista{
	public Pila(){
		super();
	}
	public Pila (Object obj){
		super(obj);
	}
	public void pop(){
		if(!vacia()){
			removeElementAt(size()-1);
		}
	}
	public void push(Object obj){
		addElement(obj);
	}
	public void vacia(){
		return estaVacia();
	}
	public Object cima(){
		return lastElement();
	}
}
	
