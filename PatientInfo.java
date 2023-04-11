import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PatientInfo {
    static Map<String, String> hs = new HashMap<>();
    public static void  patientDetails() {
        
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Welcome to Clinic ");
        System.out.println("Kindly Fill the Details to fix an Appointment");

        try 
        {
        System.out.print("Full Name: ");
        String fullName = sc.nextLine();
        hs.put("fullName", fullName);
        System.out.println("");

        System.out.print("Date of Birth (dd/mm/yyyy): ");
        String dateOfBirth = sc.nextLine();
        hs.put("dateOfBirth", dateOfBirth);
        System.out.println("");

        System.out.print("Mobile Number: ");
        String mobileNum = sc.nextLine();
        hs.put("mobileNumber", mobileNum);
        System.out.println("");

        System.out.print("Email Address: ");
        String emailAddress = sc.nextLine();
        hs.put("emailAddress", emailAddress);
        System.out.println("");

        System.out.print("Known Allergies: ");
        String knownAllergies = sc.nextLine();
        hs.put("knownAllergies", knownAllergies);
        System.out.println("");

        System.out.print("Appointment Reason: ");
        String appointmentReason = sc.nextLine();
        hs.put("appointmentReason", appointmentReason);
        System.out.println("");

        System.out.print("Accessibility Needs: ");
        String accessibility = sc.nextLine();
        hs.put("accessibility", accessibility);
        System.out.println("");

        }
        
        catch (Exception e) {
            System.out.println("error in vscode" );
        }
        
    }
}

