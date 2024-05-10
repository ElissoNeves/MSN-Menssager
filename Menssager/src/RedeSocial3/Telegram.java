package RedeSocial3;


public class Telegram extends servicoMenssagem {
    
    public void enviarMenssagem() {
        validarInternet();
        System.out.println("Menssagem enviada pelo Telegram!");
    }
    public void receberMenssagem() {
        System.out.println("Você tem uma nova menssagem em seu Telegram.");
    }
    
}
