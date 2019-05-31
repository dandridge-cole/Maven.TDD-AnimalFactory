package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest(){
        String expected = "Snowball";
        Cat cat = new Cat(expected,null,null);
        String actual = cat.getName();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        String expected = "meow!";
        Cat cat = new Cat(null,null,null);
        String actual = cat.speak();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBDTest(){
        Date expected=new Date("12/15/06");
        Cat cat = new Cat(" ",expected,null);
        Date actual =  cat.getBirthDate();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eat(){
        Cat cat = new Cat(null, null, null);
        Food expected = new Food();
        int before = cat.getNumberOfMealsEaten();
        cat.eat(expected);
        int after = cat.getNumberOfMealsEaten();
        Assert.assertEquals(before+1,after);
    }

    // TODO - Create tests for `Integer getId()`
    public void getId(){
        Integer expected =42;
        Cat cat = new Cat(null, null, expected);
        Integer actual = cat.getId();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    public void instanceOfAnimalTest(){
        Boolean expected=true;
        Cat cat = new Cat(null,null,null);
        Boolean actual = cat instanceof Animal;
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfMammalTest(){
        Boolean expected=true;
        Cat cat = new Cat(null,null,null);
        Boolean actual = cat instanceof Mammal;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
