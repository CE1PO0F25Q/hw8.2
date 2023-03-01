public class Main {
    public static void main(String[] args) {
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task4() {
        System.out.println(" задача 1 ");
        int salary1 = 15_000;
        int total1 = 0;
        int month2 = 1;
        for (; total1 <= 12_000_000; month2++) {
            total1 += total1 / 100 * 7;
            total1 += salary1;
            System.out.println("месяц" + month2 + "сумма равна" + total1);
        }
        System.out.println(total1);
        System.out.println(month2);

        System.out.println();


        //задача 4 while
        int month = 1;
        int total = 0;
        int salary = 15000;
        int max = 12_000_000;
        while (total < max) {
            total += total / 100 * 7;
            total += salary;
            System.out.println("месяц" + month + "сумма равна" + total);
            month++;
        }
        System.out.println(total);
        System.out.println(month);
    }

    public static void task5() {
        System.out.println("задача 5");
        int salary1 = 15_000;
        int total1 = 0;
        int month2 = 1;
        for (; total1 <= 12_000_000; month2++) {
            total1 += total1 / 100 * 7;
            total1 += salary1;
            if (month2 % 6 == 0) {
                System.out.println("Месяц" + month2 + " сумма равна " + total1);
            }
        }
        System.out.println(total1);
        System.out.println(month2);

    }

    public static void task6() {
        System.out.println(" задача 6");
        int salary = 15000;
        int total = 0;
        int year = 9;
        int monthsInYear = 12;
        for (int month = 1; month <= year * monthsInYear; month++) {
            total += total / 100 * 7;
            total += salary;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма равна " + total);
            }
        }
    }

    public static void task7() {
        System.out.println(" задача 7 ");
        int firstFriday = 3;
        int daysMouth = 31;
        int friday = firstFriday;
        int week = 7;
        while (friday <= daysMouth) {
            System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
            friday += week;

        }

    }


    public static void task8() {
        System.out.println(" задача 8 ");
        int spanKamets = 79;
        int startDate = 200;
        int finalDate = 100;
        int currentYear = 2023;
        int pastBecentenary = currentYear - startDate;
        for (int year = 0; year <= currentYear + finalDate; year = year + spanKamets) {
            if (year >= pastBecentenary) {
                System.out.println(year);
            if (year > currentYear) {
                 break;}
            }
        }
    }
}