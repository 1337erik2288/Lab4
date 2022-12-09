package Places.Utilits;

import Places.Capital;
import Places.City;
import Places.Region;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public abstract class Place {
    public int type;
    protected String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void myNameIs(){
        System.out.printf("Мое имя: %s\n", name);
    }

    public Set getSet(){
        return (
            switch (type) {
                case 1 -> Region.places;
                case 2 -> City.places;
                case 3 -> Capital.places;
                default -> throw new IllegalStateException("Unexpected value: " + type);
            }
        );
    }

    // Вложенный класс для взаимодействия

    public abstract void whatIAm ();

}


