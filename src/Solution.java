import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        // Read elements
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        ListIterator<Integer> it = list.listIterator();

        // Forward traversal
        System.out.print("Forward: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // Backward traversal
        System.out.print("\nBackward: ");
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }

        sc.close();
    }
}
