package chesspiece.types;

import chess.Color;
import chess.Position;
import chesspiece.Piece;

public class Cavalo extends Piece {

    @Override
    public String toString(){
        return "C";
    }

    public Cavalo(Color color, Position posicao) {
        super(color, posicao);
    }

}
