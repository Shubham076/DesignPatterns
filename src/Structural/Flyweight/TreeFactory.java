package Structural.Flyweight;
import java.util.Map;
import java.util.HashMap;
public class TreeFactory {
    private Map<String, TreeType> treeTypes = new HashMap<>();

    public TreeType getTree(String name, String color, String texture) {
        String key = name + color + texture;
        if (treeTypes.containsKey(key)) {
            return treeTypes.get(key);
        } else {
            if(name == "NEEM"){
                TreeType neemTree = new NeemTree(name, color, texture);
                treeTypes.put(name, neemTree);
                return neemTree;
            }
            else if(name == "OAK"){
                TreeType oakTree = new OakTree(name, color, texture);
                treeTypes.put(name, oakTree);
                return oakTree;
            }

            return null;
        }
    }
}
