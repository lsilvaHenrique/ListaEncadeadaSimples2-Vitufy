package view;

import controller.PlayerController;
import sp.fateczl.lucas.listaString.Lista;

public class Principal {
    public static void main(String[] args) {
        Lista playlist = new Lista();
        PlayerController player = new PlayerController();
        
        player.adicionaMusica(playlist, "Hey Joe;Jimmy Hendrix;347");
        player.adicionaMusica(playlist, "The Times They Are A-Changin';Bob Dylan;314");
        player.adicionaMusica(playlist, "Boulevard Of Broken Dreams;Green Day;447");

        
        player.executaPlaylist(playlist);
        
        player.removeMusica(playlist, 2);
        
        player.executaPlaylist(playlist);
    }
}

