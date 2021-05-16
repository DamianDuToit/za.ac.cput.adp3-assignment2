package za.ac.cput;
import java.util.HashMap;
import java.util.Map;

/*
   Name: Damian Du Toit
   Student Number: 219200203
   Year: 3
   Subject: App Dev 3
   IDE: IntelliJ
   Project Type: Apache Maven
 */

public abstract class MyMap implements Map
{
    Map<String, String> music = new HashMap<String, String>();

    //add
    public Map<String, String> addMusic()
    {
        music.put("Rap", "Eminem");
        music.put("Pop", "Taylor Swift");
        music.put("Post-Hardcore", "Famous Last Words");
        music.put("Hard Rock", "Falling in Reverse");
        return music;
    }

    //remove
    public Map<String, String> removeMusic()
    {
        music.remove("Rap", "Eminem");
        music.remove("Pop", "Taylor Swift");
        music.remove("Post-Hardcore", "Famous Last Words");
        music.remove("Hard Rock", "Falling in Reverse");
        return music;
    }

    //find
    public Map<String, String> findMusic()
    {
        return music;
    }
}
