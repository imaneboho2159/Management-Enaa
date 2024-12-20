import java.util.ArrayList;
import java.util.Scanner;

class Student extends Person {


    private final ArrayList<Student> students= new ArrayList<>();
    private ArrayList<Double>  notes= new ArrayList<>();
    private Classes clase;

    public Student(int id, String name, String email, String phoneNumber) {
        super(id, name, email, phoneNumber);

    }
    public Student() {

    }

    public Classes getClase() {
        return clase;
    }

    public void setClase(Classes clase) {
        this.clase = clase;
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    public void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        this.setId(scanner.nextInt());
        System.out.print("Enter student name: ");
        this.setName(scanner.nextLine());
        System.out.print("Enter student email: ");
        this.setEmail(scanner.nextLine());
        System.out.print("Enter student phone number: ");
        this.setPhoneNumber(scanner.nextLine());
        Student student = new Student(this.getId(), this.getName(), this.getEmail(), this.getPhoneNumber());
        System.out.print(" Student added  ");
    }
    public void displayStudent(){
        if (students.isEmpty()){
            System.out.println("No students found");
            return;
        }
        System.out.println("\n List of students: ");
        for (int i = 0; i < students.size(); i++){
            System.out.println("-----------------------------------");
            System.out.println("Student ID: " + students.get(i).getId());
            System.out.println("Student Name: " + students.get(i).getName());
            System.out.println("Student Email: " + students.get(i).getEmail());
            System.out.println("Student Phone Number: " + students.get(i).getPhoneNumber());

        }

    }
    public void updateStudent(){
        Scanner scanner = new Scanner(System.in);
        if(students.isEmpty()){
            System.out.print("no student found ! ");
         return;
        }

        for(int i=0; i< students.size(); i++){
            if(students.get(i).getId() == this.getId()){

               System.out.print("\n Student name: " + students.get(i).getName() );
               System.out.print("\n Student email: " + students.get(i).getEmail() );
               System.out.print("\n Student phone number: " + students.get(i).getPhoneNumber() );
               System.out.print("\n Student is updated " );
               return;
            }

        }
        System.out.print("\n Student not found ! ");
    }

    public void deleteStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        this.setId(scanner.nextInt());
        for(int i=0; i< students.size(); i++){
            if(students.get(i).getId() == this.getId()){
                students.remove(i);
                System.out.println("Student deleted  ");
                return;

            }
        }
        System.out.print("\n Student not found ! ");
    }

}