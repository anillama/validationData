package com.data.controller;

import java.util.concurrent.ExecutionException;

public class TestClass {

    public static boolean checkDate(String val) {
        if(val == "duplicate") {
            return true;
        }
        return false;
    }


    public static void main(String [] args) throws ExecutionException, InterruptedException {
        String dub = "duplicate";
       if(!checkDate(dub)){
           System.out.println("Not Dublicate");
       }
       else {
           System.out.println("Dublicate");
           //checking revert data
       }

    }
}
