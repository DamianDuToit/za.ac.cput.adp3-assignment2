package za.ac.cput;
import java.util.ArrayList;
import java.util.List;

/*
   Name: Damian Du Toit
   Student Number: 219200203
   Year: 3
   Subject: App Dev 3
   IDE: IntelliJ
   Project Type: Apache Maven
 */

public abstract class MyList implements List
{
    List<Integer> years = new ArrayList<Integer>();

    //add
    public List<Integer> addYears()
    {
        years.add(1969);
        years.add(1975);
        years.add(2000);
        years.add(2016);
        years.add(2020);
        return years;
    }

    //remove
    public List<Integer> removeYears()
    {
        years.remove(1969);
        years.remove(1975);
        years.remove(2000);
        years.remove(2016);
        years.remove(2020);
        return years;
    }

    //find
    public List<Integer> findYears()
    {
        return years;
    }
}