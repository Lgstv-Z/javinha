public class Inferencia {

		/** 
		 *  Inferência - é o processo lógico de deduzir conclusões a partir de premissas, evidências ou pistas, indo além do que está explicitamente escrito.
		 * É uma interpretação baseada em fatos, indícios e conhecimento prévio, permitindo entender intenções implícitas em textos ou situações, funcionando como uma ponte entre o que foi dito e o que se conclui.	
		*/

	public static void main(String[] args){
		// Uso de var em Java
		/* 
			- Var foi introduziada no Java 10.
			- Declarar uma variável.
			- Inferência de valor.
		*/

		var numero = 10; // inferência int  
		var usuario = new Inferencia(); // inferência do tipo Usuario

		// Limitações do Var
		/*
			- Variáveis locais.
			- Valores nulos.
		*/

		System.out.println(numero);
		System.out.println(usuario);
	}
}