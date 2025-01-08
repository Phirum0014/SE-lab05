
public class lab5 {

    // Constants for general course information (static and final as they do not change).
    private static final int MAX_CREDITS = 6;
    private static final int MIN_CREDITS = 1;

    // Static block for additional initialization if required.
    static {
        // Any initialization logic for static variables.
    }

    // Instance variables for Subject attributes.
    private String subjectCode;
    private String subjectName;
    private int credits;

    // Constructor to initialize Subject instance.
    public lab5(String subjectCode, String subjectName, int credits) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        if (credits >= MIN_CREDITS && credits <= MAX_CREDITS) {
            this.credits = credits;
        } else {
            throw new IllegalArgumentException("Credits must be between " + MIN_CREDITS + " and " + MAX_CREDITS);
        }
    }

    // Getters for accessing private variables.
    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCredits() {
        return credits;
    }

    // Example of static getter for a constant value.
    public static int getMaxCredits() {
        return MAX_CREDITS;
    }

    public static int getMinCredits() {
        return MIN_CREDITS;
    }

    // Main method for demonstration (optional for testing purposes).
    public static void main(String[] args) {
        try {
            lab5 subject = new lab5("CS202", "Data Structures", 4);
            System.out.println("Subject Code: " + subject.getSubjectCode());
            System.out.println("Subject Name: " + subject.getSubjectName());
            System.out.println("Credits: " + subject.getCredits());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        // Access static constants via static methods.
        System.out.println("Max Credits: " + lab5.getMaxCredits());
        System.out.println("Min Credits: " + lab5.getMinCredits());
    }
}
