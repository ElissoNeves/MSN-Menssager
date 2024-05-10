public class Computador {
    public static void main(String[] args) {
        System.out.println("MSN");
        Msn msn = new Msn();

        msn.enviarMenssagem();
        msn.receberMenssagem();

        System.out.println("FACEBOOK");
        Facebook face = new Facebook();

        face.enviarMenssagem();
        face.receberMenssagem();

        System.out.println("TELEGRAM");
        Telegram telegram = new Telegram();

        telegram.enviarMenssagem();
        telegram.receberMenssagem();
    }
}
