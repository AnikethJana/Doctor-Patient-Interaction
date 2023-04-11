import java.util.*;

public class DoctorInfo {
    public void doctorInfo (Map<String, String> hs)
    { 
        System.out.println("\n Appointment Data :");
        // output for doc
        Set es = hs.entrySet();
        Iterator itr = es.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

