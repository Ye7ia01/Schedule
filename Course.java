package cell_hall;

public class Course {
    
    String courseName = new String(); 
    public void setCourseName(String name) { this.courseName = name; }
    public String getCourseName() { return this.courseName; }
    
    String instructor = new String();
    public void setInstructor( String name) { this.instructor = name; }
    public String getInstructor() { return this.instructor; }
    
    String courseID = new String();
    public void setCourseID(String id) { this.courseID = id; }
    public String getCourseID() { return this.courseID; }

    public Course() {
        this.courseName = "";
        this.courseID = "";
        this.instructor = "";
    }
}



// The following is a suggestion (can be omitted).

class Lecture extends Course {
    int cells;
    String hall;

    public Lecture(String name, String id,int cells, String hall) {
        super.courseName = name;
        super.courseID = id;
        cells = 3;
        this.hall = hall;
    }
}

class Tutorial extends Course {
    int cells;
    String lab;

    public Tutorial(String name, String id,int cells, String lab) {
        super.courseName = name;
        super.courseID = id;
        cells = 2;
        this.lab = lab;
    }
}
