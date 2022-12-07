package Places.Utilits;

import java.util.Scanner;

public abstract class Place implements PlacesIterface {

    //интерфейсы
    protected String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class InterPlace{
        private static Scanner scan = new Scanner(System.in);
        // Методы для взаимодействия
        public static void createNewObl(){


        }
        public static void deleteObj(){

        }
        public static void changeObj(){

        }
        public static void callObj(){

        }
    }

    public abstract void whatIAm ();

}


