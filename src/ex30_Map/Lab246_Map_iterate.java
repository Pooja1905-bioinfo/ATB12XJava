package ex30_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab246_Map_iterate {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap();
        map.put("id",123);
        map.put("id",123);
        map.put("id2",123);
        map.put(null,123);
        map.put("id5",null);
        map.put(null,1234);
        System.out.println(map.size());

        for(Map.Entry<String, Object> item : map.entrySet()){
            System.out.println(item.getKey() + "->" + item.getValue());
        }
    }
}
