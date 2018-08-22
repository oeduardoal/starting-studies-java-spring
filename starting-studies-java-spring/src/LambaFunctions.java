import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambaFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro[] carros = {
				new Carro("Ford", "Corcel", 1985, 2000), new Carro("Ford", "Fiesta", 2015, 15000),
				new Carro("Ford", "Ranger", 2014, 75000), new Carro("Fiat", "Uno", 1999, 5000),
				new Carro("Fiat", "Palio", 2014, 10000), new Carro("Chevrolet", "Cobalt", 2017, 40000),
				new Carro("Chevrolet", "Onix", 2016, 30000), new Carro("Chevrolet", "Vectra", 2010, 23000),
				new Carro("Kia", "Sportage", 2014, 70000), new Carro("Toyota", "Corolla", 2018, 98000)
			};
		
		
		List<Carro> lista = Arrays.asList(carros);
		
		// Todos os Modelos
		lista.stream().forEach( e -> System.out.printf("%s\n", e.getModelo()) );
		
		Predicate<Carro> carrosEntre = e -> ( e.getAno() >= 2000 && e.getAno() <= 2015 );
		
		lista.stream().filter(carrosEntre).forEach(System.out::println);

	}

}
