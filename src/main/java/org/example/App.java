package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Person person1 =  new Person("Ahmet","Gold",true,true);

        System.out.println(Calculator.calculateNetPayableAmount(person1,100,false));

    }
}
