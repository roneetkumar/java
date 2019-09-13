package Classes;

public class Human {
   private int age;
   private int height;
   private String name;
   private String eyeColor;
   
   public Human(int age, int height, String name, String eyeColor){
       this.age = age;
       this.height = height;
       this.name = name;
       this.eyeColor= eyeColor;
   }
   
   public void eat(){
       System.out.println("Eating");
   }
   public void sleep(){
       System.out.println("Sleeping");
   }
   public void speak(){
       System.out.println("Speaking");
   }
   
   public void display(){
       System.out.println("Age: " + this.age);
       System.out.println("Height: " + this.height);    
       System.out.println("Name: " + this.name); 
       System.out.println("Eyes Color: " + this.eyeColor); 
       System.out.println("\n");    
   } 
}
