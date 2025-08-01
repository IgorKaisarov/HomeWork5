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

        int clientOS1 = 0;
        int clientDeviceYear = 2017;
        if (clientOS1 == 1) ;
        if (clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию Android");
        } else {
            System.out.println(" Установите версию приложения для Android по ссылке");
            if (clientOS1 == 0) ;
            if (clientDeviceYear < 2015) {
                System.out.println(" Установите облегченную версию iOS");
            } else {
                System.out.println(" Установите версию приложения для iOS по ссылке");
            }
        }


        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}