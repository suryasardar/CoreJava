import java.util.*;

// Abstract class
abstract class Vaccine {
    int age;
    String nationality;
    boolean firstDoseTaken = false;

 
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Concrete method for first dose
    public void firstDose() {
        if (age >= 18 && nationality.equals("Indian")) {
            System.out.println("First dose taken successfully.");
            System.out.println("Please pay Rs. 250.");
            firstDoseTaken = true;
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    // Concrete method for second dose
    public void secondDose() {
        if (firstDoseTaken) {
            System.out.println("Second dose taken successfully.");
        } else {
            System.out.println("Please take the first dose before second dose.");
        }
    }

    // Abstract method
    public abstract void boosterDose();
}

 
class VaccinationSuccessful extends Vaccine {

    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        if (firstDoseTaken) {
            System.out.println("Booster dose taken successfully.");
        } else {
            System.out.println("Booster dose not allowed before first and second doses.");
        }
    }
}

 
public class Vaccination {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        String nationality=sc.next();
        VaccinationSuccessful person1 = new VaccinationSuccessful(age, nationality);

        person1.firstDose();
        person1.secondDose();
        person1.boosterDose();
    }
}
