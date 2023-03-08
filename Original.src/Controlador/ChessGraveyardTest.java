import static org.junit.Assert.*;
import org.junit.Test;

public class ChessGraveyardTest {

    @Test
    public void testGetInstance() {
        ChessGraveyard graveyard1 = ChessGraveyard.getInstance("Graveyard 1");
        ChessGraveyard graveyard2 = ChessGraveyard.getInstance("Graveyard 2");
        assertSame(graveyard1, graveyard2);
    }
    @Test
    public void testAddPiece() {
        ChessGraveyard graveyard = ChessGraveyard.getInstance("Graveyard");
        ChessGameBoard board = new ChessGameBoard();
        ChessGamePiece piece1 = new Pawn(board, 0, 0, ChessGamePiece.WHITE);
        ChessGamePiece piece2 = new Rook(board, 1, 1, ChessGamePiece.BLACK);

        graveyard.addPiece(piece1);
        graveyard.addPiece(piece2);

        assertEquals(graveyard.getComponentCount(), 3); // 1 JLabel y 2 piezas
    }
}