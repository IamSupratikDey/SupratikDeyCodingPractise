import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicatesInAGivenString {

    public static void findDuplicatesInaGivenstring(String str)
    {
          int size = str.length();
          HashMap <Character, Integer> storeCharacter  = new HashMap<>();

          for(int i=0; i<size; i++)
          {

              storeCharacter.put(str.charAt(i), storeCharacter.getOrDefault(str.charAt(i),0)+1);

          }

        for (Map.Entry<Character, Integer> entry : storeCharacter.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


          for(Map.Entry<Character, Integer> map : storeCharacter.entrySet())
          {
              if(map.getValue()>1)
              {
                  System.out.println("This ->"+" "+map.getKey()+" "+"character is repeated"+" "+map.getValue()+" "+"times");
              }
          }
    }

    public static void convertString(String str)
    {
       StringBuilder sb = new StringBuilder();

       for(char ch : str.toCharArray())
       {
           if(ch >= 'a' && ch <= 'z')
           {
               sb.append((char) (ch-32));
           } else if (ch >= 'A' && ch<='Z') {

               sb.append((char) (ch+32));
           }
           else {
               // Non-alphabetic characters remain unchanged
               sb.append(ch);
           }


       }
       System.out.println(sb.toString());

    }

    public void countFrequencyOfCharacterUsingStreamApi(String str)
    {
        List<String> characters = Arrays.asList(str.split(""));

        Map<String, Long> frequecyCount = characters.stream()
                .collect(Collectors.
                        groupingBy(
                                ch->ch,
            Collectors.counting()
                        ));

        frequecyCount.forEach((ch, count) ->
                System.out.println(ch + " → " + count));
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String input = sc.nextLine();
        sc.close();

//        findDuplicatesInaGivenstring(input);
        convertString(input);
    }
}
