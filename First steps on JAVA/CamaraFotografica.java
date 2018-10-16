import java.util.*;
public class CamaraFotografica{
	private int numCarretes, fotosValidas, fotosVeladas;
	private Carrete carrete;
	public CamaraFotografica(){
		numCarretes=fotosValidas=fotosVeladas=0;
		carrete=null;
	 }
	 public void ponerCarrete(Carrete c){
		 if (!hayCarrete()){
			 carrete=c;
		 }
	 }
	 public boolean hayCarrete(){
		 if(carrete=null){
			 return false;
		 }else{
			 return true;
		 }
	 }
	 public boolean sePuedeHacerFoto(){
		 if(hayCarrete() && carrete.sePuedeHacerFoto()){
			 return true;
		 }else{
			 return false;
		 }
	 }
	 public void nuevaFotografía(){
		 if(sePuedeHacerFoto()){
			 carrete.nueva;
		 }else{
			 System.out.println("No se pudo hacer la fotografia.");
		 }
	 }
	 public void quitarCarrete(){
		 if(hayCarrete()){
			 fotosValidas+=carrete.revelar();
			 fotosVeladas+=carrete.FotosVeladas();
			 carrete=null;
		 }else{
			 System.out.println("No se pudo quitar el carrete.");
		 }
	 }
