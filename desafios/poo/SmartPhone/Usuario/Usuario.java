package poo.SmartPhone.Usuario;


import poo.SmartPhone.AparelhoTelefonico.AparelhoTelefonico;
import poo.SmartPhone.Iphone;
import poo.SmartPhone.NavegadorInternet.NavegadorInternet;
import poo.SmartPhone.ReprodutorMusical.ReprodutorMusical;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        NavegadorInternet chrome = iphone;
        ReprodutorMusical spotify = iphone;
        AparelhoTelefonico telefone = iphone;
        
        spotify.tocar();
        spotify.pausar();
        spotify.selecionarMusica();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        chrome.exibirPagina();
        chrome.adicionarNovaAba();
        chrome.atualizarPagina();
    }
}
