package Ex710;

public class GradeBookTest {
    public static void main(String[] args) {
        
        GradeBook obj = new GradeBook("Introduction to Java Programming Language");

        // add grades dynamically
        obj.addGrade(87);
        obj.addGrade(68);
        obj.addGrade(94);
        obj.addGrade(100);
        obj.addGrade(83);
        obj.addGrade(78);
        obj.addGrade(85);
        obj.addGrade(91);
        obj.addGrade(76);
        obj.addGrade(87);

        System.out.printf("Welcome to the grade book for%n%s%n%n",obj.getCourseName());
        obj.processGrades();
    }
}
