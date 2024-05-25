import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyMap<K extends Comparable<K>, V> {

    private Set<Zuyg<K, V>> zuygs = new HashSet<>();

    public Set<Zuyg<K, V>> zuyg() {
        return zuygs;
    }

    //by giving the key, it prints it's corresponding value
    public V get(K key) {
        for (Zuyg<K, V> zuyg : zuygs) {
            if (zuyg.key.equals(key)) {
                return zuyg.value;
            }
        }
        return null;
    }

    public Set<K> keySet() {
        Set<K> set = new HashSet<>();
        Iterator<Zuyg<K, V>> iterator = zuygs.iterator();
        while (iterator.hasNext()) {
            Zuyg<K, V> next = iterator.next();
            set.add(next.key);
        }
        return set;
    }

    public void put(K key, V value) {
        Iterator<Zuyg<K, V>> iterator = zuygs.iterator();
        while (iterator.hasNext()) {
            Zuyg<K, V> next = iterator.next();
            if (next.equals(new Zuyg<>(key, value))) {
                iterator.remove();
            }
        }
        zuygs.add(new Zuyg<>(key, value));
    }

    public boolean containsKey(K key) {
        return zuygs.contains(new Zuyg<>(key, null));
    }

    public String toString() {
        return "[" + zuygs + "]";

    }
}
