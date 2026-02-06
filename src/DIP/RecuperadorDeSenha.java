package DIP;

public class RecuperadorDeSenha {

    private Comunicador comunicador;

    public RecuperadorDeSenha(Comunicador comunicador) {
        this.comunicador = comunicador;
    }

    public void recuperar(String usuario) {
        String link = "http://techstore.com/reset?token=123";

        comunicador.enviar("Olá " + usuario + ". Clique no link para resetar sua senha: " + link);
    }
}
