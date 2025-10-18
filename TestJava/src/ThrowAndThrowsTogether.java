import java.io.IOException;
import java.util.*;


public class ThrowAndThrowsTogether {

    public static void main (String [] args){
        try{
          findFileName("Data.txt");
        } catch (IOException e)
        {
            System.out.println("Exception handled in main: " + e.getMessage());
        }
    }

    public static void findFileName (String filename) throws  IOException
    {
        if(filename.equals("Data.txt"))
        {
            throw  new IOException("File not accessible or missing!");
        }
        else System.out.println("File is available for reading.");
    }

}
