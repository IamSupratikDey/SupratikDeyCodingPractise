import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class RemoveDuplicateFromAnArrayList {

    public static void main(String [] args)
    {
        ArrayList<String> duplicateArrayList  = new ArrayList<>();
        duplicateArrayList.add("Apple");
        duplicateArrayList.add("Banana");
        duplicateArrayList.add("Apple");
        duplicateArrayList.add("Cycle");
        duplicateArrayList.add("Horse");
        duplicateArrayList.add("Apple");

        ArrayList<String> removedDuplicate = new ArrayList<>();

        removedDuplicate = removeDSuplicateFromArrayList(duplicateArrayList);

        for (String removedArrayList : removedDuplicate)
        {
            System.out.println("The words are : " + removedArrayList);
        }
    }

    public static ArrayList<String> removeDSuplicateFromArrayList(ArrayList<String> duplicateArrayList)
    {
        HashSet<String> uniqueHashSet  = new HashSet<>(duplicateArrayList);

        duplicateArrayList.clear();
        duplicateArrayList.addAll(uniqueHashSet);

        return duplicateArrayList;

    }
}
