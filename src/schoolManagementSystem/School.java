package schoolManagementSystem;

import java.util.ArrayList;

public class School {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    // Returns the list of teachers in the school.
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    // Adds a teacher to the school.
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Return the list of students in the school.
    public ArrayList<Student> getStudents() {
        return students;
    }

    // Add a student to the school.
    public void addStudents(Student student) {
        students.add(student);
    }

    // Return the total money earned by the school.
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // Update the total money earned by the school, add fees currently paid to those previously paid.
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    // Returns the total money spent by the school.
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // Update the money spent by the school, aka salaries paid to teachers.
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
