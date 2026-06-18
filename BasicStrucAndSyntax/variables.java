package BasicStrucAndSyntax;

public class variables {
    public static void main(String[] args) {
        String name = "Whayne Zackarry C. Santos"; 
        int age = 17; //no double qoute for numbers(int)
        final int score = 10;
        String subject; //declaring variable without initializing
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        age = 18; //reassining the value of age
        System.out.println("Age: " + age );
        float height = 1.5f;
        System.out.println("Height: " + height);
        char section = 'P';
        System.out.println("Section: " + section);  
        boolean regularStudent = true;
        System.out.println("Regular Student: " + regularStudent);
    }

}