package test.dayo1;

import org.junit.Test;

import java.util.*;

public class CollectionTest {
    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());
        System.out.println(coll.size());
        Collection coll1=new ArrayList();
        coll1.add(456);
        coll1.add("CC");
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll);
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());
    }
    @Test
    public void test2(){
     Collection coll=new ArrayList();
     coll.add(123);
     coll.add(345);
     coll.add(new String("Tom"));
     coll.add(false);
     coll.add(new Person("hexingui",20));
    boolean contains=coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
        System.out.println(coll.contains(new Person("hexingui",20)));
   Collection coll1= Arrays.asList(123,345);
        System.out.println(coll.containsAll(coll1));
    }
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new day06.src.com.atguigu.java.Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        System.out.println(coll.hashCode());
   Object[] arr=coll.toArray();
   for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
   }
        List<String> list=Arrays.asList("AA","BB","CC");
        System.out.println(list);
List arr1=Arrays.asList(new int[]{123,345});
        System.out.println(arr1.size());
 List arr2=Arrays.asList(new Integer[]{123,345});
        System.out.println(arr2.size());

    }
}
