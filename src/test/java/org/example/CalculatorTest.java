package org.example;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest extends TestCase {


    Card card2 = new Card("silver");
    Card card =  new Card("gold");

    Person person;
    Person person2;
    Person person3;
    Person person4;


    @BeforeClass
    public  void  setUp()   {

        person = new Person("John", card, false, false);
        person2 = new Person("Alice", card2, false, true);
        person3 = new Person();
        person3.setName("Bob");
        person3.setCard(card);
        person3.setIsAffiliate(true);
        person3.setIsOver2YearsCustomer(false);
        person4 = new Person("Bob", card, true, true);


    }


    @Test
    public void testCalculateDiscount() {
        assertEquals(65.0, Calculator.calculateDiscount(person, 200, false));
        assertEquals(130.0, Calculator.calculateDiscount(person, 400, false));
        assertEquals(195.0, Calculator.calculateDiscount(person, 600, false));
        //isPhone true
        assertEquals(5.0, Calculator.calculateDiscount(person, 200, true));

        //isAffiliate true
        assertEquals(65.0, Calculator.calculateDiscount(person3, 200, false));
        assertEquals(130.0, Calculator.calculateDiscount(person3, 400, false));

        //isAffiliate true and isPhone true
        assertEquals(5.0, Calculator.calculateDiscount(person3, 200, true));
        assertEquals(10.0, Calculator.calculateDiscount(person3, 400, true));

    }

    @Test
    public void testCalculateNetPayableAmount() {

    assertEquals(270.0, Calculator.calculateNetPayableAmount(person, 400, false));
    assertEquals(405.0, Calculator.calculateNetPayableAmount(person, 600, false));
    assertEquals(540.0, Calculator.calculateNetPayableAmount(person, 800, false));
    assertEquals(675.0, Calculator.calculateNetPayableAmount(person, 1000, false));
    //isPhone true
    assertEquals(195.0, Calculator.calculateNetPayableAmount(person, 200, true));
    assertEquals(390.0, Calculator.calculateNetPayableAmount(person, 400, true));
    //isAffiliate true
    assertEquals(135.0, Calculator.calculateNetPayableAmount(person3, 200, false));


    //isAffiliate true and isPhone true
    assertEquals(195.0, Calculator.calculateNetPayableAmount(person3, 200, true));
    assertEquals(390.0, Calculator.calculateNetPayableAmount(person3, 400, true));

    }
}