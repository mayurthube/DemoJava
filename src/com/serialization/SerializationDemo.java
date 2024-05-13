package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws Exception
    {
        Test input = new Test();
        input.password ="124578";
        input.age = 30;
        input.username="Mayur Thube";
        input.email="mayurthube@hotmail.com";
  
        // serialization
        FileOutputStream fos = new FileOutputStream("abc1.xml");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);
  
        // de-serialization
        FileInputStream fis = new FileInputStream("abc1.xml");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Test output = (Test)ois.readObject();
        System.out.println("age = " + output.age);
        System.out.println("password = " + output.password);
        System.out.println("username = " + output.username);
        System.out.println("email = " + output.email);
    }
}
