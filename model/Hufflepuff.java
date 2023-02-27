package model;
public class Hufflepuff implements Hogwarts{
    private String name;
    private String  nameWand;
    
    public Hufflepuff(String name){
        this.name =  name;
   }

    public void basicSkill(){
            System.out.println("");
    };

    /*public  void printHouse(){
        System.out.println("Student Name :"+name +"\nHouse : Hufflepuff");
    };*/

    public String getName(){
        return name;
    }
    public String getHouse(){
        return "Hufflepuff";
    }  
}