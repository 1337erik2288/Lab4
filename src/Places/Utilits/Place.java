package Places.Utilits;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public abstract class Place {
    public static Set<Place> places = new HashSet<Place>();
    //интерфейсы
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

    // Вложенный класс для взаимодействия

    public abstract void whatIAm ();

}


