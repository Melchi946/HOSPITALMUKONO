public class nurse extends MedStaff{
    protected String shift;
    public nurse(String employeeID, String department, int WorkingHours,String shift){
        super(employeeID, department, WorkingHours);
        this.shift = shift;
    }

    @Override
    public void performMedicalDuties() {
        System.out.println("ROLE: Monitors vitals and administers medication");
    }
}
