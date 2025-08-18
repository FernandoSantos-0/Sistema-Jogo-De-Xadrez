package boardgame;

public class Board {

    private int colunaTabuleiro;
    private int linhaTabuleiro;
    private Piece[][] pieces;

    public Board(int colunaTabuleiro, int linhaTabuleiro) {
        this.colunaTabuleiro = colunaTabuleiro;
        this.linhaTabuleiro = linhaTabuleiro;
        pieces = new Piece[linhaTabuleiro][colunaTabuleiro];
    }

    public int getColunaTabuleiro() {
        return colunaTabuleiro;
    }

    public void setColunaTabuleiro(int colunaTabuleiro) {
        this.colunaTabuleiro = colunaTabuleiro;
    }

    public int getLinhaTabuleiro() {
        return linhaTabuleiro;
    }

    public void setLinhaTabuleiro(int linhaTabuleiro) {
        this.linhaTabuleiro = linhaTabuleiro;
    }

    public Piece piece(int coluna,int linha){
        return pieces[linha][coluna];
    }

    public Piece piece(Position position){
        return pieces[position.getLinha()][position.getColuna()];
    }

}
