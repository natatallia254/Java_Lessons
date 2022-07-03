package Lesson_4;

import java.io.IOException;

public class Payment2Main {
    public static void main(String[] args) throws IOException {
        try {
            Payment2 pay1 = new Payment2("Первая покупка");
            pay1.setPayment2();

            Payment2 pay2 = new Payment2("Вторая покупка");
            pay2.setPayment2();

            pay1.printCheque();
            pay2.printCheque();
        }
        catch(NumberFormatException e) {
            System.out.println("Неверный формат");
        }
        catch (NullPointerException e) {
            System.out.println("Массив не создан");
        }
    }

}
