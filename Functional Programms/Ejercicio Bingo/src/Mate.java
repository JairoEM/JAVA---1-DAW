public class Mate{
	public static int factorial(int n){
		int fact = 1 ;
		for (int i = n ; i >= 1 ; i -- ){
			fact = fact * i;
		}
		return fact;
	}
	public static boolean primo(int p){
		boolean primo = true;
		int i = 2;
		while (i < p){
			if (p % i ==0){
				return false;
			}
			i++;
		}
		return true;
	}
	public static int sumaDivisores(int num){
		int cont = 0;
		for (int i= 1; i <= num ; i++ ){
			if (num % i == 0){
				cont = cont + i;
			}
		}
		return cont;
	}
	public static boolean perfecto(int per){
		if (sumaDivisores(per) == per){
			return true;
		}
		return false;
	}
	
	public static boolean amigos(int num1, int num2){
		if (sumaDivisores(num1) == num2 && sumaDivisores(num2) == num1){
			return true;
		}	
		return false;
	}
	public static int elMenor(int n1, int n2){
		if (n1 >= n2){
			return n2;
		}else{
			return n1;
		}
	}
	public static int[] ordenarArray(int[] n) {
            int aux;
            for (int i = 0; i < n.length - 1; i++) {
                for (int x = i + 1; x < n.length; x++) {
                    if (n[x] < n[i]) {
                        aux = n[i];
                        n[i] = n[x];
                        n[x] = aux;
                    }
                }
            }

            return n;
        }
        
	public static boolean primos(int num1, int num2){
		boolean primos = true;
		for (int i = 2; i <= elMenor(num1,num2) ; i++ ){
			if (num1 % i == 0 && num2 % i == 0){
				primos = false;
			}
		}
		return primos;
	}
	public static int euler(int n){
		int cont = 0;
		for (int i = 1; i < n ; i++ ){
			if (primos(i,n) == true){
				cont++;
			}
		}
		return cont;
	}
	public static int potencia(int n1, int n2){
		int potencia = n1;
		for (int i = 1; i <= n2 ; i++ ){
			potencia *= n2;
		}
		return potencia;
	}
        public static double divide(double dividendo, double divisor) throws DivisionPorCeroException{
                if(divisor==0){
                        DivisionPorCeroException divExcep=new DivisionPorCeroException();
                        throw divExcep;
                }else{
                    return dividendo/divisor;
                }
        }
}
