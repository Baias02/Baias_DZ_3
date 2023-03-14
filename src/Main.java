import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {

        BankAccount visa = new BankAccount();
        visa.deposit(20000.00);
        while (true) {
            System.out.println("Введите сумму:");
            try {
                visa.withDraw(6000);
            } catch (LimitException limitException) {
                try {
                    visa.withDraw((int) limitException.getRemainingAmount());
                } catch (Exception e) {
                    //можно не добавлять  e.printStackTrace();
                }
                break;
            }
        }

    }
}
