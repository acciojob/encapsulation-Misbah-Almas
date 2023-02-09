package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj1 = new RWOnly();

//        obj1.name = AccioJob;
//        System.out.println(name);
//        'name' has private access in 'com.driver.RWOnly'
        obj1.setName("AccioJob");
        System.out.println(obj1.getName());
    }
  
}