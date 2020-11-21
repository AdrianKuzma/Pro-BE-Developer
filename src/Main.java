import java.util.*;

class Main
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        Person person1 = new Person("John",25,5000);
        Person person2 = new Person("Martin",52,6000);
        Set<Integer> hashbrowns = new HashSet<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5));
        Map<String, Integer> map = new HashMap<>();
        map.put("Red", 1); map.put("Green", 2); map.put("Black", 3); map.put("White", 4);
        String k = " Klúč ";  int h = 5;
        exc(list);
        totalBudget(new Person[]{person1,person2});
        contA(new Person[]{person1,person2});
    }

    private static void exc (List<Integer> list){
        if(list.isEmpty())
            System.out.println("List je prázdny");
        else
            list.forEach(System.out::println);
    }
    
    public static void addIfNotExists(int f, List<Integer>list){
        if (list.contains(f))
            System.out.println("Already Contains");
        else list.add(f);
    }
    
    public static void odd(List<Integer>list){
        list.removeIf(n -> n%2 == 0);
    }
    
    public static void even (List<Integer>list){
        list.removeIf(n -> n%2 == 1);
    }
    
    public static void length(List <Integer> list){
        list.stream().map(a -> a * list.size()).forEach(System.out::print);
    }

    public static void totalBudget(Person[] people){
        System.out.println(Arrays.stream(people).map(Person::getBudget).reduce(0, Integer::sum));
    }

    public static boolean contA (Person[] people){
        return Arrays.stream(people).anyMatch(person -> person.getName().contains("a"));
    }

    public static void set (Set<Integer> hashbrowns){
        hashbrowns.forEach(System.out::println);
    }

    public  static void map (Map<String, Integer> map){
        System.out.println(map);
    }

    public static void mapadd (Map<String, Integer> map, String k, Integer h) {
        map.putIfAbsent(k, h);
    }
}