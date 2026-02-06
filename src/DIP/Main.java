package DIP;

public class Main {
    public static void main(String[] args) {

        Comunicador servicoEmail = new ServicoEmail();
        RecuperadorDeSenha recuperador1 = new RecuperadorDeSenha(servicoEmail);

        recuperador1.recuperar("vzapella@gmail.com");

        System.out.println("-------------------------------------------------");

        Comunicador servicoSMS = new ServicoSMS();
        RecuperadorDeSenha recuperador2 = new RecuperadorDeSenha(servicoSMS);

        recuperador2.recuperar("4799973-4327");
    }
}
