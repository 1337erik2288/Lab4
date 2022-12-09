package Places.Utilits;

import java.util.Scanner;

public abstract class Place {

    //интерфейсы
    protected String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Вложенный класс для взаимодействия

    public abstract void whatIAm ();

}


