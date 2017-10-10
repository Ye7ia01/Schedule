package cell_hall;



class Level{
    
    private final String name;
    private Course[] courses;
    private final int num_of_courses;
    
    public Level(String name) {
        this.name = name;
        this.num_of_courses = 12;
        courses = new Course[num_of_courses];
        init();
    }
    
    
    public String get_name() {
        return this.name;
    }
     
    public void set_courses(String[] c,String[] id,String[] i) {
        // the three arrays must be equally indexed so that course is related with its id & instructor
        
        // THE ONLY WAY TO SET A VERY BIG DATA JUST BY 4 LINES OF CODE , WE WILL JUST MAKE 3 EQUALLY-INDEXED ARRAYS
        for (int count=0;count<c.length;count++) {
               courses[count].setCourseName(c[count]);
               courses[count].setCourseID(id[count]);
               courses[count].setInstructor(i[count]);
         }
     } // the same way used above is used below to return large data with minimum effort, we will just deal with index
    public String[] get_courses_name() {
        String[] n = new String[num_of_courses];
                
        for(int i=0;i<num_of_courses;i++) {
            n[i] = courses[i].getCourseName();
        }
        return n;
    }
    public String[] get_courses_id() {
        String[] n = new String[num_of_courses];
                
        for(int i=0;i<num_of_courses;i++) {
            n[i] = courses[i].getCourseID();
        }
        return n;
    }
    public String[] get_courses_inst() {
        String[] n = new String[num_of_courses];
                
        for(int i=0;i<num_of_courses;i++) {
            n[i] = courses[i].getInstructor();
        }
        return n;
    }
    
    
    public void add_course(String course,String id,String inst) { // if the array is already full and max , course will not be added
        
        for (int i=0;i<num_of_courses;i++) {
            if (courses[i].getCourseName() == "") {
                courses[i].setCourseName(course);
                courses[i].setCourseID(id);
                courses[i].setInstructor(inst);
            }
        }
    }
    
    
   
    
    
    
    
/***
  

    
    

    public void setLevelNum(int levelNum)
    {
        //Setting Level num
         this.LevelNum = levelNum;
    }

***/
    private void init() {
        for (int i=0;i<num_of_courses;i++) {
            courses[i] = new Course();
        }
    }
} 