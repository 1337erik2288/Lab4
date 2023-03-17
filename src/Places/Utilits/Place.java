package Places.Utilits;

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

}


