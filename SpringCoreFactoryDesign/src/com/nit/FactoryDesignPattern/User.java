package com.nit.FactoryDesignPattern;

import java.util.Scanner;

public class User
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Upload your message or file");
        String message = sc.nextLine();

        System.out.println("Please select the conversion mode");
        String mode = sc.nextLine();

        System.out.println();
        System.out.println("Wait for a min......");

        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        ModificationLogic logic = new ModificationLogic();
        String result = logic.modifyMessage(message, mode);

        System.out.println();
        System.out.println(result);    

        sc.close();
    }
}