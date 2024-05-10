package RedeSocial3;


public class Facebook extends servicoMenssagem {
    
    public void enviarMenssagem() {
        validarInternet();
        System.out.println("Menssagem enviada pelo Facebook!");
    }
    public void receberMenssagem() {
        System.out.println("Chegou nova menssagem no seu Facebook.\n");
    }
    
}
