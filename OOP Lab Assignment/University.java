class University {
    Lab[] labs;

    public University() {
    }

    public University(Lab[] labs) {
        this.labs = labs;
    }
    public void addLab(Lab lab) {
    }
    public void removeLab(String labID) {

    }
    public Lab getLab(String labID) {
        for (Lab lab : labs) {
            if (lab != null && lab.getLabID().equals(labID)) {
                return lab;
            }
        }
        return null;
    }
    public Computer getComputerInLab(String labID, String computerNumber) {
        Lab lab = getLab(labID);
        if (lab != null) {
            return lab.getComputer(computerNumber);
        }
        return null;
    }
}
