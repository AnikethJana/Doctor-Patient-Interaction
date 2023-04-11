import java.util.Map;
import java.util.Scanner;

class LoginInterface 
{
    public String EntryInterface() 
    {   
        System.out.print("Enter Your UserID : ");
        Scanner sc = new Scanner(System.in);
        String UserID = sc.nextLine();
        
        
        System.out.println("Enter your Password: ");
        String Pass = sc.nextLine();
        //login Interface for Doctor
        if (UserID.equals("DOC001")) {
            
            while (!Pass.equals("12345678")) {
                System.out.println("Try Your Password Again");
                Pass = sc.nextLine();
            }
            System.out.println("Password accepted Entering..."); 
            PatientInfo d = new PatientInfo();
           //ERROR#################################################
            Map<String, String> pd = d.patientDetails();
            DoctorInfo c = new DoctorInfo();
            c.doctorInfo(pd);
            
        } 
        //login interface for Patient
        else if (UserID.equals("PAT001"))
        {
           while (!Pass.equals("123456")) {
                System.out.println("Try Your Password Again ");
                Pass = sc.nextLine();
            }
            System.out.println("Password accepted P.");

            PatientInfo b = new PatientInfo();
            b.patientDetails();
        }
        else 
        {
            System.out.println("user not found");
        }
        return UserID;
        
    }

} 
