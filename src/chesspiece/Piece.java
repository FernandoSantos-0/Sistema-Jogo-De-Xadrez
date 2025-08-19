package chesspiece;

import chess.Color;
import chess.Position;

public class Piece {

    private Color color;
    private Position pocisao;

    public Piece (){}

    public Piece(Color color, Position pocisao) {
        this.color = color;
        this.pocisao = pocisao;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Position getPocisao() {
        return pocisao;
    }

    public void setPocisao(Position pocisao) {
        this.pocisao = pocisao;
    }

    @Override
    public String toString(){
        return "-";
    }

}
