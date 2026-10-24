public class doctor extends MedStaff{
    protected String specialty;
    public doctor(String employeeID, String department, int WorkingHours, String specialty){
        super(employeeID, department, WorkingHours);
        this.specialty = specialty;
    }

    @Override
    public void performMedicalDuties() {
        System.out.println("ROLE: Diagnoses patients and performs treatments");
    }
}
