package OOP;

class SchoolID {
    // Fields - information stored in the ID
    String studentName;
    String Lrn;
    String gradeSection;
    boolean isValid; // true = valid ID, false = expired ID

    // Methods - what the ID lets you do
    void tapToEnter() {
        if (isValid) {
            System.out.println(studentName + " tapped at the gate. You can enter.");
        } else {
            System.out.println(studentName + " cannot enter the gate. Your ID is expired or invalid.");
        }
    }

    void showInfo() {
        System.out.println(studentName + " | LRN: " + Lrn + " | " + gradeSection + " | Valid ID: " + isValid + " | ");
    }
}

public class Main {
    public static void main(String[] args) {
        SchoolID myID = new SchoolID(); // the ID is created (object)
        myID.studentName = "Juan Dela Cruz";
        myID.Lrn = "123456789012";
        myID.gradeSection = "Grade 12 - TVL";
        myID.isValid = true; // change to false to test expired ID

        myID.showInfo();
        myID.tapToEnter();
    }
}

