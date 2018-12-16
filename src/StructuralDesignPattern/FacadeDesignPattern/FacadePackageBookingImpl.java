package StructuralDesignPattern.FacadeDesignPattern;

public class FacadePackageBookingImpl implements FacadePackageBooking {
    @Override
    public void book() {
        CabBooking cabBooking = new CarBookingImpl();
        cabBooking.book();

        FlightBooking flightBooking = new FlightBookingImpl();
        flightBooking.book();

        TransferBooking transferBooking = new TransferBookingImpl();
        transferBooking.book();

        System.out.println("Facade Package Booking Done");
    }
}
