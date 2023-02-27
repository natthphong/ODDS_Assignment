class Gryffindor implements Hogwarts{
    private String name;
    private String  nameWand;
 
    Gryffindor(String name){
         this.name =  name;
    }
 
     public void basicSkill(){
             System.out.println("");
     };
 
     /*public  void printHouse(){
         System.out.println("Student Name :"+name +"\nHouse : Gryffindor");
     };*/
 
     public String getName(){
         return name;
     } 
     public String getHouse(){
         return "Gryffindor";
     } 
 
 }