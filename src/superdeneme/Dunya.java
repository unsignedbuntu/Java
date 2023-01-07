
package superdeneme;

public class Dunya extends Uzay {
    
    public int harf=5;
    
    public Dunya(String x, String y) {
        super(x, y);
    }

    @Override
    public void Karadelik(){
       
        System.out.println("Dunyada " +super.x+ " yok");
        
    }
    
    @Override
    public void Gezegen(){
        
       System.out.println("Dunyada " +super.y   + " yok"); 
    }
    
    
    public void dunya(){
        
       System.out.println("harf "+harf +" Dunyanin AMK"); 
    }
}
    
