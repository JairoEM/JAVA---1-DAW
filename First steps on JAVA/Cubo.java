import java.util.*;
public class Cubo extends Prisma{
	public Cubo (double lado){
		super(lado, lado, lado);
	}
	public Cubo(){
		this(1.0);
	}
}
