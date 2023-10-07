/*
 * Class: CMSC203 
 * Instructor:Gary Thai
 * Description: (PatientDriverApp)
 * Due: 10/06/2023
 * Platform/compiler: mac
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alvin Beltran
*/

package project2;

public class PatientDriverApp {
    public static void main(String[] args) {
        // Create a patient object with sample data
        Patient patient = new Patient("John", "Doe", "Smith", "123 Main St", "Anytown", "CA", "12345", "555-123-4567", "Alice Johnson", "555-789-1234");

        // Create three procedure objects
        Procedure procedure1 = new Procedure("Checkup", "06/12/2023");
        Procedure procedure2 = new Procedure("X-Ray", "06/15/2023", "Dr. Anderson", 250.0);
        Procedure procedure3 = new Procedure("Blood Test", "06/18/2023", "Dr. Brown", 120.0);

        // Display patient's information
        displayPatient(patient);

        // Display information about all three procedures
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display the total charges of the three procedures
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges for Procedures: $%.2f%n", totalCharges);
        System.out.println();
        System.out.println("Student name: Alvin Beltran");
        System.out.println("Mc number: MC21088589");
        System.out.println("Due date: 10/6/2023");
    }

    // Method to display patient's information
    public static void displayPatient(Patient patient) {
        System.out.println("Patient Information:");
        System.out.println("Full Name: " + patient.buildFullName());
        System.out.println("Address: " + patient.buildAddress());
        System.out.println("Phone Number: " + patient.getPhoneNumber());
        System.out.println("Emergency Contact: " + patient.buildEmergencyContact());
        System.out.println();
    }

    // Method to display procedure's information
    public static void displayProcedure(Procedure procedure) {
        System.out.println("Procedure Information:");
        System.out.println("Procedure Name: " + procedure.getProcedureName());
        System.out.println("Procedure Date: " + procedure.getProcedureDate());
        System.out.println("Practitioner Name: " + procedure.getPractitionerName());
        System.out.printf("Procedure Charges: $%.2f%n", procedure.getProcedureCharges());
        System.out.println();
    }

    // Method to calculate total charges of procedures
    public static double calculateTotalCharges(Procedure... procedures) {
        double totalCharges = 0.0;
        for (Procedure procedure : procedures) {
            totalCharges += procedure.getProcedureCharges();
        }
        return totalCharges;


    }
}
