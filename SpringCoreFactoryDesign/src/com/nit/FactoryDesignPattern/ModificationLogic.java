package com.nit.FactoryDesignPattern;

public class ModificationLogic
{
    public String modifyMessage(String message, String type)
    {
        Logic converter = Factory.factoryMethod(type);
        return converter.convertTo(message);
    }
}