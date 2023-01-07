package superdeneme;

public class Uzay {

   public String x;
   public String y;
   public int sonsuz;
   public int harf;
   
public Uzay(String x, String y){
    
 this.x=x;
 this.y=y; 
 this.harf=4;
 
 System.out.println("harf " + harf +" x'in degeri " +x + " y'nin degeri " +y);
}  

public void Karadelik(){
    
System.out.println("Uzayda " +x+ " var" );
}


public void Gezegen(){
 
 System.out.println("Uzayda " +y+ " var");
 
}

}