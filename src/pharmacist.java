public class pharmacist extends MedStaff{
    public pharmacist(String employeeID, String department, int WorkingHours){
        super(employeeID, department, WorkingHours);
    }

    @Override
    public void performMedicalDuties() {
        System.out.println("ROLE: Dispenses medications and checks interactions");
    }
}
