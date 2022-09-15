public class Main {
    public static void main(String[] args) {
        //Условный оператор, часть 2
        //
        //задание 5


        int monthNumber = 13;
        String season1 = "Зима";
        String season2 = "Весна";
        String season3 = "Лето";
        String season4 = "Осень";
        String season ="";

        if (monthNumber <= 12) {

            switch (monthNumber) {
                case 1:
                    season = season1;

                case 2:
                    season = season1;
                    ;
                case 3:
                    season = season2;

                case 4:
                    season = season2;

                case 5:
                    season = season2;

                case 6:
                    season = season3;

                case 7:
                    season = season3;

                case 8:
                    season = season3;

                case 9:
                    season = season4;

                case 10:
                    season = season4;

                case 11:
                    season = season4;

                case 12:
                    season = season1;

                default:

                    System.out.println(season);
            }
        }
        else {
                System.out.println("Такого месяца нет!!");
            }



    }
}