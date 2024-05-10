package compito_bottai;

public class Pista {
    int kart=0;
    int giri=0;




    public synchronized void entra2(){

String nome=Thread.currentThread().getName();
//int stop=1000+(int)(Math.random())*3000;


try{
        while( (kart>=4)) {
        wait();

         }

        if(kart<4){
            System.out.println(nome+" e' entrato in pista");
            kart++;
            
            
      for(int i=0;i<5;i++){
        int t=1000+(int)(Math.random()*2000);
        System.out.println(nome +" e' stato in pista per "+ t/1000+" secondi");
        Thread.sleep(t);
      }
        }

         

}
catch(InterruptedException e){
    e.printStackTrace();
}
//return stop;


    }

    public synchronized void esci2(){
        String nome=Thread.currentThread().getName();
        System.out.println(nome+" e' uscito dalla pista");
        kart--;
        giri--;
      notify();
        
    }


}