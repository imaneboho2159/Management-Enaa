import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private static  ArrayList<Student> students= new ArrayList<>();


    public Student(int id, String firstName, String lastName, String email, String phoneNumber) {
        super(id, firstName, lastName, email, phoneNumber);

    }

    public static void menu (){
         Scanner scanner = new Scanner(System.in);
          while(true){
              System.out.print("Enter your choice");
              System.out.println("1. Add Student");
              System.out.println("2. Display Student");
              System.out.println("3. Remove Student");
              System.out.println("4. Update Student");
              System.out.println("5. Exit");

              int choice = scanner.nextInt();
              scanner.nextLine();

              switch(choice){
                  case 1: Add();break;
                  case 2: Display();break;
                  case 3:Remove ();break;
                  case 4:Update();break;
                  case 5:{
                      return;
                  }
                   default:System.out.println("Invalid choice");
              }

          }

   }

   public static void Add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID");
        int id = scanner. nextInt();
        scanner.nextLine();
        System.out.println("Enter first name");
        String firstName = scanner. nextLine();
        System.out.println("Enter last name");
        String lastName = scanner. nextLine();
        System.out.println("Enter email");
        String email = scanner. nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner. nextLine();

        students.add(new Student(id, firstName, lastName, email, phoneNumber));
        System.out.println("Student added");
    }


    public static void Display(){
        if (students.isEmpty()){
          System.out.println("No students found");
        }
        else {
            System.out.println("List of students:");
            for(int i=0; i<students.size(); i++){
               System.out.println(students.get(i).toString());
            }
        }
    }
    public static void Remove(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID");
        int id = scanner. nextInt();
        scanner.nextLine();
        for (int i=0; i<students.size(); i++){

            if (students.get(i).getId() == id){
                students.remove(i);
                System.out.println("Student Removed");
            }
        }
    }
    public static void Update(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID");
        int id = scanner. nextInt();
        scanner.nextLine();
        for(int i=0; i<students.size(); i++) {
            if(students.get(i).getId() == id) {
                System.out.println("Enter first name");
                String firstName = scanner.nextLine();
                System.out.println("Enter last name");
                String lastName = scanner.nextLine();
                System.out.println("Enter email");
                String email = scanner.nextLine();
                System.out.println("Enter phone number");
                String phoneNumber = scanner.nextLine();

                students.add(new Student(id, firstName, lastName, email, phoneNumber));


            }
        }
    }
}
