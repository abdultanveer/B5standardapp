package com.example.b5standardapp.kotlinexs.lamdas;

public class ReceiverPhone implements MobilePhone{
    @Override
    public void printResult(int result) {
        System.out.println("the result is--"+result);
    }
}
