import javax.security.auth.Subject;

/**
 * lab5_T6.java
 * Represents a study session for a particular day.
 * This class stores information about the study session such as the start time, end time, subject and location.
 *
 * @author [Your Name]
 * @version 1.0
 * @since [Current Date]
 */
public class lab5_T6 {

    private String startTime;
    private String endTime;
    private String location;
    private String subject; //Using the previous class as object for this class

    /**
     * Constructs a new lab5_T6 object with the specified start time, end time, location, and subject.
     * @param startTime The start time of the session (e.g., "9:00 AM").
     * @param endTime The end time of the session (e.g., "10:00 AM").
     * @param location The location of the session (e.g., "Room 101").
     * @param subject The subject of the session.
     */
    public lab5_T6(String startTime, String endTime, String location, String subject) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.subject = subject;
    }

     /**
     * Gets the start time of the session.
     * @return the start time of the session.
     */
    public String getStartTime() {
        return startTime;
    }
    /**
     * Sets the start time of the session.
     * @param startTime The start time of the session.
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    /**
     * Gets the end time of the session.
     * @return the end time of the session.
     */
    public String getEndTime() {
        return endTime;
    }
    /**
     * Sets the end time of the session.
     * @param endTime The end time of the session.
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    /**
     * Gets the location of the session.
     * @return the location of the session.
     */
    public String getLocation() {
        return location;
    }
    /**
     * Sets the location of the session.
     * @param location The location of the session.
     */
    public void setLocation(String location) {
        this.location = location;
    }
    /**
     * Gets the Subject of the session.
     * @return the subject of the session.
     */
    public String getSubject() {
        return subject;
    }
    /**
     * Sets the Subject of the session.
     * @param subject The subject of the session.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Returns a string representation of the lab5_T6 object.
     * @return A string containing the start time, end time, location and subject of session.
     */
    @Override
    public String toString() {
        return "lab5_T6{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", location='" + location + '\'' +
                ", subject=" + subject +
                '}';
    }
    /**
     * Main method for testing the lab5_T6 class.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
         String softwareEngineering = new Subject ("SE220", "Software Engineering");
         lab5_T6 session1 = new lab5_T6("9:00 AM", "10:00 AM", "Room 101", softwareEngineering);
         System.out.println(session1);

         session1.setStartTime("10:00 AM");
         System.out.println(session1);

    }
}
