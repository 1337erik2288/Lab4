package Places;

import Places.Utilits.Place;

import java.util.HashSet;
import java.util.Set;

public class City extends Place {

    public City(String name) {
        this.name = name;
    }

    public void whatIAm(){
        System.out.println("I am city");
    }
}
