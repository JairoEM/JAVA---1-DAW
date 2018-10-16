public class MainVector{
	public static void main(String[] args){
		int v[]=new int[4];
		rellenarVector(v);
		ordenar(v);
		visualizarVector(v);
		rotarDerecha(v, 2);
		visualizarVector(v);
		rotarIzquierda(v, 2);
		visualizarVector(v);
	}
	public static void rellenarVector(int v[]){
		for(int i=0;i<v.length;i++){
			v[i]=(int)(Math.random()*100+1);
		}
	}
	public static void visualizarVector(int v[]){
		for (int i=0;i<v.length;i++){
			System.out.println("V"+i+"["+v[i]+"] ");
		}
	}
	public static void ordenar(int v[]){
		for(int i=1;i<v.length;i++){
			for(int j=0;j<v.length-1;j++){
				if(v[j]>v[j+1]){
					int aux=v[j];
					v[j]=v[j+1];
					v[j+1]=aux;
				}
			}
		}
	}
	public static void rotarDerecha(int v[], int pos){
		int aux[]=new int[v.length];
		int j=0;
		for(int i=0; i<v.length; i++){
			j=i+pos;
			if(j>=v.length){
				j=j-v.length;
			}
			aux[j]=v[i];
		}
		for(int i=0;i<v.length;i++){
			v[i]=aux[i];
		}
	}
	public static void rotarIzquierda(int v[], int pos){
		int aux[]=new int[v.length];
		int j=0;
		for(int i=0; i<v.length; i++){
			j=i-pos;
			if(j<0){
				j=j+v.length;
			}
			aux[j]=v[i];
		}
		for(int i=0;i<v.length;i++){
			v[i]=aux[i];
		}
	}
}

