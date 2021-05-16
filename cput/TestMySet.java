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

public abstract class TestMySet extends MySet
{
    //add
    @Test
    void testAdd()
    {
        ages.add(23);
        ages.add(16);
        ages.add(32);
        ages.add(55);
    }
    //remove
    @Test
    void testRemove()
    {
        ages.remove(23);
        ages.remove(16);
        ages.remove(32);
        ages.remove(55);
    }
    //find
    @Test
    void testFind()
    {
        findAges();
    }
}
