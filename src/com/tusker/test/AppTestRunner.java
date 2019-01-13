package com.tusker.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AppTestRunner {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses( AppTest.class );

        for( Failure failure : result.getFailures() ) {
            System.out.println(failure.toString());
        }

        try {
            System.out.println(result.wasSuccessful());
        } catch (Exception ex){
            System.out.println("Exception");
        } finally {
            System.out.println("finished.");
        }
    }
}
