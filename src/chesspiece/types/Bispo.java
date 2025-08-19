package chesspiece.types;

import chess.Color;
import chess.Position;
import chesspiece.Piece;

public class Bispo extends Piece {

    @Override
    public String toString(){
        return "B";
    }

    public Bispo(Color color, Position posicao) {
        super(color, posicao);
    }

}
