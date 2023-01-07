package enumdeneme;

public class Enumdeneme {

    public enum Sınavdeneme{
        
      Dolar(10),
      Euro(15),
      Sterlin(20);
      double deger;
       
      private  Sınavdeneme(double deger) {
        this.deger=deger;
     }
      
      public double donusum(double gelendeger){
          return gelendeger/this.deger;
      }
 }
    
    public static void main(String[] args) {
      int tl=200;
      
      for(Sınavdeneme temp:Sınavdeneme.values()){
          System.out.println(tl+"tl "+temp.donusum(tl)+temp);
      }
          
    }    
}