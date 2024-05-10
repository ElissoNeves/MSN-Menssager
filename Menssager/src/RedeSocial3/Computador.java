package RedeSocial3;

import java.util.Scanner;

public class Computador {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Que app você quer utilizar?");
            servicoMenssagem sm = null;

            String appEscolhido = scanner.nextLine();

            while (true) {
            
            if (appEscolhido.equals("Msn"))
                sm = new Msn();
            else if (appEscolhido.equals("Facebook"))
                sm = new Facebook();
            else if (appEscolhido.equals("Telegram"))
                sm = new Telegram();
            
            sm.enviarMenssagem();
            sm.receberMenssagem();
            
            scanner.close();
            break;

            }
        }catch (NullPointerException e) {
            System.out.println("A primeira letra tem que ser maíuscula, escolha novamente.");
        }
    }
}
