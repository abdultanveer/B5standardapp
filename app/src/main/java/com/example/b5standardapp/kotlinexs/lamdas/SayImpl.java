package com.example.b5standardapp.kotlinexs.lamdas;

public class SayImpl implements Sayable{
    @Override
    public void say(String message) {
        System.out.println("sayinng"+message);
    }
}
