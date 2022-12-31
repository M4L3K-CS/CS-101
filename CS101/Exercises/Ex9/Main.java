package CS101.Exercises.Ex9;

/*Print the following messages:
"Student will not graduate" if gpa < 2.0
"Student is a regular graduate" if 2.0 <= GPA < 3.0
"Student will graduate with honours" if 3.0 <= GPA < 3.5
"Student will graduate with high honors" if GPA >= 3.5 */
public class Main {
    public static void main(String[] args) {
        float x = 2.7F;
        if (x >= 0 && x < 2.0) {
            System.out.println("Student will not graduate");
        } else if (x >= 2.0 && x < 3.0) {
            System.out.println("Student is a regular graduate");
        } else if (x >= 3.0 && x < 3.5) {
            System.out.println("Student will graduate with honours");
        } else if (x >= 3.5 && x <= 4.0) {
            System.out.println("Student will graduate with high honours");
        } else {
            System.out.println("GPA must be between 0.0 and 4.0, inclusive");
        }
    }
}