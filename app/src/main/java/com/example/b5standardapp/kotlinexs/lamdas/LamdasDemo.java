package com.example.b5standardapp.kotlinexs.lamdas;

public class LamdasDemo {

    public static void main(String[] args) {
        SayImpl s2 = new SayImpl();
        s2.say("how are you");

        Sayable s1 = (msg) -> {
            System.out.println("im saying --"+msg);
        };
        s1.say("hope ur good");
    }
}
