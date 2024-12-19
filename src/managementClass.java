public class managementClass {
    private Student [] students;
    private Class[] classes;
    private trainer[]  trainers;
    private int nomberStudents;
    private int nomberClasses;
    private int nomberTrainers;

    public managementClass(Student[] students, Class[] classes, trainer[] trainers, int nomberStudents, int nomberClasses, int nomberTrainers) {
        this.students = students;
        this.classes = classes;
        this.trainers = trainers;
        this.nomberStudents = nomberStudents;
        this.nomberClasses = nomberClasses;
        this.nomberTrainers = nomberTrainers;
    }
}
