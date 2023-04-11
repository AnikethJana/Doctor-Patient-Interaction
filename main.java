import java.util.*;

class main {
    public static void main(String[] args) {
        int num = 2;
        Scanner scn = new Scanner(System.in);
        while (num < 3) {
        System.out.println("Would you Like to \n 1. Login \n 2. Exit ? ");
        
        int p = scn.nextInt();
        switch (p) {
            case 1:
            LoginInterface a = new LoginInterface();
            a.EntryInterface();
            break;
        
            case 2:
            System.out.println("Application Closing ..........");
            num = 4;
            break;
        }
        }
        scn.close();
        
        
        
    }
}
