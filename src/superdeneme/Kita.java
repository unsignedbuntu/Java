package superdeneme;

public class Kita extends Uzay {
    
    public int harf=4;
    
    public Kita(String x, String y) {
        super(x, y);
    }
    
     @Override
    public void Gezegen(){
        
       System.out.println("Kitada " +super.y+  " yok"); 
    }
    
    @Override
    public void Karadelik(){
       
        System.out.println("Kitada " +super.x+ " yok");
        
    }
    
    public void kita(){
        
       System.out.println("harf "+harf +" Kitanin AMK"); 
    }
    
}
