package za.ac.cput;
import org.junit.jupiter.api.Test;

/*
   Name: Damian Du Toit
   Student Number: 219200203
   Year: 3
   Subject: App Dev 3
   IDE: IntelliJ
   Project Type: Apache Maven
 */

public abstract class TestMyCollection extends MyCollection
{
    //add
    @Test
    void testAdd()
    {
        food.add("Burger");
        food.add("Pizza");
        food.add("Ice Cream");
        food.add("Chicken");
        food.add("Fish");
        food.add("Bacon");
    }

    //remove
    @Test
    void testRemove()
    {
        food.remove("Burger");
        food.remove("Pizza");
        food.remove("Ice Cream");
        food.remove("Chicken");
        food.remove("Fish");
        food.remove("Bacon");
    }

    //find
    @Test
    void testFind()
    {
        findFood();
    }
}
