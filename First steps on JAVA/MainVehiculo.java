public class MainVehiculo{
	public static void main (String[] arg){
		Coche coche1=new Coche();
		Avion avion1=new Avion();
		CocheAcuatico acuatico1=new CocheAcuatico();
		System.out.println("Primero veamos el funcionamiento del coche aciendo un par de acciones e imprimiento su estado para ver el avance del programa:");
		coche1.imprimeEstado();
		coche1.arrancar();
		coche1.mover();
		coche1.imprimeEstado();
		coche1.mover(6);
		coche1.girar(6);
		coche1.imprimeEstado();
		coche1.mover();
		coche1.girar(-1);
		coche1.imprimeEstado();
		coche1.mover(3);
		coche1.parar();
		coche1.imprimeEstado();
		System.out.println("");
		System.out.println("-------------------------------------------------");
		System.out.println("En segundo lugar vamos a ver el funcionamiento del avion:");
		avion1.imprimeEstado();
		avion1.arrancar();
		avion1.despegar();
		avion1.imprimeEstado();
		avion1.subir(5);
		avion1.girar(3);
		avion1.mover(4);
		avion1.imprimeEstado();
		avion1.bajar(5);
		avion1.girar(-2);
		avion1.parar();
		avion1.mover();
		avion1.imprimeEstado();
		avion1.bajar(6);
		avion1.parar();
		avion1.imprimeEstado();
		System.out.println("-------------------------------------------------");
		System.out.println("Para finalizar vamos a ver el funcionamiento del coche acuatico:");
		acuatico1.imprimeEstado();
		acuatico1.arrancar();
		acuatico1.mover();
		acuatico1.cambioDeMedio();
		acuatico1.imprimeEstado();
		acuatico1.mover(2);
		acuatico1.girar(8);
		acuatico1.inmersion();
		acuatico1.imprimeEstado();
		acuatico1.mover();
		acuatico1.girar(-1);
		acuatico1.descender(5);
		acuatico1.imprimeEstado();
		acuatico1.mover(3);
		acuatico1.ascender(6);
		acuatico1.cambioDeMedio();
		acuatico1.parar();
		acuatico1.imprimeEstado();
	}
} 
