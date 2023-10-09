public class Demo {
    public static void main(String[] args) {
        BusStation[] stations1 = {
                new BusStation("Lahore", "08:00 AM"),
                new BusStation("Multan", "09:30 AM"),
                new BusStation("Islamabad", "11:00 AM")
        };

        BusStation[] stations2 = {
                new BusStation("Peshawar", "07:30 AM"),
                new BusStation("Karachi", "09:00 AM"),
                new BusStation("Sialkot","10:30 AM")
        };

        BusBookingSystem bookingSystem = new BusBookingSystem(2);

        Bus bus1 = new Bus("A123", 10, stations1);
        Bus bus2 = new Bus("B456", 12, stations2);

        bookingSystem.addBus(bus1, 0);
        bookingSystem.addBus(bus2, 1);


        bus1.bookSeat(5);
        bus1.bookSeat(7);


        bus2.bookSeat(3);
        bus2.bookSeat(6);


        bus1.displayBusDetails();
        bus2.displayBusDetails();
    }
}