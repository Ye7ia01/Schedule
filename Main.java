/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cell_hall;

class Main {
    
    

public static void main(String[] args) {  

    init();

    
    /***  RESERVATION PROCESS TEST :    // reservation makes sure so that even differnt schedules don't share the same HALL
         ScheduleFrame f = new ScheduleFrame();
        // f.setVisible(true);  keep this commented as testing is not on gui
         Cell cell = new Cell(1);
         Cell cell2 = new Cell(1); // same cell in another schedule 
         Cell cell3 = new Cell(45);
         Hall h1 = new Hall(943);
         Hall h2 = new Hall(924);
         boolean q = cell.reserve_all("OS","CSE123","ahmed gamal",h1); // return true & information recorded
         boolean z = cell2.reserve_all("AI","CSE321","sherif salama",h1); // return false as cell2 & cell are in same time & same hall & won't reserve
         boolean a = cell3.reserve_all("DB","CSE432","Yehia Abdelhady",h2); // return true & information recorded
 
System.out.println(q+"\n"+cell.get_course_name()+"\n"+cell.get_course_code()+"\n"+cell.get_instructor()+"\n"+cell.get_time_range()+"\n"+cell.get_day());
System.out.println(z+"\n"+cell2.get_course_name()+"\n"+cell2.get_course_code()+"\n"+cell2.get_instructor()+"\n"+cell2.get_time_range()+"\n"+cell2.get_day());
System.out.println(a+"\n"+cell3.get_course_name()+"\n"+cell3.get_course_code()+"\n"+cell3.get_instructor()+"\n"+cell3.get_time_range()+"\n"+cell3.get_day());
       
     ***/ //END OF RESERVATION PROCESS
     /***
    
         // DEPARTMENT WITH LEVEL WITH COURSE INTEGRATION PROCESS TEST : 
    String[] c = new String[2];
    c[0] = "Operatin Systems";
    c[1] = "Economy";
    String[] id = new String[2];
    id[0] ="CSE123";
    id[1] = "HUM111";
    String[] i = new String[2];
    i[0] = "ahmed gamal";
    i[1] = "m3rfsh esmo";
    Departement cess = new Departement("CESS");
    cess.get_level("sophomore").set_courses(c, id, i);
    String[] o1 = new String[2];
    String[] o2 = new String [2];
    String[] o3 = new String[3];
    
        
    o1 = cess.get_level("sophomore").get_courses_name(); 
    for (int x=0;x<2;x++) { 
    System.out.println(o1[x]); 
    // and son on..
        }  
    
    
    ***/
    
    
} 
      
public static void init () { // we will initialize HALLS AND CONSTATNTS HERE
        Hall h1 = new Hall(1);
        Hall h2 = new Hall(2);
        Hall h3 = new Hall(3);
        Hall h4 = new Hall(4);
        Hall h5 = new Hall(5);
        Hall h6 = new Hall(6);
        Hall h7 = new Hall(7);
        Hall h8 = new Hall(8);
        Hall h9 = new Hall(9);
        Hall h10 = new Hall(10);
        Hall h11 = new Hall(11);
        Hall h12 = new Hall(12);
        Hall h13 = new Hall(13);
        Hall h14 = new Hall(14);
        Hall h15 = new Hall(15);
        Hall h16 = new Hall(16);
        Hall h17 = new Hall(17);
        Hall h18 = new Hall(18);
        Hall h19= new Hall(19);
        Hall h20 = new Hall(20);
    
                    }


}
