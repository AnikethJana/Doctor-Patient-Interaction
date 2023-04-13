import java.util.Map;
import java.util.Scanner;

class LoginInterface 
{
    public String EntryInterface() 
    {   int i = 1;
        System.out.print("Enter Your UserID : ");
        Scanner sc = new Scanner(System.in);
        String UserID = sc.nextLine();
        
        
        System.out.print("Enter your Password: ");
        String Pass = sc.nextLine();
        //login Interface for Doctor
        if (UserID.equals("DOC001")) {
            
            while (!Pass.equals("12345678") && i < 4) {
                System.out.println("Try Your Password Again - attempt " + i);
                Pass = sc.nextLine();
                i++;
            }
            if(Pass.equals("12345678")){
            System.out.println("Password accepted Entering..."); 
           //ERROR#################################################
            Map<String,String> hs = PatientInfo.hs;
            DoctorInfo c = new DoctorInfo();
            c.doctorInfo(hs);
            }
            else {
                System.out.println("Maximum Attempts Reached !! Going Back to Home ...");
                i=0;
            }
        } 
        //login interface for Patient
        else if (UserID.equals("PAT001"))
        {
           while (!Pass.equals("123456") && i < 4) {
                System.out.println("Try Your Password Again - attempt " + i);
                Pass = sc.nextLine();
                i++;
            }
            if (Pass.equals("123456")){
            System.out.println("Password accepted P.");
            PatientInfo.patientDetails();
            }
            else{
                System.out.println("Maximum Attempts Reached !! Going Back to Home ...");
            }
        }
        else 
        {
            System.out.println("user not found");
        }
        return UserID;
        
    }

} 
