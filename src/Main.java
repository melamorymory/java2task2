public class Main {
    public static void main(String[] args) {
        int initialCount = 100;
        int bonusPrice = 100;
        int refill = 1100;
        int bonus;

        if (refill > 1000) {
            bonus = refill / bonusPrice;
        } else {
            bonus = 0;
        }
        int finalCount = initialCount + refill + bonus;
        System.out.println("Бонус: " + bonus + " рублей");
        System.out.println("Итоговый счёт: " + finalCount + " рублей");
    }
}
