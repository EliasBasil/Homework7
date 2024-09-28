public class Main {
    public static void main(String[] args) {
        // Задача 1
        int monthlyDeposit = 15_000;
        int total = 0;
        int monthCounter = 0;
        while (total < 2_459_000) {
            total += monthlyDeposit;
            monthCounter++;
        }
        System.out.println("Месяц " + monthCounter + ", сумма накоплений равна " + total + " рублей");

        // Задача 2
        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(j + " ");
        }
        System.out.println();
        for (; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Задача 3
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + population * 17 / 1_000 - population * 8 / 1_000;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        // Задача 4
        int totalMoney = 15_000;
        int months = 0;
        while (totalMoney < 12_000_000) {
            months++;
            totalMoney += 0.07 * totalMoney;
            System.out.println("Месяц " + months + ": сумма накоплений - " + totalMoney);
        }

        // Задача 5
        int sumOnAccount = 15_000;
        int currentMonth = 0;
        while (sumOnAccount < 12_000_000) {
            currentMonth++;
            sumOnAccount += 0.07 * sumOnAccount;
            if (currentMonth % 6 == 0) {
                System.out.println("Месяц " + currentMonth + ": сумма накоплений - " + sumOnAccount);
            }
        }

        // Задача 6
        int deposit = 15_000;
        for (int k = 1; k <= 9 * 12; k++) {
            deposit += 0.07 * deposit;
            if (k % 6 == 0) {
                System.out.println("Месяц " + k + ": сумма накоплений - " + deposit);
            }
        }

        // Задача 7
        int firstFriday = 5;
        for (int k = 1; k <= 31; k++) {
            if ((k - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + k + "-е число. Необходимо подготовить отчет");
            }
        }

        // Задача 8
        int cycle = 79;
        int currentYear = 2024;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int k = start; k <= end; k++) {
            if (k % cycle == 0) {
                System.out.println(k);
            }
        }

    }
}