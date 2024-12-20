import java.util.Scanner;
import java.util.ArrayList;


 class Application {
    Application application = new Application();
    Student student = new Student();
    Trainer trainer=new Trainer();
    Classes classes =new Classes ();
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Trainer> trainer = new ArrayList<>();
    private ArrayList<Classes> classes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
    }

    public void ManagementAap () {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1. Management Student");
            System.out.println("2. Management Trainer");
            System.out.println("3. Management Class");
            System.out.println("0. Get out");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            while (true) {
                switch (choice) {
                    case 1:
                        application.MenuStudent();
                        break;
                    case 2:
                        application.MenuTrainer();
                        break;
                    case 3:

                        application.MenuClasses();
                        break;
                    case 0:
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Choice invalid!");
                }
            }
        }

        private void MenuStudent() {
        while (true) {
            System.out.println("\n=== Management of students  ===");
            System.out.println("1. Add student");
            System.out.println("2. Display students");
            System.out.println("3. Update student");
            System.out.println("4. Delete student");
            System.out.println("5. Get out");
            System.out.print("Enter  choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    student.addStudent();
                    break;
                case 2:
                    student.displayStudent();
                    break;
                case 3:
                    student.updateStudent();
                    break;
                case 4:
                    student.deleteStudent();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("choice invalid!");
            }
        }
    }
     private void MenuTrainer() {
         while (true) {
             System.out.println("\n=== Management of Trainer  ===");
             System.out.println("1. Add Trainer");
             System.out.println("2. Display Trainer");
             System.out.println("3. Update Trainer");
             System.out.println("4. Delete Trainer");
             System.out.println("5. Get out");
             System.out.print("Enter  choice: ");
             Scanner scanner = new Scanner(System.in);
             int choice = scanner.nextInt();
             scanner.nextLine();

             switch (choice) {
                 case 1:
                     trainer.addTrainer();
                     break;
                 case 2:
                     trainer.displayTrainer();
                     break;
                 case 3:
                     trainer.updateTrainer();
                     break;
                 case 4:
                     trainer.deleteTrainer();
                     break;
                 case 5:
                     return;
                 default:
                     System.out.println("choice invalid!");
             }
         }
     }
     private void MenuClasses() {

             while (true) {
                 System.out.println("\n=== Management of Classes ===");
                 System.out.println("1. Add Class");
                 System.out.println("2. Display Class");
                 System.out.println("3. Update Class");
                 System.out.println("4. Delete Class");
                 System.out.println("5. Get out");
                 System.out.print("Enter  choice: ");
                 Scanner scanner = new Scanner(System.in);
                 int choice = scanner.nextInt();
                 scanner.nextLine();

                 switch (choice) {
                     case 1:
                         classes.addClass();
                         break;
                     case 2:
                         classes.displayClass();
                         break;
                     case 3:
                         classes.updateClass();
                         break;
                     case 4:
                         classes.deleteClass();
                         break;
                     case 5:
                         return;
                     default:
                         System.out.println("choice invalid!");
                 }
             }
         }
 }
