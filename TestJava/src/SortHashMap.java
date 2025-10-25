import java.util.*;
import java.util.stream.Collectors;

public class SortHashMap {

    public static void main(String [] atgs)
    {
        Map<String, Integer> executionTime = Map.of(
                "LoginTest", 5,
                "HomePageTest", 3,
                "SearchTest", 8,
                "CartTest", 6
        ) ;

        /**
         * Sorting of the map using java stream api
         */

        Map<String, Integer> execuitionTimeSorted = executionTime.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry :: getKey,
                        Map.Entry :: getValue,
                        (e1,e2) -> e1,
                        LinkedHashMap::new
                ));

        execuitionTimeSorted.forEach((k,v)->System.out.println("Key"+" "+
                k+" "+"Value"+" "+v));

        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry", "cherry");

        /**
         * Grpups word by there first letter using java stream api
         */
        Map<Character, List<String>> groupedStrings = words.stream()
                .collect(Collectors.groupingBy(w->w.charAt(0)));

        List<String> a = groupedStrings.getOrDefault('a', Collections.emptyList());
        List<String> b = groupedStrings.getOrDefault('b', Collections.emptyList());
        List<String> C = groupedStrings.getOrDefault('c', Collections.emptyList());
        List<String> d = groupedStrings.getOrDefault('d', Collections.emptyList());

        System.out.println("a = " + a); // [apple, apricot]
        System.out.println("b = " + b); // [banana, blueberr
        System.out.println("c = " + b);
        System.out.println("d = " + b);
    }
}
