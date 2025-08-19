package chesspiece.types;

import chess.Color;
import chess.Position;
import chesspiece.Piece;

public class Rei extends Piece {

    @Override
    public String toString(){
        return "R";
    }

    public Rei(Color color, Position posicao) {
        super(color, posicao);
    }


}
