public class Paga{
	public static void main(String []arg){
		double precio, unidad, paga;
		System.out.print("Introduce el precio por el que se ha vendido el producto:");
		precio=EntradaConsola.leeEntero();
		System.out.print("Introduce la cantidad de unidades que se han vendido del producto:");
		unidad=EntradaConsola.leeEntero();
		paga=((precio*unidad)/5);
		System.out.println("Los fabricantes han ganado "+paga+"euros.");
		System.out.print("El diseñador ha ganado "+(2*paga)+"euros.");
	}
}
