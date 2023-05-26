import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        ArrayList<Integer> filteredList = new ArrayList<>();

        //    intList.filter();
        for (int entry: intList) {
            if (entry > 0 && entry % 2 == 0) {
                filteredList.add(entry);
            }
        }
            System.out.println(filteredList);
    }
}
