package Places;

import Places.Utilits.Place;

import java.util.HashSet;
import java.util.Set;

public class Capital extends City{
    public static Set<Capital> places = new HashSet<>();

    public void whatIAm(){
        System.out.println("I am capital");
    }
}
