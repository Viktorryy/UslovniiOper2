public class Main {
    public static void main(String[] args) {
        //Условный оператор, часть 2
        //
        //задание 1

        String imOS;
        int clienYear;
//каким оператором воспользоваться, чтобы получить тип операционной системы???

        // возвращаемые значения
        imOS="Android"; // считаем, что этот оператор вернул значение ))
        clienYear = 2021;


        byte clientOS;
        int clientDeviceYear = 2015;
        String im1 = "iOS";
        String im2 = "Android";


        if (imOS == im1) {
            clientOS = 0;
            if (clienYear >= clientDeviceYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

        if (imOS == im2) {
            clientOS = 1;
            if (clienYear >= clientDeviceYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else { System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }


        }


    }
}