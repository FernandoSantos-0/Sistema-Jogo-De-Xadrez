package application;

import boardgame.Tabuleiro;
import chess.Color;
import chess.IniciarPecasTabuleiro;
import chess.Position;
import chesspiece.types.Rei;

public class Program {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro();

        IniciarPecasTabuleiro pecasBrancas = new IniciarPecasTabuleiro(Color.BRANCO);

        pecasBrancas.inicializarPecas();

        tabuleiro.incluirTodaspeca(pecasBrancas.getPecas());

        System.out.println(tabuleiro);

    }
}