package chess;

import chesspiece.Piece;
import chesspiece.types.*;

import java.util.ArrayList;
import java.util.List;

public class IniciarPecasTabuleiro {

    private Color corTeam;
    private List<Piece> pecas = new ArrayList<>();

    public IniciarPecasTabuleiro(Color corTeam) {
        this.corTeam = corTeam;
    }

    public void adicionarPecas(Piece piece){
        pecas.add(piece);
    }

    public void removerPecas(Piece piece){
        pecas.remove(piece);
    }

    public List<Piece> getPecas(){
        return pecas;
    }

    public Color getCorTeam() {
        return corTeam;
    }

    public void inicializarPecas(){

        pecas.clear();

        for (int col = 0; col < 8; col++) {
            pecas.add(new Peao(corTeam, new Position(1,col)));
        }

        pecas.add(new Torre(corTeam, new Position(0,0)));
        pecas.add(new Torre(corTeam,new Position(0,7)));

        pecas.add(new Cavalo(corTeam, new Position(0,1)));
        pecas.add(new Cavalo(corTeam, new Position(0,6)));

        pecas.add(new Bispo(corTeam, new Position(0,2)));
        pecas.add(new Bispo(corTeam, new Position(0,5)));

        pecas.add(new Dama(corTeam, new Position(0,3)));

        pecas.add(new Rei(corTeam,new Position(0,4)));
    }

}
