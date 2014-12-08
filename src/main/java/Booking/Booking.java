package Booking;

/**
 * Created by Prin Kammasitt on 8/12/2557.
 */
public class Booking {

    private String bookingNum;
    private String bookingDate;
    private int totalPrice;
    private Boolean statusPayment;

    public Booking(String bookingNum, String bookingDate, int totalPrice, Boolean statusPayment) {
        this.bookingNum = bookingNum;
        this.bookingDate = bookingDate;
        this.totalPrice = totalPrice;
        this.statusPayment = statusPayment;
    }


    public String getBookingNum() {
        return bookingNum;
    }

    public void setBookingNum(String bookingNum) {
        this.bookingNum = bookingNum;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(Boolean statusPayment) {
        this.statusPayment = statusPayment;
    }
}
