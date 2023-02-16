import java.time.LocalDate;

public class Main {
    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }


    public static void checkUserParameters(int yearOfRelease, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (yearOfRelease < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateTheDeliveryTime(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance <= 60) {
            deliveryTime += 1;
        } else if (deliveryDistance <= 100) {
            deliveryTime += 2;
        } else {
            deliveryTime = 0;
        }
        return deliveryTime;
    }


    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int year = 2023;
        checkYear(year);

        //Задача 2
        System.out.println("");
        System.out.println("Задача 2");
        int yearOfRelease = 2015;
        int clientOS = 1;
        checkUserParameters(yearOfRelease, clientOS);

        //Задача 3
        System.out.println("");
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryTime = calculateTheDeliveryTime(deliveryDistance);
        if (deliveryTime > 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
    }
}