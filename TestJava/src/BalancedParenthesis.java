import java.util.Stack;

public class BalancedParenthesis {

   public static boolean isBalanced (String input)
   {
       Stack <Character> store = new Stack<>();

       for(Character ch : input.toCharArray())
       {
           if(ch == '(' || ch == '[' || ch=='{')
           {
               store.push(ch);
           } else if (ch == ')' || ch == ']' || ch=='}') {

               if (store.isEmpty())
                   return false;
               Character top = store.pop();

               if((ch==')' && top != '(') || (ch==']' && top != '[')
               || (ch=='}' && top != '{') )
               {
                   return false;
               }
           }
       }
       return  store.isEmpty();
   }


    public static void main(String [] args)
    {
        String input = "()[{} ()][";
        System.out.println(isBalanced(input) ? "Balanced" : "Not Balanced");
    }
}
