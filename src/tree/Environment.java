package tree;
import java.util.HashMap;
import java.util.Map;

public class Environment {

    private HashMap<String,Integer> map;

    public Environment() {
        map = new HashMap<String,Integer>();
    }

    public Integer lookup(String var) {
        return map.get(var);
    }

    public void set(String var, Integer val) {
        map.put(var, val);
    }

    public void print () {
        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
