public class LimitException extends Exception{
    private double remainingAmount;
    public LimitException(String message,Double remainingAmount) throws Exception {
        super(message);
        this.remainingAmount = remainingAmount;

    }
    public double getRemainingAmount(){
        return remainingAmount;

    }
}
