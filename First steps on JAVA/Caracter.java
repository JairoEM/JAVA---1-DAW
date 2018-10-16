import java.util.*;
import java.lang.Math;
public class Caracter{
	protected char c;
	protected int i;
	public Caracter(char c, int i){
		this.c=c;
		this.i=i;
	}
	public Caracter(){
	}
	public static int ordinal(char c){
		int ordinal=(int) c;
		return ordinal;
	}
	public static char ascii(int i){
		char ascii=(char) i;
		return ascii;
	}
}
