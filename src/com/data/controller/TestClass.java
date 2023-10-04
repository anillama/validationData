package com.data.controller;

import com.data.vo.UserDao;

import java.util.*;
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
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("ANIL Lama");
        hash_Set.add("RNU LAMA");
        hash_Set.add("ANU Lama");

        UserDao userDao = new UserDao();
        userDao.setNames(hash_Set);

        System.out.println("Hee " + userDao.getNames());

    }
}
