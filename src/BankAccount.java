
public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount+=sum;
        System.out.println("Вы внесли в счет: "+ sum);
    }
    public void withDraw(int sum) throws Exception{
        if (amount < sum){
            throw new LimitException("Ошибка...У вас на счету недостаточно средств для запрашиваемой вами суммы!" +
                    "У вас на счету: ", getAmount());
        }else {
            System.out.println("Вы можете снять со счета: "+ sum);
            amount-= sum;
            System.out.println("Вы сняли со счета: " + sum);
        }
    }
}