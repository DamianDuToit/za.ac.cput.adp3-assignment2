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

public abstract class TestMyList extends MyList
{
    //add
    @Test
    void testAdd()
    {
        years.add(1969);
        years.add(1975);
        years.add(2000);
        years.add(2016);
        years.add(2020);
    }

    //remove
    @Test
    void testRemove()
    {
        years.remove(1969);
        years.remove(1975);
        years.remove(2000);
        years.remove(2016);
        years.remove(2020);
    }

    //find
    @Test
    void testFind()
    {
        findYears();
    }
}
