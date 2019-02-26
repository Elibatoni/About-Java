
package coche;


public class Coche {
    int gasolina = 100;
    int getGasolinaRestante (){
    return gasolina;
    }
   boolean avanzar (int distancia) {
       if(distancia /10 < gasolina){
       gasolina = gasolina -= distancia/10;
       return true;
       }else{
       return false;
        }
    }
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        int gas = coche1.getGasolinaRestante();
        System.out.println(coche1.getGasolinaRestante());
        coche1.avanzar(50);
        System.out.println(coche1.getGasolinaRestante());
        boolean resultado = coche1.avanzar(1200);
        if(resultado == false){
            System.out.println("no hay suficiente gasolina");
        }
        
        System.out.println(coche1.getGasolinaRestante());
        

   
    }
    
}
