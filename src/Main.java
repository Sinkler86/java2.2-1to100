public class Main {
    public static void main(String[] args) {
        int onAccount = 100;
        int toDeposit = 1100;
        int bonusRub;
        if (toDeposit > 1000) {
            bonusRub = toDeposit / 100;
        } else {
            bonusRub = 0;
        }
        int total = onAccount + toDeposit + bonusRub;
        System.out.println("Итоговый счет: " + total);
        System.out.println("Бонус: " + bonusRub);
    }
}