public class Patient {

    private int id;
    private String surname;
    private String name;
    private String fatherName;
    private String adress;
    private String phoneNumber;
    private int medicalCardNumber;
    private String issue;

    public Patient(){
        this.id = 0;
        this.surname = "";
        this.fatherName = "";
        this.name = "";
        this.adress = "";
        this.phoneNumber = "";
        this.medicalCardNumber = 0;
        this.issue = "";
    }

    public Patient(int id, String surname, String name, String fatherName, String adress, String phoneNumber, int medicalCardNumber, String issue){
        this.id = id;
        this.surname = surname;
        this.fatherName = fatherName;
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.medicalCardNumber = medicalCardNumber;
        this.issue = issue;
    }

    @Override
    public String toString(){
        return "ID: " + id + " ; " +
                "Name: " + name + " ; " +
                "Surname: " + surname + " ; " +
                "FatherName: " + fatherName + " ; " +
                "Adress: " + adress + " ; " +
                "Phone: " + phoneNumber + " ; " +
                "MedicalCardNumber: " + medicalCardNumber + " ; " +
                "Issue: " + issue + " ; ";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
}
