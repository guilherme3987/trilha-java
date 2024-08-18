public class Main {
    public static void main(String[] args) {
        // Criação de uma instância da classe iPhone
        Iphone meuIphone = new Iphone();
        
        // Testando os métodos do ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Despacito");
        
        // Testando os métodos do AparelhoTelefonico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        // Testando os métodos do NavegadorInternet
        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}