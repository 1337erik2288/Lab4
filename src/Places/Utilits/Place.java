package Places.Utilits;

import Places.Capital;
import Places.City;
import Places.Region;

import java.util.*;

public abstract class Place {
    public static List<Place> places = new LinkedList<>();


    //интерфейсы
    protected String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount()
    {
        return places.size();
    }

    public Place getPlace(int index){
        return places.get(index);
    }

    public void myNameIs(){
        System.out.printf("Мое имя: %s\n", name);
    }

    // Вложенный класс для взаимодействия

    public abstract void whatIAm ();
    public void remove(int index){
        this.places.remove(index);
    }

    public void create(String name,String type){
        if (type == "City"){
            places.add(new City(name));
        } else if (type == "Capital") {
            places.add(new Capital(name));
        }else{
            places.add(new Region(name));
        }
    }

}


