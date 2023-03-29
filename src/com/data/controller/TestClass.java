package com.data.controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

public class TestClass {

    public static boolean checkDate(String val) {
        if(val == "duplicate") {
            return true;
        }
        return false;
    }


    public static void main(String [] args) throws ExecutionException, InterruptedException {
        AtomicBoolean alreaydExits = new AtomicBoolean(false);

        if (alreaydExits.compareAndSet(false, true)) {
            System.out.println("True " + alreaydExits);
        } else {
            System.out.println("Else part");
        }

    }
}
