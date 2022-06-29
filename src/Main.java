public class Main {

    public static void main(String[] args) {
        // входные данные
        byte balance = 100;
        short deposit = 1000;
        boolean correctDeposit = true;

        // логика программы
        int bonus = correctDeposit ? 1 : 0;
        int amount = deposit / 100 * bonus;

        if (amount > 1000) {
            amount = 0;
        }
        System.out.println("Ваш бонус составит: " + amount);
    }
}
