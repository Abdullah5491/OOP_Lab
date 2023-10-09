
class Bus {
    private String busNumber;
    private int totalSeats;
    private boolean[] seats;
    private BusStation[] stations;

    public Bus(String busNumber, int totalSeats, BusStation[] stations) {
        this.busNumber = busNumber;
        this.totalSeats = totalSeats;
        this.seats = new boolean[totalSeats];
        this.stations = stations;

        for (int i = 0; i < totalSeats; i++) {
            seats[i] = false;
        }
    }
    public String getBusNumber() {
        return busNumber;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public boolean[] getSeats() {
        return seats;
    }

    public boolean bookSeat(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= totalSeats) {
            if (!seats[seatNumber - 1]) {
                seats[seatNumber - 1] = true;
                return true;
            } else {
                System.out.println("Seat " + seatNumber + " is already booked.");
            }
        } else {
            System.out.println("Invalid seat number.");
        }
        return false;
    }

    public void displayBusDetails() {
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Stations and Arrival Times:");
        for (BusStation station : stations) {
            System.out.println(station.getStationName() + " - " + station.getArrivalTime());
        }
        System.out.println("Available seats for bus " + busNumber + ":");
        for (int i = 0; i < totalSeats; i++) {
            if (!seats[i]) {
                System.out.print((i + 1) + " ");
            } else {
                System.out.printf("(%d)Booked ", (i+1));
            }
        }
        System.out.println();
    }
}