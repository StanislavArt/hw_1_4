public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i=10; i > 0; i--) System.out.print(i + " ");
    }

    public static void task2() {
        int day = 5;
        for (int i=day; i < 32; i++) {
            if ((i-day) % 7 == 0) System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        int currentYear = 2022;
        int beginYear = currentYear - 200;
        int endYear = currentYear + 100;

        for (int i = beginYear; i <= endYear; i++) {
            if (i % 79 == 0) System.out.println(i);
        }
    }

}