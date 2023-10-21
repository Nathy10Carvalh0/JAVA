import Entidade.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("25574531");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.tocar("rufi-easily");
        iphone.pausar();
        iphone.selecionarMusica();

        
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}