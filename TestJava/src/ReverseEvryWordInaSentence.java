public class ReverseEvryWordInaSentence {

    public static String reverseEvryWordInaSentence(String input)
    {
        String [] charachter = input.split(" ");
        StringBuilder  result = new StringBuilder();
        for(String word : charachter)
        {

            result = result.append(new StringBuilder(word).reverse());
            result.append(" ");

        }

        return result.toString();

    }
    public static String reverseSentence(String input)
    {
        String[] words = input.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1;i>=0;i--)
        {
            sb=sb.append(words[i]);
            if(i>0)
            {
                sb.append(" ");
            }
        }

        return sb.toString();

    }

    public static void main(String [] args)
    {
        String input = " The sky is blue ";
        input = reverseEvryWordInaSentence (input) +" ";
        System.out.println(input.trim());
//        String input_One = reverseSentence(input);
//        System.out.println(input_One);
    }

}
