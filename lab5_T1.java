public class lab5_T1 {

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



    // Constructor(s) - use camelCase for parameters
    public lab5_T1(String subjectCode, String subjectName) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.creditHours = DEFAULT_CREDIT_HOURS;
        this.department = DEFAULT_DEPARTMENT;

    }
    public lab5_T1(String subjectCode, String subjectName, int creditHours,String department) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.creditHours = creditHours;
        this.department = department;

    }


    // Getters (use camelCase) - access instance variables
    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCreditHours() {
        return creditHours;
    }
    public String getDepartment(){
        return department;
    }

    // Setters (use camelCase for parameter)
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    // Static Getters for constants
    public static int getDefaultCreditHours(){
        return DEFAULT_CREDIT_HOURS;
    }

    public static String getDefaultDepartment(){
        return DEFAULT_DEPARTMENT;
    }


    // Additional methods for subject functionality
    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", creditHours=" + creditHours +
                ", department='" + department + '\'' +
                '}';
    }


    public static void main(String[] args) {

        lab5_T1 softwareEngineering = new lab5_T1("SE220", "Software Engineering");
        lab5_T1 computerArchitecture = new lab5_T1("CA230","Computer Architecture", 4, "Electrical Engineering");
        lab5_T1 dataStructure = new lab5_T1("DS210", "Data Structure");
        System.out.println(softwareEngineering);
        System.out.println(computerArchitecture);
        System.out.println(dataStructure);
        System.out.println("Default Department "+ lab5_T1.getDefaultDepartment());
        System.out.println("Default credit hours: "+ lab5_T1.getDefaultCreditHours());

        softwareEngineering.setCreditHours(4);
        softwareEngineering.setDepartment("Computer Science");
        System.out.println(softwareEngineering);

    }
}