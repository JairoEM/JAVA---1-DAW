public class MainRectangulo{
	public static void main (String[] arg){
		Rectangulo rec1=new Rectangulo(5.0, 7.5);
		System.out.println("Area="+rec1.area());
		System.out.println("Perimetro="+rec1.perimetro());
		System.out.println("Base="+rec1.getAncho());
		System.out.println("Altura="+rec1.getLargo());
		System.out.println("Numero de rectangulos="+rec1.getNumObjetos());
		Rectangulo rec2=new Rectangulo(3.0, 4.0);
		System.out.println("Area="+rec2.area());
		System.out.println("Perimetro="+rec2.perimetro());
		System.out.println("Base="+rec2.getAncho());
		System.out.println("Altura="+rec2.getLargo());
		System.out.println("Numero de rectangulos="+rec2.getNumObjetos()); // cualquiera que este por encima
	}
}
