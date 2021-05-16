package za.ac.cput;
import java.util.ArrayList;
import java.util.Collection;

/*
   Name: Damian Du Toit
   Student Number: 219200203
   Year: 3
   Subject: App Dev 3
   IDE: IntelliJ
   Project Type: Apache Maven
 */

public abstract class MyCollection implements Collection
{
    Collection<String> food = new ArrayList<String>();

    //add
    public Collection<String> addFood()
    {
        food.add("Burger");
        food.add("Pizza");
        food.add("Ice Cream");
        food.add("Chicken");
        food.add("Fish");
        food.add("Bacon");
        return food;
    }

    //remove
    public Collection<String> removeFood()
    {
        food.remove("Burger");
        food.remove("Pizza");
        food.remove("Ice Cream");
        food.remove("Chicken");
        food.remove("Fish");
        food.remove("Bacon");
        return food;
    }

    //find
    public Collection<String> findFood()
    {
        return food;
    }
}
