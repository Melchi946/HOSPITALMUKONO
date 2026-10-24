public class main {
    static void main(String[] args) {
        doctor doc = new doctor("25PO","Cardiology",
                10, "Cardiologist");
        nurse nur = new nurse("10BG","Emergency",
                15,"Night");
        LabTechnician lb = new LabTechnician("52EF","Laboratory",
                10);
        pharmacist ph =new pharmacist("15CA","Pharmacy",22);

        System.out.println("***** DOCTOR *****");
        doc.displayStaffInfo();
        doc.performMedicalDuties();
        System.out.println("***** NURSE *****");
        nur.displayStaffInfo();
        nur.performMedicalDuties();
        System.out.println("***** LABORATORY TECHNICIAN *****");
        lb.displayStaffInfo();
        lb.performMedicalDuties();
        System.out.println("***** PHARMACIST *****");
        ph.displayStaffInfo();
        ph.performMedicalDuties();
    }
}
