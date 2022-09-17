
public class Main {
    public static void main(String[] args) {
        //Условный оператор, часть 2
        //
        //задание 3

        int year = 2020;
        int y4;
        int y100;
        int y400;
        y4 = year % 4;
        y100 = year % 100;
        y400 = year % 400;

        if (y4 == 0 && y100 != 0 || y400 == 0) {
            System.out.println(year + " год является высокосным");
            }

                else {
                    System.out.println(year + " год неявляется высокосным");
                }




    }
}