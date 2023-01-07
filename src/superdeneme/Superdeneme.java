package superdeneme;

public class Superdeneme {
    
    public static void main(String[] args) {
        
       Uzay u = new Uzay("Siyah" , "Saturn");
       Dunya d = new Dunya("Atmosfer" , "Stratosfer");
       Kita k  = new Kita("Afrika" , "Avrupa");
       Country c = new Country("Turkiye" ,"Japon");
        
       
       u.Karadelik();
       u.Gezegen();
       d.Karadelik();
       d.Gezegen();
       d.dunya();
       k.Karadelik();
       k.Gezegen();
       k.kita();
       c.Karadelik();
       c.Gezegen();
       c.country();
       
    }
    
}
