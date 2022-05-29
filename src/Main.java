public class Main {
    public static void main(String[] args) {

        int initialAccount = 500;
        int depositAmount = 1950;

        int bonus;
        if (depositAmount >= 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }

        int finalAccount = initialAccount + depositAmount + bonus;

        System.out.println("Итоговый баланс:" + finalAccount);
        System.out.println("Количество бонусных рублей:" + bonus);
    }
}