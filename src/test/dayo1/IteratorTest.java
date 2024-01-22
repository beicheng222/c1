package test.dayo1;
import day06.src.com.atguigu.java.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
@Test
public void test1(){
    Collection coll = new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new Person("Jerry",20));
    coll.add(new String("Tom"));
    coll.add(false);
    Iterator iterator=coll.iterator();
    while (iterator.hasNext()){
        System.out.println(iterator.next());
    }
}
}
