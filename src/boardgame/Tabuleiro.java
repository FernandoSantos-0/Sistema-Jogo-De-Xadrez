package boardgame;

import chess.Position;
import chesspiece.Piece;

import java.util.List;

public class Tabuleiro {

    private Piece[][] matriz = new Piece[8][8];

    public Tabuleiro(){}

    public Tabuleiro(Piece[][] matriz) {
        this.matriz = matriz;
    }

    public Piece[][] getMatriz() {
        return matriz;
    }
    public void setMatriz(Piece[][] matriz) {
        this.matriz = matriz;
    }

    public void incluirPeca(Piece piece){
        matriz[piece.getPocisao().getLinha()][piece.getPocisao().getColuna()] = piece;
    }

    public void incluirTodaspeca(List<Piece> pecas){

        for (Piece piece:pecas){

            matriz[piece.getPocisao().getLinha()][piece.getPocisao().getColuna()] = piece;

        }

    }

    @Override
    public String toString(){

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < matriz.length; i++) {

            result.append(8 - (i)).append("  ");

            for (int j = 0; j < matriz[i].length; j++) {

                result.append(matriz[i][j] == null ? "-" : matriz[i][j]).append("  ");

            }

            result.append("\n");
        }
        result.append("  a1 b1 c1 d1 e1 f1 g1 h1");

        return result.toString();
        }

    }
