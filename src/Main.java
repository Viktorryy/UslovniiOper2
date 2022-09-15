public class Main {
    public static void main(String[] args) {
        //Условный оператор, часть 2
        //
        //задание 4


        int deliveryDistance = 95;

        int deliveryDay = 0;
        int Distance1 = 20;
        int Distance2 = 60;
        int Distance3 = 100;
        boolean deliveryCleint1 = deliveryDistance <= Distance1;
        boolean deliveryCleint2 = deliveryDistance > Distance1 && deliveryDistance < Distance2;
        boolean deliveryCleint3 = deliveryDistance >= Distance2 && deliveryDistance <= Distance3;

        if (deliveryCleint1)  deliveryDay = 1;
        if (deliveryCleint2) deliveryDay = 2;
        if (deliveryCleint3)  deliveryDay = 3;

        System.out.println("Для доставки вашей карты " +
                "потребуется: " + deliveryDay + " рабочих дня");

    }
}