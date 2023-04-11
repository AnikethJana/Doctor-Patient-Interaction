import java.util.*;

public class DoctorInfo {
    public void doctorInfo (Map<String, String> hs)
    { 
        System.out.println("\n Appointment Data :");
        // output for doc
        for (String key : hs.keySet()) {
            String value = hs.get(key);
            System.out.println(key + " : " + value);
        }
    }
}

