public class Array10x10{
	public static void main(String[] args){
		int m[][]=new int[10][10];
		int i=0, j=0, k=1;
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				m[i][j]=k;
				k++;
				System.out.print(m[i][j]+" ");
			}
		System.out.println();
		}
	}
}


