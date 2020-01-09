import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Burger b1 = new Burger(3,"giant",true,false,5);
        Burger b2 = new Burger(2,"poivre", true, true, 3.8);
        Burger b3 = new Burger(1,"ketchup", false, false, 1.20);
        Burger b4 = new Burger(2,"giant", true, true, 4.2);
        Burger b5 = new Burger(4,"ketchup",3.8);

        List<Burger> burgers = Arrays.asList(b1,b2,b3,b4,b5);

        Stream<Burger> streamBurger = burgers.stream()
                .filter(b -> b.getNbViande() >= 3);

        List<Personne> personnes = new ArrayList<>();

        List<ContactInfo> contacts = personnes.stream()
                .filter(p -> p.getTelephone() != null)
                .map(p -> new ContactInfo(p.getNom(), p.getTelephone()))
                .collect(Collectors.toList());

        personnes.stream()
                .map(p -> p.getTelephones());
        Stream<String> strings = personnes.stream()
                .flatMap(personne -> personne.getTelephones().stream());


        burgers.stream()
                .sorted((burg1, burg2) -> burg1.compareTo(burg2))
                .forEach(System.out::println);
        List<Burger> burgersFiltres = streamBurger.collect(Collectors.toList());

        DoubleStream strDouble = burgers.stream()
                .mapToDouble(Burger::getPrice);

        DoubleSummaryStatistics statistics = strDouble.summaryStatistics();

        //burgersFiltres.stream()
                //.forEach(b -> System.out.println(b));

    }
}
