package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest(){
        int testID=5;
        Dog expected = new Dog(null,null,testID);
        DogHouse dogHouse = new DogHouse();
        DogHouse.clear();
        dogHouse.add(expected);
        Dog actual = dogHouse.getDogById(testID);
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveDogByID(){
        int testID=5;
        Dog expected = null;
        Dog unexpected = new Dog(null,null,testID);
        DogHouse dogHouse = new DogHouse();
        DogHouse.clear();
        dogHouse.add(unexpected);
        dogHouse.remove(testID);
        Dog actual = dogHouse.getDogById(testID);
        Assert.assertEquals(expected,actual);
    }

    @Test
    // TODO - Create tests for `void remove(Dog dog)`
    public void testRemoveDog(){
        int testID=5;
        Dog expected = null;
        Dog unexpected = new Dog(null,null,testID);
        DogHouse dogHouse = new DogHouse();
        DogHouse.clear();
        dogHouse.add(unexpected);
        dogHouse.remove(unexpected);
        Dog actual = dogHouse.getDogById(testID);
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogTest(){
        int testID=5;
        Dog expected = new Dog(null,null,testID);
        DogHouse dogHouse = new DogHouse();
        DogHouse.clear();
        dogHouse.add(expected);
        Dog actual = dogHouse.getDogById(testID);
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        Integer expected = 1;
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);
    }
}
