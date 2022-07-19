package schoolManagementSystem;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
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

    // Adds to the salaryEarned, removes from total money earned by school.
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nSalary paid to date:$ " + salaryEarned;
    }
}
