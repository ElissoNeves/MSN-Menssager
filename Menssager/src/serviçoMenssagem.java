public class serviçoMenssagem {
    
    public void enviarMenssagem(){
        
        validarConectadoInternet();
        System.out.println("\nMenssagem enviada!");
        salvarMenssagem();
    }

    public void receberMenssagem(){
        System.out.println("\nVocê tem uma nova menssagem.\n");
    }

    private void validarConectadoInternet(){
        System.out.println("Validando se está conectado a internet: \nConectado a rede Wifi 5G.");
    }

    private void salvarMenssagem(){
        System.out.println("Menssagem salva no seu histórico.");
    }
    
}
