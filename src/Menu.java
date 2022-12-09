import Places.*;
import Places.Utilits.GroupPlaces;
import Places.Utilits.InterPlace;
import Places.Utilits.Place;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Menu {
    private static Region region = new Region();
    private static City city = new City();
    private static Capital capital = new Capital();

    private static GroupPlaces groupPlaces = new GroupPlaces(region, city, capital);

    private static void sayMyNameOne(Place place){ place.whatIAm(); }


    public static void start(){
        mainMenu();
    }

    private static void mainMenu(){
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Главное меню");
            System.out.println("1 - выполнить все методы разом");
            System.out.println("2 - выполнить действия");
            System.out.println("3 - Выход");
            System.out.println("Введите номер выбраной комманды: ");

            String choice = scan.nextLine();
            switch (choice) {
                case "1" -> groupPlaces.showAll();
                case "2" -> secondMenu();
                case "3" -> System.exit(0);
                default -> System.out.println("Нет такого пункта меню");
            }
        }while (true);
    }

    private static void secondMenu(){
        Scanner scan = new Scanner(System.in);
        boolean toMain = false;

        do {
            System.out.println("Выбор взаимодействия");
            System.out.println("1 - добавить объект");
            System.out.println("2 - убрать объект");
            System.out.println("3 - изменить объект");
            System.out.println("4 - вызвать объект");
            System.out.println("5 - назад");
            System.out.println("Введите номер выбраной комманды: ");

            String choice = scan.nextLine();
            switch (choice) {
                case "1" -> InterPlace.createObject();
                case "2" -> InterPlace.deleteObject();
                case "3" -> InterPlace.changeObject();
                case "4" -> InterPlace.callObject();
                case "5" -> toMain = true;
                default -> System.out.println("Нет такого пункта меню");
            }

        } while (!toMain);
    }


}