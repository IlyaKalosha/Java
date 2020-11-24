import java.util.ArrayList;
import java.util.List;

public class Hospital {

    public static void main(String[] args) {
        ArrayList<Patient> Hospital = new ArrayList<Patient>();

        Hospital.add(new Patient(1,"Kalosha","Ilya","Valer'evich","Minsk","+375298092169",1,"COVID-19"));
        Hospital.add(new Patient(2,"A","A","A","Minsk","+375291111111",2,"COVID-19"));
        Hospital.add(new Patient(3,"B","B","B","Minsk","+375292222222",3,"COVID-20"));
        Hospital.add(new Patient(4,"C","C","C","Minsk","+375333333333",4,"COVID-19"));
        Hospital.add(new Patient(5,"D","D","D","Minsk","+375294444444",5,"COVID-20"));
        Hospital.add(new Patient(6,"E","E","E","Minsk","+375295555555",6,"COVID-19"));
        Hospital.add(new Patient(7,"F","F","F","Minsk","+375296666666",7,"COVID-20"));

        for (var patient:
             Hospital) {
            if(patient.getIssue() == "COVID-19"){
                System.out.println(patient.toString());
            }
        }

        System.out.println();
        System.out.println();
        
        int leftLimit = 2;
        int rightLimit = 5;

        for (var patient:
             Hospital) {
            if(patient.getMedicalCardNumber() >= leftLimit && patient.getMedicalCardNumber() <= rightLimit){
                System.out.println(patient.toString());
            }
        }
    }
}
