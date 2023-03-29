package Places;

import Places.Utilits.Place;

import java.util.HashSet;
import java.util.Set;

public class Region extends Place {
    public Region (String name) {
        this.name = name;
    }
    public void whatIAm(){
        System.out.println("I am region ");
    }

}
