import java.util.*;;
public class LearnMap {
    public static void main(String[] args) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(1, 10);
        m.put(2, 20);
        // System.out.println(m.getOrDefault(3,0));
        System.out.println(m);
        m.put(2,m.getOrDefault(2, 1)+1);
        System.out.println(m);
        Map<Integer,Integer> m1=new TreeMap<>(Collections.reverseOrder());
        m1.put(1, 100);
        m1.put(2, 200);
        m1.put(3, 300);
        System.out.println(m1);
    }
}
