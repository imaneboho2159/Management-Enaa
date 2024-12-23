import java.util.ArrayList;
import java.util.Scanner;

class Student extends Person {


    ArrayList<Student> student= new ArrayList<>();
    ArrayList<Double>  notes= new ArrayList<>();


    public Student(int id, String name, String email, String phoneNumber) {
        super(id, name, email, phoneNumber);
        this.notes = new ArrayList<Double>();

    }

    public Student() {
        super();
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }
    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        this.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter student name: ");
        this.setName(scanner.nextLine());
        System.out.print("Enter student email: ");
        this.setEmail(scanner.nextLine());
        System.out.print("Enter student phone number: ");
        this.setPhoneNumber(scanner.nextLine());
        Student students = new Student(this.getId(), this.getName(), this.getEmail(), this.getPhoneNumber());
        student.add(students);
        System.out.print(" Student added  ");

    }
    public void displayStudent(){
        if (student.isEmpty()){
            System.out.println("No students found");
            return;
        }
        System.out.println("\n List of students: ");
        for (int i = 0; i < student.size(); i++){
            System.out.println("-----------------------------------");
            System.out.println("Student ID: " + student.get(i).getId());
            System.out.println("Student Name: " + student.get(i).getName());
            System.out.println("Student Email: " + student.get(i).getEmail());
            System.out.println("Student Phone Number: " + student.get(i).getPhoneNumber());

        }

    }
    public void updateStudent() {
        Scanner scanner = new Scanner(System.in);

        if(student.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        System.out.print("Enter student ID for updating: ");
        this.setId(scanner.nextInt());
        scanner.nextLine();

        for(int i = 0; i < student.size(); i++) {
            if(student.get(i).getId() == this.getId()) {
                System.out.print("Enter new student name: ");
                String newName = scanner.nextLine();

                System.out.print("Enter new student email: ");
                String newEmail = scanner.nextLine();

                System.out.print("Enter new phone number: ");
                String newPhoneNumber = scanner.nextLine();


                student.get(i).setName(newName);
                student.get(i).setEmail(newEmail);
                student.get(i).setPhoneNumber(newPhoneNumber);

                System.out.println("Student information has been updated successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    public void deleteStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID to delete: ");
        this.setId(scanner.nextInt());
        for(int i=0; i< student.size(); i++){
            if(student.get(i).getId() == this.getId()){
                student.remove(i);
                System.out.println("Student deleted  ");
                return;

            }
        }
        System.out.print("\n Student not found ! ");
    }

}