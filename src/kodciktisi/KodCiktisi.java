package kodciktisi;

public class KodCiktisi {
     
       public static class Animal {  
           
     public void show() {

        System.out.print(speak());
     }
        
    public String speak() { return "Em"; } 
        
  }
       
public static class Dog extends Animal {
 
  public String speak() { return "Woof"; }
  
}

public static class Cat extends Animal {
  
    public void show() {
        System.out.print("Meow");
    }
}

public static void main(String[] args) {
   
Cat patches = new Cat();
Dog velvet = new Dog();
patches.show();
velvet.show();
        
}
    }
