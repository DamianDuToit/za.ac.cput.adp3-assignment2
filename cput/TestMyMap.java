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

public abstract class TestMyMap extends MyMap
{
    //testAdd
    @Test
    void testAdd()
    {
        music.put("Rap", "Eminem");
        music.put("Pop", "Taylor Swift");
        music.put("Post-Hardcore", "Famous Last Words");
        music.put("Hard Rock", "Falling in Reverse");
    }

    //testRemove
    @Test
    void testRemove()
    {
        music.remove("Rap", "Eminem");
        music.remove("Pop", "Taylor Swift");
        music.remove("Post-Hardcore", "Famous Last Words");
        music.remove("Hard Rock", "Falling in Reverse");
    }

    //testFind
    @Test
    void testFind()
    {
        findMusic();
    }
}
