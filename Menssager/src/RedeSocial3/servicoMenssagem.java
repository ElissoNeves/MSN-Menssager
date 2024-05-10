package RedeSocial3;


public abstract class servicoMenssagem {
    
    public abstract void enviarMenssagem();
    public abstract void receberMenssagem();
    
    protected void validarInternet(){
        System.out.println("Conexão bem sucedida ao Wifi 5G.");
    }
    
}
