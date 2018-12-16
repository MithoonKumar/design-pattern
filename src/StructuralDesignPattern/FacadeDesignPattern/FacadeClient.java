package StructuralDesignPattern.FacadeDesignPattern;

public class FacadeClient {

    public static void main(String[] args) {
        FacadePackageBooking facadePackageBooking = new FacadePackageBookingImpl();
        facadePackageBooking.book();
    }
}
