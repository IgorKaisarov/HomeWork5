public class Main {
    public static void main(String[] args) {

        System.out.printf(" Task 1 ");

        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println(" Установите версию приложения для iOS по ссылке ");
                break;
            case 1:
                System.out.println(" Установите версию приложения для Android по ссылке ");
                break;
            default:
                System.out.println(" Операционная система не найдена ");
        }

        System.out.printf(" Task 2 ");

        int clientDeviceYear = 2010;
        int clientOS1 = 0;

        if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else if (clientOS1 == 0 && clientDeviceYear >=2015){
            System.out.println(" Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию для Android ");
        } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию для iOS ");
        }


        System.out.printf(" Task 3 ");

        int year = 2025;

        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else if (year > 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println("Год не может быть меньше 1585");
        }

        System.out.printf(" Task 4 ");


        int deliveryDistance = 50;

        if (deliveryDistance > 100) {
            System.out.println(" Доставки нет ");
        } else if (deliveryDistance < 20) {
            System.out.println(" Доставка сутки ");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println(" Доставка двое суток ");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println(" Доставка трое суток ");
        }


        System.out.printf(" Task 5 ");

        int monthNumber = 4;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осень ");
                break;
            default:
                System.out.println(" Такого месяца нет ");
        }


        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}