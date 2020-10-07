package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		// ### Recebendo os valores funcao
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

		/// ### Passando os valores
		System.out.println(media.apply(9.8, 5.7));

		// ### Calcula media e retorna um status funcao
		BiFunction<Double, Double, String> resultado 
		= (n1, n2) -> { double notaFinal = (n1 + n2) /2;
		  return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		  };
		  
		  System.out.println(resultado.apply(9.7, 4.1));
		  
	      /// ### Composicao
		  Function<Double, String> conceito = m ->
		  m >= 7? "Aprovado" : "Reprovado";
		  
		  System.out.println(media.andThen(conceito).apply(9.7, 4.1));
	}

}
