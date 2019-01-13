package com.tusker.test;

import com.tusker.main.App;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AppTest {

    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(outputStream));
    }


    @Test
    public void testAppMain(){
        App.main(null);
        try {
            assertEquals("Hello World"+System.getProperty("line.separator"), outputStream.toString());
        } catch (Exception e){
            fail("message is not hello world");
        }
        //assertEquals("Hello World","Hello World");
    }


    @After
    public void cleanUpStream(){
        System.setOut(null);
    }
}