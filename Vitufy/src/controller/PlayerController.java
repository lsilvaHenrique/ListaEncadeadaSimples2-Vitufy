package controller;

import sp.fateczl.lucas.listaString.*;
import model.Musica;

public class PlayerController {
    
    public void adicionaMusica(Lista lista, String musica) {
        try {
            String[] dadosMusica = musica.split(";");
            String nome = dadosMusica[0];
            String nomeArtista = dadosMusica[1];
            int duracao = Integer.parseInt(dadosMusica[2]);
            Musica novaMusica = new Musica(nome, nomeArtista, duracao);
            
            if (lista.isEmpty()) {
                lista.addFirst(novaMusica);
            } else {
                lista.addFirst(novaMusica);
            }
            
            System.out.println("Música adicionada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar música: " + e.getMessage());
        }
    }
    
    public void removeMusica(Lista lista, int posicao) {
        try {
            lista.remove(posicao);
            System.out.println("Música removida com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao remover música: " + e.getMessage());
        }
    }
    
    public void executaPlaylist(Lista lista) {
        try {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        } catch (Exception e) {
            System.out.println("Erro ao executar playlist: " + e.getMessage());
        }
    }
}

