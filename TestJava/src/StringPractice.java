public class StringPractice {


    public static String stringReverse(String inputString)
    {
        String resultString = "";
        int length = inputString.length();
        int j=length-1;

        while(j>=0)
        {
          if(inputString.charAt(j)==' ')
          {
              j--;
          }
          else
              resultString = resultString+inputString.charAt(j);
          j--;
        }



        return  resultString.toString();
    }

//    public static String sentenceReverse(String inputString)
//    {
//        return "";
//    }

    public static void main(String[]args)
    {
        String reverseAString = " Encyclopedia      ";
        String reverseASentence = "The Sy is Blue and Clear";


        reverseAString = stringReverse(reverseAString);
        System.out.println(reverseAString);

//        reverseASentence = sentenceReverse(reverseASentence);
//        System.out.println(reverseASentence);
    }
}
