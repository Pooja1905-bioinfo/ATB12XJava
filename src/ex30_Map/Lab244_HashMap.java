package ex30_Map;

import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Map;

public class Lab244_HashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",123);
        map.put("id",123);
        map.put("id2",123);
        map.put(null,123);
        map.put("id5",null);
        map.put(null,1234);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue(123));
        System.out.println(map.containsKey(123));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));
        System.out.println(map.get("id2"));
    }
}
