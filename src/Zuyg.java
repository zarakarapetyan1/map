import java.util.Objects;

public class Zuyg<K extends Comparable<K>, V> implements Comparable<Zuyg<K, V>> {
    K key;
    V value;

    public Zuyg(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }


    @Override
    public int compareTo(Zuyg<K, V> o) {
        return this.key.compareTo(o.key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zuyg<?, ?> zuyg = (Zuyg<?, ?>) o;
        return Objects.equals(key, zuyg.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
