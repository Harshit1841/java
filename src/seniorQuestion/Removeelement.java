import java.util.*;

public class Removeelement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 2, 2, 3, 4, 5));

        int val = 3; // element to remove

        list.removeIf(n -> n == val); // removes all 3s

        System.out.println("List after removing " + val + ": " + list);
    }
}