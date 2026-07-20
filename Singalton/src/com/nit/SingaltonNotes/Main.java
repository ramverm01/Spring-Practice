package com.nit.SingaltonNotes;

public class Main
{
    public static void main(String[] args)
    {
        Application1 obj1 = Application1.getObject();
        System.out.println("HashCode from Main : " + obj1.hashCode());
        Application2 app2 = new Application2();
        app2.fetchObject();
    }
}