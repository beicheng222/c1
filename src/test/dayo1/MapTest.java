package test.dayo1;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    @Test
     public void test1(){
        Map map=new HashMap();
        map.put(null,123);
        System.out.println(map);
    }
    @Test
    public void test2(){
        Map map=new HashMap();
        map=new LinkedHashMap();
        map.put(123,"AA");
        map.put(345,"BB");
        map.put(12,"CC");

        System.out.println(map);

    }
    @Test
    public void test3(){
        Map map=new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        //修改
        map.put("AA",87);
        System.out.println(map);
        Map map1 = new HashMap();
        map1.put("CC",123);
        map1.put("DD",123);

        map.putAll(map1);
              System.out.println(map);

        //remove(Object key)
        Object value = map.remove("CC");
        System.out.println(value);
        System.out.println(map);

        //clear()
        map.clear();//与map = null操作不同
        System.out.println(map.size());
        System.out.println(map);
    }
}
