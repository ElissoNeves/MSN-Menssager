package RedeSocial3;

public class Msn extends servicoMenssagem{
    
    public void enviarMenssagem() {
        validarInternet();
        System.out.println("Menssagem enviada pelo Msn!");
    }
    public void receberMenssagem() {
        System.out.println("Nova menssagem no Msn.\n");
    }
}
