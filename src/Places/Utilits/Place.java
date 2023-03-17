package Places.Utilits;

import java.util.*;

public abstract class Place {
    public static Set<Place> places = new LinkedHashSet<>();
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

    public Place getPlace(Integer Index){

        return
    }

    public void myNameIs(){
        System.out.printf("Мое имя: %s\n", name);
    }

    // Вложенный класс для взаимодействия

    public abstract void whatIAm ();

}


