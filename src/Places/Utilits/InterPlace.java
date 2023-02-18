package Places.Utilits;

import Places.Capital;
import Places.City;
import Places.Region;

import java.util.Scanner;

public class InterPlace {
    private static Scanner scanner = new Scanner(System.in);

    private static String nameInput(){
        System.out.println("Имя места для взаимодействия: ");
        return scanner.nextLine();
    }
    public static void createObject(){
        Place obj = showOptions("Создать");
        obj.setName(nameInput());
        Place.places.add(obj);
    }
    public static void deleteObject(){
        boolean isDeleted = Place.places.removeIf(place -> place.getName().equals(nameInput()));
        System.out.println(isDeleted ? "Успешно удалено" : "Место с таким именем не найдено");
    }
    public static void changeObject(){
        showOptions("Изменить");
        String givenName = nameInput();
        for (Place place : Place.places){
            if (place.getName().equals(givenName)){
                System.out.println("Новое имя места: ");
                place.setName(scanner.nextLine());
                return;
            }
        }
        System.out.println("Место с таким именем не найдено");
    }
    public static void callObject(){
        showOptions(
                "Вызвать");
        String givenName = nameInput();
        for (Place place : Place.places){
            if (place.getName().equals(givenName)){
                place.myNameIs();
                place.whatIAm();
                return;
            }
        }
        System.out.println("Место с таким именем не найдено");
    }

    private static Place showOptions(String manip){

        Scanner scan = new Scanner(System.in);
        boolean done = false;
        Place obj = null;

        do {
            System.out.println("Выбор объекта");
            System.out.printf("1 - %s регион\n", manip);
            System.out.printf("2 - %s город\n", manip);
            System.out.printf("3 - %s столицу\n", manip);
            System.out.println("Введите номер выбраной комманды: ");

            String choice = scan.nextLine();

            switch (choice) {
                case "1" -> {
                    obj = new Region();
                    done = true;
                }
                case "2" -> {
                    obj = new City();
                    done = true;
                }
                case "3" -> {
                    obj = new Capital();
                    done = true;
                }

                default -> System.out.println("Нет такого пункта меню");
            }

        } while (!done);

        return obj;
    }
}
