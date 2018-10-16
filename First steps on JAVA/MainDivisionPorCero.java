public class MainDivisionPorCero {
    public static void main(String [] args){
        System.out.println("CALCULADOR DE MEDIA");
        System.out.println("-------------------");
        System.out.println("Para finalizar el programa pulse 0...");
        System.out.println("Introduce el primer numero:");
        int num=EntradaConsola.leeEntero();
        int cont=0;
        int suma=num;
        do{
            System.out.println("Introduce el siguiente numero:");
            num=EntradaConsola.leeEntero();
            suma=suma+num;
            cont++;
        }while(num!=0);
        try{
            System.out.println("La media aritmetica es: "+Mate.divide(suma, cont));
        }catch(DivisionPorCeroException divExcep){
            System.out.println("No se puede divivir por cero");
        }
    }
}
