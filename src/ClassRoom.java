import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {
    private String Name ;
    private Trainer trainers;
    private Student students;

    ArrayList<ClassRoom> classRoom= new ArrayList<>();
    ArrayList<Trainer> trainer= new ArrayList<>();
    ArrayList<Student>student=new ArrayList<>();

    public ClassRoom(String name, Trainer trainers,Student students) {
        Name = name;
        this.trainers = trainers;
        this.students=students;
    }

    public ClassRoom() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Trainer getTrainers() {
        return trainers;
    }

    public void setTrainers(Trainer trainers) {
        this.trainers = trainers;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public void addClassRoom(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the Classroom :");
        this.setName(scanner.nextLine());
        System.out.print("Enter id of the trainer :");
        int idT =  scanner.nextInt();
        scanner.nextLine();
        Trainer trainers =null;
        for(Trainer t : trainer){
            if(t.getId()== idT){
                trainers = t ;
                break;
            }
        }
        if(trainers==null){
            System.out.println("Trainer not found !");
            return;
        }
        ClassRoom classRooms= new ClassRoom(Name, trainers,students);
        classRoom.add(classRooms);
        System.out.println("ClassRoom added !");
    }

    public void displayClassRoom() {
        if (classRoom.isEmpty()) {
            System.out.println("CalassRoom not found !.");
            return;
        }

        System.out.println("\nList of ClassRoom:");
        for (ClassRoom c : classRoom) {
            System.out.println("------------------------");
            System.out.println("Name: " + c.getName());
            System.out.println("Trainer: " + c.getTrainers().getName());
            System.out.println("Students : " + c.getStudent());
        }
    }

    public void updateClassRoom() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Name of the classroom for update: ");
        String name = scanner.nextLine();

        for (ClassRoom c : classRoom) {
            if (c.getName().equals(name)) {
                System.out.print("New name: ");
                c.setName(scanner.nextLine());
                System.out.println("Classroom updated!");
                return;
            }
        }
        System.out.println("Classroom not found !");
    }
    public void deleteClassRoom() {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Name of the classroom to delete: ");
        String name = scanner.nextLine();

        for (int i = 0; i < classRoom.size(); i++) {
            if (classRoom.get(i).getName().equals(name)) {
                classRoom.remove(i);
                System.out.println("Classroom deleted!");
                return;
            }
        }
        System.out.println("Classroom not found !");
    }

}
