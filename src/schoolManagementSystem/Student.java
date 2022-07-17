package schoolManagementSystem;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student (int id, String name, int grade) {

        this.feesPaid = 0;
        this.feesTotal = 30_000;

        this.id = id;
        this.name = name;
        this.grade = grade;



    }

    // Not going to alter student name or id.


    // Used to update student's grade. Param grade is the new grade of the student
    public void setGrade(int grade) {
        this.grade = grade;
    }


    public void updateFeesPaid(int fees) {
//        feesPaid = feesPaid + fees;
        feesPaid += fees;
    }


}
