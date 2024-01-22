package test.dayo1;

import day06.src.com.atguigu.java1.User;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;

public class TreeSet {
    @Test
    public void test(){
        Comparator com=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof day06.src.com.atguigu.java1.User && o2 instanceof day06.src.com.atguigu.java1.User){
                    day06.src.com.atguigu.java1.User u1 = (day06.src.com.atguigu.java1.User)o1;
                    day06.src.com.atguigu.java1.User u2 = (User)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }else{
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };
        java.util.TreeSet set = new java.util.TreeSet(com);
        set.add(new User("Tom",12));
        set.add(new User("Jerry",32));
        set.add(new User("Jim",2));
        set.add(new User("Mike",65));
        set.add(new User("Mary",33));
        set.add(new User("Jack",33));
        set.add(new User("Jack",56));


        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}



