class BusBookingSystem {
    private Bus[] buses;

    public BusBookingSystem(int numberOfBuses) {
        buses = new Bus[numberOfBuses];
    }

    public void addBus(Bus bus, int index) {
        if (index >= 0 && index < buses.length) {
            buses[index] = bus;
        } else {
            System.out.println("Invalid bus index.");
        }
    }

}