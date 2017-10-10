

package cell_hall;
// Object Names are preset, so setting them prior and then assigning values as names

 class Departement{

    private final String dep_name;
    Level[] levels = new Level[5];
   
    
    public Departement(String name) {
           this.dep_name = name;
           init();
    }
    public Level get_level(String name) {
        for (int i=0;i<5;i++) {
            if (name.equals(levels[i].get_name())) {
                return levels[i];
            }
        }
        return levels[0]; // default level is freshman 
    }
   
    
    
    
    
    
/***
    public void setLevel(int levelNum)
    {
        levels[levelNum].setCourses();//Takes csv
    }

    public Level getLevel(int levelNum)
    {
        //Creating departments out of file
        return levels[levelNum];
    }

    public String getDepartmentName()//rturns dep name a string
    {
        return DepName;
    }

    public void setDepName(String DepName)
    {
        this.DepName = DepName;
    }

***/
    
    private void init() {
        levels[0] = new Level("freshmen");
        levels[1] = new Level("sophomore");
        levels[2] = new Level("junior");
        levels[3] = new Level("senior1");
        levels[4] = new Level("senior2");
    }

} 