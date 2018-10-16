import java.util.*;
public class CartaPersonal{
	private static String palo, numero;
	private static double valor;	
	public Carta(String palo, String numero, double valor){
	this.palo=palo;
	this.numero=numero;
	this.valor=valor;	
	}
	public Carta(){
		int iNumero;
		iNumero=(int)(Math.random()*10+1);
		switch(iNumero){
			case 1: numero="as";break;
			case 2: numero="dos";break;
			case 3: numero="tres";break;
			case 4: numero="cuatro";break;
			case 5: numero="cinco";break;
			case 6: numero="seis";break;
			case 7: numero="siete";break;
			case 8: numero="sota";break;
			case 9: numero="caballo";break;
			case 10: numero="rey";break;
		}
		int iPalo;
		iPalo=(int)(Math.random()*4+1);
		if(iPalo==1){
			palo=" de espadas";
		}else{
			if(iPalo==2){
				palo=" de bastos";
			}else{
				if(iPalo==3){
					palo=" de copas";
				}else{
					palo=" de oros";
				}
			}
		}	
	}
	public double valorCarta(){
		if(numero=="as"){
			valor=1;
		}else{
			if(numero=="dos"){
				valor=2;
			}else{
				if(numero=="tres"){
					valor=3;
				}else{
					if(numero=="cuatro"){
						valor=4;
					}else{
						if(numero=="cinco"){
							valor=5;
						}else{
							if(numero=="seis"){
								valor=6;
							}else{
								if(numero=="siete"){
									valor=7;
								}else{
									valor=0.5;
								}
							}
						}
					}
				}
			}
		}
		return valor;
	}
	public String visualizarCarta(){
		return (numero+palo);
	}
}	
