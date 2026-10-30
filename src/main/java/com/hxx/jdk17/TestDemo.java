package com.hxx.jdk17;

import org.junit.Test;

import java.util.Map;

public class TestDemo {

    public void show(){
        int i = 100;
        var n = 200;
    }

    public record Person(String name,int age){}

    @Test
    public void test1() {
       int key = 1;
       switch (key){
           case 1 -> System.out.println("1");
           case 2 -> System.out.println("2");
           default -> System.out.println("3");
       }
    }

    @Test
    public void test2(){
        Object obj = "hello";
       /* if (obj instanceof String){
            String str = (String) obj;
            System.out.println(str.toUpperCase());
        }*/
        if (obj instanceof String str){
            System.out.println(str.toUpperCase());
        }
    }
    @Test
    public void test3(){
        Map<String, Integer> map = Map.of("a", 1, "b", 2);
        System.out.println(map);
    }
}
interface A{

    private static void show(){}
}






















