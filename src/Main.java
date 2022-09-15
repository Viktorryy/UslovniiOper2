public class Main {
    public static void main(String[] args) {


        String imOS;
//каким оператором воспользоваться, чтобы получить тип операционной системы???
        imOS="iOS"; // считаем, что этот оператор вернул значение ))

        byte clientOS;
        String im1 = "iOS";
        String im2 = "Android";


        if (imOS == im1) {
            clientOS = 0;
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (imOS == im2) { clientOS = 1;
            System.out.println("Установите версию приложения для Android по ссылке");
        }


    }
}