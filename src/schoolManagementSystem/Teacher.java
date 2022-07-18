package schoolManagementSystem;

public class Teacher {

    private int id;
    private String name;
    private int salary;


    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Return the id for the instance of a teacher.
    public int getId() {
        return id;
    }

    // Return the name of the teacher.
    public String getName() {
        return name;
    }

    // Return the salary of the teacher.
    public int getSalary(){
        return salary;
    }

    // Set the teacher's salary.
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
