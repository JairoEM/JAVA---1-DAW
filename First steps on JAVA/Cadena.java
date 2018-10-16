public class Cadena{
	protected char cadena[];
	public Cadena(String palabra){
		cadena=new char[palabra.length()];
		for(int i=0; i<=palabra.length()-1; i++){
			cadena[i]=palabra.charAt(i);
		}
	}
	public char[] invierteCadena(){
		char[] inversa=new char [cadena.length];
		int cont=cadena.length-1;
		for(int i=0; i<=cadena.length-1; i++){
			inversa[cont]=cadena[i];
			cont--;
		}
		return inversa;
	}
	public char[] encriptaCadena(){
		char[] encriptada=new char [cadena.length];
		int aux;
		for(int i=0; i<=cadena.length-1; i++){
			aux=Caracter.ordinal(cadena[i]);
			aux-=4;
			encriptada[i]=Caracter.ascii(aux);
		}
		return encriptada;
	}
	public char[] desencriptaCadena(char encriptada[]){
		char[] desencriptada=new char [cadena.length];
		int aux;
		for(int i=0; i<=cadena.length-1; i++){
			aux=Caracter.ordinal(encriptada[i]);
			aux+=4;
			desencriptada[i]=Caracter.ascii(aux);
		}
		return desencriptada;
	}
}
		
	
