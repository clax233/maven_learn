package com.chenluo.demo;

public class HelloText {
    public String sayHelloToFriend(String name){
        Hello hello = new Hello();
        String text = hello.sayHello(name);
        return text;
    }
}
