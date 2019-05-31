package school;

import java.util.ArrayList;

public class Course {
    static private int nextCourseID = 1;
    private int courseID;
    private String name;
    private String instructor;
    private ArrayList<Student> roster;

    public static int getNextCourseID() {
        return nextCourseID;
    }

    public static void setNextCourseID(int nextCourseID) {
        Course.nextCourseID = nextCourseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public Course(String name, String instructor){
        this.name = name;
        this.instructor = instructor;
        this.roster = new ArrayList<>();
        this.courseID = nextCourseID;
        nextCourseID++;
    }

    public int getCourseID(){
        return this.courseID;
    }

    public String getName(){
        return this.name;
    }

    public String getInstructor(){
        return this.instructor;
    }

    private void setRoster(ArrayList<Student> roster){
        this.roster = roster;
    }

}
