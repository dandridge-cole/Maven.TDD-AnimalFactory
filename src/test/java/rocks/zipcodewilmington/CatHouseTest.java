package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest(){
        int testID=5;
        Cat expected = new Cat(null,null,testID);
        CatHouse catHouse = new CatHouse();
        CatHouse.clear();
        catHouse.add(expected);
        Cat actual = catHouse.getCatById(testID);
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    public void testRemoveCatByID(){
        int testID=5;
        Cat expected = null;
        Cat unexpected = new Cat(null,null,testID);
        CatHouse catHouse = new CatHouse();
        CatHouse.clear();
        catHouse.add(unexpected);
        catHouse.remove(testID);
        Cat actual = catHouse.getCatById(testID);
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    public void testRemoveCat(){
        int testID=5;
        Cat expected = null;
        Cat unexpected = new Cat(null,null,testID);
        CatHouse catHouse = new CatHouse();
        CatHouse.clear();
        catHouse.add(unexpected);
        catHouse.remove(unexpected);
        Cat actual = catHouse.getCatById(testID);
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatTest(){
        int testID=5;
        Cat expected = new Cat(null,null,testID);
        CatHouse catHouse = new CatHouse();
        CatHouse.clear();
        catHouse.add(expected);
        Cat actual = catHouse.getCatById(testID);
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        Integer expected = 1;
        Cat cat = AnimalFactory.createCat(null,null);
        CatHouse.clear();
        CatHouse.add(cat);
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }
}
