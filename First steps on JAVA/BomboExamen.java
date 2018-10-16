import java.util.*;
public class BomboExamen{
	protected int n;
	public BomboExamen (int n){
		this.n=n;
	}
	public void numerarBolas(){
		int v[]=new int[n];
		for(int i=0;i<n;i++){
			v[i]=i;
		}
	}
	public int sacaBola(){
		int bola;
		numerarBolas();
		bola=(int)(Math.random()*n+1);
		for(int i=0;i<n;i++){
			if(v[i]==bola){
				v[i]=null;
				for(i=n;i==null;i--){
					v[i]=v[i-1];
				}				
			}
		}
		n--;
		return bola;
	}
	public boolean quedanBolas(){
		if(n>0){
			return true;
		}else{
			return false;
		}
	}
	public int totalBolas(){
		return n;
	}
	public int meteBola(){
		numerarBolas();
		boolena puede=true;
		for(int i=0;i<v.length;i++){
			if(v[i]==bola){
				puede=false;
			}
		}
		if(puede==false){
			n++;
		}		
		
	}
}

				
		
		
