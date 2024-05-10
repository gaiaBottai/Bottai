package compito_bottai;

public class Spogliatoio {
    int spogliatoio=0;
    

    public synchronized int entra(){

  int attesa=1000+(int)(Math.random())*2000;
  
String nome=Thread.currentThread().getName();
System.out.println(nome+" sta aspettando ad entrare negli spogliatoi");


      try{
        while(spogliatoio>=2){
            wait();
            System.out.println("spogliatoio pieno");
        }

         if(spogliatoio<2){
            spogliatoio++;
            System.out.println(nome+" sta indossando la tuta negli spogliatoi");
         }




      }catch(InterruptedException i){
        i.printStackTrace();
      }

      return attesa;
    }

    public synchronized void esci(){
        String nome=Thread.currentThread().getName();
        spogliatoio--;
        notify();
        System.out.println(nome+" esce dagli spogliatoi");

    }
    
}
