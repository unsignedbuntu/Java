package superdeneme;

public class Country extends Uzay {
    
   public int harf=7;
    
    public Country(String x, String y) {
        super(x, y);
    }
    
     @Override
    public void Gezegen(){
        
       System.out.println("Ulkede " +super.y+ " yok"); 
    }
    
    @Override
    public void Karadelik(){
       
        System.out.println("Ulkede " +super.x+ " yok");
                
    }
    
    public void country(){
        
       System.out.println("harf "+harf +" Ulkenin AMK"); 
    }
    
}
