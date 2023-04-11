import java.util.HashMap;
import java.util.Map;

public class DoctorInfo {
    public void doctorInfo (Map<String, String> patientDetails)
    { 
        Map<String, String> hs = new HashMap<>();
        System.out.println("Appointment data:");
        for (String key : hs.keySet()) {
            String value = hs.get(key);
            System.out.println(key + ": " + value);
        }
    }
}

