public class SmartTv {
    
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

     public void aumentarVolume(){
        System.out.println("Aumentando o volume para " + volume);
        volume++;
     }
    
     public void diminuirVolume(){
        System.out.println("Diminuindo o volume para " + volume);
        volume--;
     }

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarCanal(){
        System.out.println("Mudando para o canal " + canal);
        canal++;
    }
    
    public void diminuirCanal(){
        System.out.println("Mudando para o canal " + canal);
        canal--;
    }

}