package constructor;

public class course {
    private String courseName;
    private int duration;
    private double fee;
    static String instituteName;

    public course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
    public static void main(String[] args) {
        updateInstituteName("Tech Academy");

        course c1 = new course("Java Programming", 6, 15000);
        course c2 = new course("Web Development", 4, 12000);

        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
