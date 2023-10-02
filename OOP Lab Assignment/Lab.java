public class Lab {
    String labID;
    Computer computers[];
    LabStatus status;
    Employee labAttendant;

    public Lab(String labID, int capacity, Employee labAttendant) {
        this.labID = labID;
        this.computers = new Computer[capacity];
        this.status = LabStatus.OPERATIONAL;
        this.labAttendant = labAttendant;
    }

    public Lab() {
    }
    public void addComputer(Computer computer) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == null) {
                computers[i] = computer;
                break;
            }
        }
    }
    public void removeComputer(String computerNumber) {
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] != null && computers[i].getComputerNumber().equals(computerNumber)) {
                computers[i] = null;
                break;
            }
        }
    }

    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public LabStatus getStatus() {
        return status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public Computer getComputer(String computerNumber) {
        for (Computer computer : computers) {
            if (computer != null && computer.getComputerNumber().equals(computerNumber)) {
                return computer;
            }
        }
        return null;
    }
}
