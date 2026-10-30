package com.hxx.lambda;

import com.hxx.domain.Person;
import org.junit.Test;

import java.util.*;

/**
 * 函数式接口：接口有且只有一个必须要实现的方法
 */
public class TestDemo {
    @Test
    public void test1(){
        Runnable runnable = ()-> System.out.println("hello world");
        new Thread(runnable).start();
    }
    @Test
    public void test2(){
        Dao dao = ()-> System.out.println("save data");
        dao.save();
    }
    @Test
    public void test3(){
        Dao1 dao1 = ()-> 1+2;
        System.out.println(dao1.sum());
        dao1 = ()-> {
            return 2 + 3;
        };
        System.out.println(dao1.sum());
    }

    @Test
    public void test4(){
        Dao2 dao2 = (x,y)-> x+y;
        System.out.println(dao2.sum(1,2));
    }
    @Test
    public void test5(){
        TreeSet<Integer> set = new TreeSet<>((x,y)->y-x);
        set.add(3);
        set.add(1);
        set.add(6);
        set.add(2);
        set.add(5);
        set.forEach(System.out::println);
    }
    @Test
    public void test6(){
        TreeSet<Person> set = new TreeSet<>((x, y)->y.getAge()-x.getAge());
        set.add(new Person(1001, "hxx", 18));
        set.add(new Person(1002, "hxx2", 19));
        set.add(new Person(1003, "hxx3", 20));
        set.forEach(System.out::println);
    }
    @Test
    public void test7(){
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream().filter(x->x%2==0).forEach(System.out::println);
    }
    @Test
    public void test8(){
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream().map(x->x+"hello").forEach(System.out::println);
    }
    @Test
    public void test9(){
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Integer reduce = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(reduce);
        list.stream().reduce(0, Integer::sum);
    }

}

@FunctionalInterface
interface Dao{
    void save();
}

@FunctionalInterface
interface Dao1{
    int sum();
}
@FunctionalInterface
interface Dao2{
    int sum(int i,int n);
}

























