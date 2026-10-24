public abstract class MedStaff {
        protected String employeeID;
        protected String department;
        protected int WorkingHours;

        //constructor to initialize variables
        public MedStaff(String employeeID, String department, int WorkingHours){
            this.employeeID = employeeID;
            this.department = department;
            this.WorkingHours = WorkingHours;
        }

        public void displayStaffInfo(){
            System.out.println("Employee id:" + employeeID);
            System.out.println("Department:" + department);
            System.out.println("Working Hours:" + WorkingHours);
        }

        //abstract method: forces subclasses using "extends" to define their own duties.
        public abstract void performMedicalDuties();
}
