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


    public  int abdulAdd(int a, int b){
        return a + b;
    }

    public  void ansariAdd(int c, int d,MobilePhone mobilePhone){
        System.out.println("annsari is started addinng");
        try {
            Thread.sleep(5000);
            int result = c + d;
            mobilePhone.printResult(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
