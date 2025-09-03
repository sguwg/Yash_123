abstract class book {
    double bprice;
    String time;
    book(double bprice, String time) {
        this.bprice = bprice;
        this.time = time;  
    }
    abstract void fare();
    abstract void cancel();
    abstract void refund();
}
class Customer extends book {
    private boolean isBooked = false;
    private boolean isCancelled = false;
    private double refundAmount = 0;

    Customer(double fare, String time) {
        super(fare, time);
    }
    @Override
    void fare() {
        isBooked = true;
        System.out.println("Ride booked for ₹" + bprice + " at " + time);
    }
    @Override
    void cancel() {
        if (isBooked && !isCancelled) {
            isCancelled = true;
            refundAmount = 300;  // refund logic
            System.out.println("Ride cancelled. Eligible refund: ₹" + refundAmount);
        } else {
            System.out.println("No active booking to cancel.");
        }
    }
    @Override
    void refund() {
        if (isCancelled) {
            System.out.println("Refund of ₹" + refundAmount + " processed successfully.");
        } else {
            System.out.println("No refund available.");
        }
    }
}
public class test2 {
    public static void main(String[] args) {
        book r = new Customer(500, "10:00 AM");
        r.fare();
        r.cancel();
        r.refund();
    }
}
