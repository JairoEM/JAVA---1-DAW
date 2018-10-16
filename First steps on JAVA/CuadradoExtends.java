public class CuadradoExtends extends Rectangulo{
	public CuadradoExtends (double lado){
		super(lado, lado);			// tambien puedes hacer base=lado , altura=lado
	}
	public CuadradoExtends(){
		this(1.0);
	}
}
