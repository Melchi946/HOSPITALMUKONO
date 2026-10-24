public class LabTechnician extends MedStaff{
    public LabTechnician(String employeeID, String department, int WorkingHours){
        super(employeeID, department, WorkingHours);
    }

    @Override
    public void performMedicalDuties() {
        System.out.println("ROLE: Analyzes blood and tissue samples");
    }
}
