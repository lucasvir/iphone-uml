package main;

import model.Iphone;

public class Start {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.start();

        // Musica
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        iphone.tocar();

        // Telefone
        System.out.println();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Browser
        System.out.println();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println();
        iphone.close();
    }
}
