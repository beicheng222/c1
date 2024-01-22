package test.dayo1;

import day06.src.com.atguigu.java.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ForTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);
        for(Object obj:coll){
            System.out.println(obj);
        }
    }
    @Test
    public void test2(){
        int[] arr=new int[]{1,2,3,4,5,6,7};
        for(int i:arr){
            System.out.println(i);
        }
    }
}
