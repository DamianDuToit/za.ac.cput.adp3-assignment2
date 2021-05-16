package za.ac.cput;
import java.util.HashSet;
import java.util.Set;

/*
   Name: Damian Du Toit
   Student Number: 219200203
   Year: 3
   Subject: App Dev 3
   IDE: IntelliJ
   Project Type: Apache Maven
 */

public abstract class MySet implements Set
{
    Set<Integer> ages = new HashSet<>();

    //add
    public Set<Integer> addAges()
    {
        ages.add(23);
        ages.add(16);
        ages.add(32);
        ages.add(55);
        return ages;
    }

    //remove
    public Set<Integer> removeAges()
    {
        ages.remove(23);
        ages.remove(16);
        ages.remove(32);
        ages.remove(55);
        return ages;
    }

    //find
    public Set<Integer> findAges()
    {
        return ages;
    }
}
