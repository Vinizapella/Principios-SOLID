package DIP;

public class ServicoSMS implements Comunicador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS via operadora: " + mensagem);
    }
}
