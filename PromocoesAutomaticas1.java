public class PromocoesAutomaticas1 {
	public static void main(String[] args){

		// Se um operando é long, o outro é promovido para long
		int a = 10;
		long b = 15L;
		long c = a + b;

		System.out.println(c);
	}
}