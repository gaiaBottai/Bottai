package compito_bottai;

public class Piloti extends Thread{
    private String nome;
    private Spogliatoio spo;
    private Pista pist;

    public Piloti(String nome,Spogliatoio spo,Pista pist){
        super(nome);
        this.spo=spo;
        this.pist=pist;
    }

    public void run(){

      
        
     String name=Thread.currentThread().getName();
     try{

        int attesa=spo.entra();
        Thread.sleep(attesa);

        spo.esci();
      

      pist.entra2();
      pist.esci2();

     }catch(InterruptedException e){
        e.printStackTrace();

     }
    

       
        
    }
}
