import org.junit.Test;
import static org.junit.Assert.*;

public class ChessGameLogTest {

    @Test
    public void testAddToLog() {
        ChessGameLog log = ChessGameLog.create();
        log.addToLog("Test log entry");
        String lastLog = log.getLastLog();
        assertTrue(lastLog.contains("Test log entry"));
    }

}