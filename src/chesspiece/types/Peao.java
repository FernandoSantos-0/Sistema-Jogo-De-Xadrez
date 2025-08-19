package chesspiece.types;

import chess.Color;
import chess.Position;
import chesspiece.Piece;

public class Peao extends Piece {

    @Override
    public String toString(){
        return "P";
    }

    public Peao(Color color, Position posicao) {
        super(color, posicao);
    }

}
