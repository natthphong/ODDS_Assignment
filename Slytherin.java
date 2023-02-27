
class Slytherin implements Hogwarts{

    private String name;
    private String  nameWand;
    
    Slytherin(String name){
        this.name =  name;
   }

    public void basicSkill(){
            System.out.println("");
    };
/* 
    public  void printHouse(){
        System.out.println("Student Name :"+name +"\nHouse : Slytherin");
    };
*/
    public String getName(){
        return name;
    } 

    public String getHouse(){
        return "Slytherin";
    } 
}