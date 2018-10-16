 public class Array10x10v2{  // Si nos pide dos bucles, uno que cree la matriz y otro que que visualice
	public static void main(String[] args){
		int m[][]=new int[10][10];
		int i=0, j=0, k=1;
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				m[i][j]=k;
				k++;
			}
		}
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				System.out.print(m[i][j]+" ");
			}
		System.out.println();
		}
	}
}
