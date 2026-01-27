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

    public static String sentenceReverse(String inputString)
    {
        String resultString = "";
        int length = inputString.length();
        int j = length-1;
        int i = 0;

        while(j>0)
        {
            while(inputString.charAt(j)==' '  && j>0) j--;

            i=j;

            while(inputString.charAt(j)!=' ' && j>=0)j--;

            resultString = resultString+inputString.substring(j+1, i+1)+" ";
        }


        return resultString;
    }



    public static void main(String[]args)
    {
        String reverseAString = " Encyc   lopedia      ";
        String reverseASentence = "  The Sky is Blue and Clear   ";


//        reverseAString = stringReverse(reverseAString);
//        System.out.println(reverseAString);

        reverseASentence = sentenceReverse(reverseASentence);
        System.out.println(reverseASentence);
    }
}
