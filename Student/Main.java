public class Main {
    int id;
    String name;
    String qualification;
    int age;

    public void getStudentInfo(){
         System.out.println("ID: " + id);
         System.out.println("Name: " + name);
         System.out.println("Qualification: " + qualification);
         System.out.println("Age " + age);
    }

    public static void main(String[] args) {
         Main student =new Main();
         student.id = 101;
         student.name = "Surya";
         student.qualification = "MCA";
         student.age = 20;
         
         student.getStudentInfo();
    }
}