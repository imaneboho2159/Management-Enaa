import java.util.ArrayList;

class Student extends Person {



    private ArrayList<Double>  notes= new ArrayList<>();
    private Classes clase;

    public Student(int id, String name, String email, String phoneNumber) {
        super(id, name, email, phoneNumber);

    }

    public Classes getClase() {
        return clase;
    }

    public void setClase(Classes clase) {
        this.clase = clase;
    }
}