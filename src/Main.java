import java.util.ArrayList;
import java.util.Arrays;

class Main
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        exc(list);

    }

    private static void exc (ArrayList<Integer> list){
        if(list.isEmpty())
            System.out.println("List je prázdny");
        else
            list.forEach(System.out::println);
    }
    public static void addIfNotExists(int f, ArrayList<Integer>list){
        if (list.contains(f))
            System.out.println("Already Contains");
        else list.add(f);
    }
    public static void odd(ArrayList<Integer>list){
        list.removeIf(n-> n%2 == 0);
    }
    public static void even (ArrayList<Integer>list){
        list.removeIf(n-> n%2 == 1);

    }
}
