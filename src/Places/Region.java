package Places;

import Places.Utilits.Place;

import java.util.HashSet;
import java.util.Set;

public class Region extends Place {
    public static Set<Region> places = new HashSet<>();

    public void whatIAm(){
        System.out.println("I am region ");
    }

}
