public class Client {
    public static void main(String[] args) {
        Dengen dengen;

        dengen = new AcAdapter();
        int denatsu = dengen.kyuuden();
        System.out.println(denatsu + "Vで給電されています");
    }
}

abstract class  Dengen{
    public abstract int kyuuden();
}

class JapaneseConsent{
    public int power(){
        return 100;
    }
}

class AcAdapter extends Dengen{
    private JapaneseConsent consent = new JapaneseConsent();

    public int kyuuden(){
        return (int)(consent.power()*0.16);
    }
}