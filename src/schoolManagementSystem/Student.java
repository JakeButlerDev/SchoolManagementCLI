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


    // Pays the selected amount as fees to school.
    public void updateFeesPaid(int fees) {
//        feesPaid = feesPaid + fees;
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    // Return the remaining fees owed by student.
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student: " + name +
                "\nTotal fees paid to date:$ " + feesPaid;
    }
}
