class Ravenclaw implements Hogwarts{
    private String name;
    private String  nameWand;
    
    Ravenclaw(String name){
        this.name =  name;
   }

    
    public void basicSkill(){
            System.out.println("");
    };

/*     public  void printHouse(){
        System.out.println("Student Name :"+name +"\nHouse : Ravenclaw");
    };
*/
    public String getName(){
        return name;
    } 

    public String getHouse(){
        return "Ravenclaw";
    } 
}