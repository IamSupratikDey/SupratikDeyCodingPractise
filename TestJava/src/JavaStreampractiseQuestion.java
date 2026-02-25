import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreampractiseQuestion {

    public static void printOutput(List<List<String>>listOfList)

    {
        List<String> resultantString = listOfList.stream()
                        .flatMap(List::stream)
                                .filter(s->s.startsWith("P"))
                                        .map(String::toUpperCase)
                                                .distinct()
                                                        .sorted()
                                                                .collect(Collectors.toList());


        resultantString.forEach(System.out::println);

    }

    public static void main(String[] args)
    {
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("Pokemon", "Bayblade", "Hentai"),
                Arrays.asList("Rock", "Peacock" , "Pussy"),
                Arrays.asList("Paneer", "Football", "Chicken")
        );

        listOfList.forEach(System.out::println);
        printOutput(listOfList);

    }
}
