/**
 *  Subject.java
 *  Represents a course in the Year 2 program.
 *  This class stores the information about subject details such as subject code, name, credit hours and department.
 *
 *  @author  [Your Name]
 *  @version 1.0
 *  @since   [Date Created or Last Modified]
 */
public class lab5_T2 {

    // Constants (initialized in a static block or directly) - use final and UPPER_SNAKE_CASE
    private static final int DEFAULT_CREDIT_HOURS;
    private static final String DEFAULT_DEPARTMENT;

    static {
        DEFAULT_CREDIT_HOURS = 3;  // Example default credit hours
        DEFAULT_DEPARTMENT = "Computer Science"; // Example default department
    }

     // Instance variables (use camelCase for non-constants)
    private String subjectCode;
    private String subjectName;
    private int creditHours;
    private String department;



    /**
     * Constructs a new Subject object with the specified subject code and name.
     * It initializes credit hours with default value, and default department.
     * @param subjectCode The unique code for the subject.
     * @param subjectName The name of the subject.
     */
    public lab5_T2(String subjectCode, String subjectName) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.creditHours = DEFAULT_CREDIT_HOURS;
        this.department = DEFAULT_DEPARTMENT;

    }

    /**
     * Constructs a new Subject object with the specified subject code, name, credit hours and department.
     * @param subjectCode The unique code for the subject.
     * @param subjectName The name of the subject.
     * @param creditHours The credit hours for the subject.
     * @param department The department which offers the subject.
     */
    public lab5_T2(String subjectCode, String subjectName, int creditHours,String department) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.creditHours = creditHours;
        this.department = department;

    }


    /**
     * Returns the unique code of the subject.
     * @return The subject code.
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * Returns the name of the subject.
     * @return The subject name.
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Returns the credit hours for this subject.
     * @return The credit hours.
     */
    public int getCreditHours() {
        return creditHours;
    }
    /**
     * Returns the department of this subject.
     * @return The department.
     */
    public String getDepartment(){
        return department;
    }

    /**
     * Sets the credit hours for this subject.
     * @param creditHours The new credit hours to set.
     */
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    /**
     * Sets the department for this subject.
     * @param department the new department to set.
     */
    public void setDepartment(String department){
        this.department = department;
    }

     /**
      * Returns the default credit hours for Subject class.
      * @return default credit hours.
      */
    public static int getDefaultCreditHours(){
        return DEFAULT_CREDIT_HOURS;
    }

    /**
     * Returns the default department for Subject class.
     * @return default department.
     */
    public static String getDefaultDepartment(){
        return DEFAULT_DEPARTMENT;
    }


    /**
     * Returns a string representation of the Subject object.
     * @return A string containing the subject code, name, credit hours, and department.
     */
    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", creditHours=" + creditHours +
                ", department='" + department + '\'' +
                '}';
    }


    /**
     * Main method for testing the Subject class.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {

        lab5_T2 softwareEngineering = new lab5_T2("SE220", "Software Engineering");
        lab5_T2 computerArchitecture = new lab5_T2("CA230","Computer Architecture", 4, "Electrical Engineering");
        lab5_T2 dataStructure = new lab5_T2("DS210", "Data Structure");
        System.out.println(softwareEngineering);
        System.out.println(computerArchitecture);
        System.out.println(dataStructure);
        System.out.println("Default Department "+ lab5_T2.getDefaultDepartment());
        System.out.println("Default credit hours: "+ lab5_T2.getDefaultCreditHours());

        softwareEngineering.setCreditHours(4);
        softwareEngineering.setDepartment("Computer Science");
        System.out.println(softwareEngineering);

    }
}