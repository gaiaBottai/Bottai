package compito_bottai;

public class Main {
    public static void main(String[] args) {

       Spogliatoio spo =new Spogliatoio();
       Pista pist=new Pista();

        for(int i=0;i<8;i++){

            Piloti p=new Piloti("pilota"+(i+1),spo,pist);
            p.start();
        }
    }
}