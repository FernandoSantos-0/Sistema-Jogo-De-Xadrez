package chesspiece.types;

import chess.Color;
import chess.Position;
import chesspiece.Piece;

public class Torre extends Piece {

    @Override
    public String toString(){
        return "T";
    }

    public Torre(Color color, Position posicao) {
        super(color, posicao);
    }

}
