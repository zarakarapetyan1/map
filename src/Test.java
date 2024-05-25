import java.util.Set;

public class Test {
    public static void main(String[] args) {
        MyMap<Integer, String> map = new MyMap<>();
        map.put(15, "Zara");
        map.put(15, "Aram");
        map.put(5, "Ani");
        System.out.println(map);
        System.out.println(map.containsKey(15));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsKey(3));
        Set<Zuyg<Integer, String>> zuyg = map.zuyg();
        System.out.println(zuyg);
        Set<Integer> integers = map.keySet();
        System.out.println(integers);
        System.out.println(map.get(5));
        System.out.println(map.get(15));
        System.out.println(map.get(9));
    }
}
