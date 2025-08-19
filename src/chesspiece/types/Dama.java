package chesspiece.types;

import chess.Color;
import chess.Position;
import chesspiece.Piece;

public class Dama extends Piece {

    @Override
    public String toString(){
        return "D";
    }

    public Dama(Color color, Position posicao) {
        super(color, posicao);
    }
}
