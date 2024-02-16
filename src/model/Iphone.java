package model;

public class Iphone implements MusicPlayer, Telephone, Browser {

    private boolean ligado = false;

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado() {
        this.ligado = !ligado;
    }

    public void start() {
        System.out.println("Ligando...");
        System.out.println("HOME");
        System.out.println();
        setLigado();
    }

    public void close() {
        System.out.println("Desligando...");
        setLigado();
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecinando música");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando pelo telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibindo página no browser");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba no browser");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando pagina do browser");
    }
}
