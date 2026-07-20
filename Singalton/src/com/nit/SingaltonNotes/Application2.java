package com.nit.SingaltonNotes;

public class Application2
{
    public void fetchObject()
    {
        Application1 obj2 = Application1.getObject();

        System.out.println("HashCode from Application2 : " + obj2.hashCode());
    }
}