package classdeneme;

public class Classdeneme {

    public static void main(String[] args) {
            
            Araba a1 = new Araba("Nissan","Bridgestone");
            Araba.Motor m1= a1.new Motor(1500);
            Araba.Motor.Viteskutusu v1= m1.new Viteskutusu(6);                   
   
         System.out.println("Lastik ismi " +a1.turnLastik() + " Araba markasi " +a1.turnAraba() + " Motor gucu " + m1.turnMotor() + " Vites sayisi " + v1.turnViteskutusu() );
            
    }
    
    
}
