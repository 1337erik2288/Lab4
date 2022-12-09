package Places.Utilits;

import Places.Capital;
import Places.City;
import Places.Region;

import java.util.Scanner;

public class InterPlace {
    public static void createObject(){
        Place obj = showOptions("Создать");
        // Попроси имя и задай его сеттером, добавь в список выбранного класса
    }
    public static void deleteObject(){
        showOptions("Удалить");
        // Попроси имя и удали из списка выбранного класса

    }
    public static void changeObject(){
        showOptions("Изменить");
        // Попроси имя, найди в списке и измени его через сеттер

    }
    public static void callObject(){
        showOptions("Вызвать");
        // Попроси имя, найди в списке и вызови его sayMyName
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
