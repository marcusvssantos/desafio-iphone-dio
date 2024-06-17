
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando para a próxima música...");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("Retrocedendo para a música anterior...");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada...");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void enviarSMS() {
        System.out.println("Enviando SMS...");
    }

    @Override
    public void receberSMS() {
        System.out.println("Recebendo SMS...");
    }

    @Override
    public void abrirPagina() {
        System.out.println("Abrindo página...");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página...");
    }

    @Override
    public void navegar() {
        System.out.println("Navegando...");
    }

    @Override
    public void pesquisar() {
        System.out.println("Pesquisando...");
    }

}
