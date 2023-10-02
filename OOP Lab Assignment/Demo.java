public class Demo {
    public static void main(String[] args) {

        Employee labAttendant1 = new Employee("E1", "Hamza");
        Employee labAttendant2 = new Employee("E2", "Ali");


        Computer computer1 = new Computer("C1", "LCD Model 1", 8, 500, true);
        Computer computer2 = new Computer("C2", "LCD Model 2", 16, 1000, false);
        Computer computer3 = new Computer("C3", "LCD Model 3", 4, 250, false);
        Lab lab1 = new Lab("L001", 10, labAttendant1);



        lab1.addComputer(computer1);
        lab1.addComputer(computer2);


        lab1.setStatus(LabStatus.FAULTY_MULTIMEDIA);


        University university = new University(new Lab[]{lab1});


        Lab fetchedLab = university.getLab("L001");
        if (fetchedLab != null) {
            System.out.println("Lab ID: " + fetchedLab.getLabID());
            System.out.println("Lab Attendant: " + fetchedLab.getLabAttendant().getName());
            System.out.println("Lab Status: " + fetchedLab.getStatus());


            Computer fetchedComputer = fetchedLab.getComputer("C001");
            if (fetchedComputer != null) {
                System.out.println("Computer Number: " + fetchedComputer.getComputerNumber());
                System.out.println("LCD Model: " + fetchedComputer.getLcdModel());
                System.out.println("RAM Size (GB): " + fetchedComputer.getRamSize());
                System.out.println("Hard Disk Size (GB): " + fetchedComputer.getHddSize());
                System.out.println("Has GPU: " + fetchedComputer.isHasGPU());
            } else {
                System.out.println("Computer not found in the lab.");
            }
        } else {
            System.out.println("Lab not found in the university.");
        }
    }
}
