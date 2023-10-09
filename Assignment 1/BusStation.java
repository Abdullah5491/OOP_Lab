class BusStation {
    private String stationName;
    private String arrivalTime;

    public BusStation(String stationName, String arrivalTime) {
        this.stationName = stationName;
        this.arrivalTime = arrivalTime;
    }

    public String getStationName() {
        return stationName;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }
}