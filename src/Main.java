public class Main {

    public static void specifyYear(int year) {

        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println(year + " год — високосный год");
        else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void installApp(int clientDeviceYear, int clientOS) {

        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void deliveryTime(int deliveryDistance) {

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
    }


    public static void main(String[] args) {

        //task1
        int year = 2000;
        specifyYear(year);

        //task2
        int clientOS = 0;
        int clientDeviceYear = 2015;
        installApp(clientDeviceYear, clientOS);

        //task3
        int deliveryDistance = 95;
        deliveryTime(deliveryDistance);

    }
}