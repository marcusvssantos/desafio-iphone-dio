public class App {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Reprodutor Musical
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();
        meuIphone.avancarMusica();
        meuIphone.retrocederMusica();

        // Aparelho Telefônico
        meuIphone.fazerChamada();
        meuIphone.receberChamada();
        meuIphone.enviarSMS();
        meuIphone.receberSMS();

        // Navegador de Internet
        meuIphone.abrirPagina();
        meuIphone.navegar();
        meuIphone.pesquisar();
        meuIphone.fecharPagina();
    }
}
