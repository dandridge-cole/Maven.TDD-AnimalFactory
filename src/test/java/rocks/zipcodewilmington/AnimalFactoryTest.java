package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import java.util.Date;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {


    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog() {
        // Given

        String expectedName = "Cujo";
        Date expectedBirthDate =new Date("6/6/06");
        DogHouse dogHouse = new DogHouse();
        Integer expectedID = dogHouse.getNumberOfDogs();

        // When
        Animal dogChecker = AnimalFactory.createDog(expectedName,expectedBirthDate);

        // Then
        String actualName = dogChecker.getName();
        Date actualBirthDate = dogChecker.getBirthDate();
        Integer actualID = dogChecker.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedID, actualID);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat() {
        // Given
        String expectedName = "Garfield";
        Date expectedBirthDate =new Date("1/2/03");
        CatHouse catHouse = new CatHouse();
        Integer expectedID = catHouse.getNumberOfCats();

        // When
        Cat catChecker = AnimalFactory.createCat(expectedName,expectedBirthDate);

        // Then
        String actualName = catChecker.getName();
        Date actualBirthDate = catChecker.getBirthDate();
        Integer actualID = catChecker.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedID, actualID);
    }
}
