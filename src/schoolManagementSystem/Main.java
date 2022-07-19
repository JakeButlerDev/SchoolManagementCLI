package schoolManagementSystem;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2, "Rakshith", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School ghs = new School(teacherList, studentList);



        tamasha.updateFeesPaid(5_000);
        rakshith.updateFeesPaid(6_000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned() + ".");

        // MAKING GHS PAY TEACHERS
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent on the salary for " + lizzy.getName() + " and now has $" + ghs.getTotalMoneyEarned() + ".");

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent on the salary for " + vanderhorn.getName() + " and now has $" + ghs.getTotalMoneyEarned() + ".");

        System.out.println(rakshith);

        melissa.receiveSalary(melissa.getSalary());
        System.out.println(melissa);
    }
}
