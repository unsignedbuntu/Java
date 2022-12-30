package classdeneme;

class Araba {

    String marka;
    String lastik;
  
   Araba(String marka,String lastik){
    this.marka=marka;
    this.lastik=lastik;
    }
    
     String turnAraba(){
        
      return marka;  
    }
    
     String turnLastik(){
        
      return lastik;  
    }
    
    class Motor{

    int beygir;
      
      
       Motor(int beygir){
  
         this.beygir=beygir;
      }
      
      int turnMotor(){
          
        return beygir;  
      }
      
       class Viteskutusu{
          
          int vites;
          
           Viteskutusu(int vites){
              
              this.vites=vites;
          }
          
       int turnViteskutusu(){
           
          return vites;
       }
          
      }   
    } 
}