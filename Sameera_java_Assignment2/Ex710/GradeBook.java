package Ex710;
import java.util.ArrayList;

public class GradeBook {
    private String courseName;
    private ArrayList<Integer> grades; 
    
    public GradeBook(String courseName)
    {
        this.courseName = courseName;
        this.grades = new ArrayList<>();
    }

    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    // Method to add a grade
    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void processGrades() {
        outputGrades();

        //  minimum and maximum grades
        System.out.printf("%nClass average is %.2f%n", getAverage());
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",getMinimum(), getMaximum());
    }

    // Minimum grade
    public int getMinimum() {
        if (grades.isEmpty()) {
            return 0;
        }

        int min = grades.get(0);

        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    // Maximum grade
    public int getMaximum() {
        if (grades.isEmpty()) {
            return 0;
        }

        int max = grades.get(0);

        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    // average grade
    public double getAverage() {

        if (grades.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (int grade : grades) {
            total += grade;
        }

        return (double) total / grades.size();
    }

    
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");

        for (int i = 0; i < grades.size(); i++) {
            System.out.printf("Student %2d: %3d%n", i + 1, grades.get(i));
        }
    }

}
