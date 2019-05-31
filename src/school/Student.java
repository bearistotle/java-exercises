package school;

public class Student {
    private static int nextStudentID = 1;
    private String name;
    private final int studentID;
    private int numCredits;
    private double gpa;

    public Student(String name, int studentID, int numCredits, double gpa){
        this.name = name;
        this.studentID = studentID;
        this.numCredits = numCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentID){
        this(name, studentID, 0, 0);
    }

    public Student(String name){
        this(name, nextStudentID);
        nextStudentID++;
    }

    public String getName(){
        return this.name;
    }

    public int getStudentID(){
        return this.studentID;
    }

    public int getNumCredits(){
        return this.numCredits;
    }

    public double getGpa(){
        return this.gpa;
    }
    public void setName(String aName){
        this.name = aName;
    }

    public void setNumCredits(int aNumCredits){
        this.numCredits = aNumCredits;
    }

    public void setGpa(double aGpa){
        this.gpa = aGpa;
    }
}
