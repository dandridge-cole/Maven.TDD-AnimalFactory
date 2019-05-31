package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.Dog;
import java.util.Date;
//import java.text.DateFormat;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void dogTest(){
        String expectedName = "";
        Date expectedBDate= null;
        Integer expectedId=0;

        Dog thisDog = new Dog(expectedName,expectedBDate,expectedId);

        String actualName=thisDog.getName();
        Date actualBDate=thisDog.getBirthDate();
        Integer actualId=thisDog.getId();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedBDate,actualBDate);
        Assert.assertEquals(expectedId,actualId);
    }
    // TODO - Create tests for `speak`

    @Test
    public void speakTest(){
        String expected = "bark!";
        Dog dog = new Dog(null,null,null);
        String actual = dog.speak();
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBDTest(){
        Date expected=new Date("12/15/06");
        Dog dog = new Dog(" ",expected,null);
        Date actual =  dog.getBirthDate();
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eat(){
        Dog dog = new Dog(null, null, null);
        Food expected = new Food();
        int before = dog.getNumberOfMealsEaten();
        dog.eat(expected);
        int after = dog.getNumberOfMealsEaten();
        Assert.assertEquals(before+1,after);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getId(){
        Integer expected =42;
        Dog dog = new Dog(null, null, expected);
        Integer actual = dog.getId();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfAnimalTest(){
        Boolean expected=true;
        Dog dog = new Dog(null,null,null);
        Boolean actual = dog instanceof Animal;
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfMammalTest(){
        Boolean expected=true;
        Dog dog = new Dog(null,null,null);
        Boolean actual = dog instanceof Mammal;
        Assert.assertEquals(expected,actual);
    }



    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
