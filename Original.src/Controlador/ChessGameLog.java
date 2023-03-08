import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.util.Date;
import javax.swing.ScrollPaneConstants;

public class ChessGameLog extends JScrollPane {
    private JTextArea textArea;

    private ChessGameLog(JTextArea textArea) {
        super(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.textArea = textArea;
    }

    //Creación del método que fabricará las instancias
    public static ChessGameLog create() {
        JTextArea textArea = new JTextArea("", 5, 30);
        return new ChessGameLog(textArea);
    }

    public void addToLog(String s) {
        if (textArea.getText().length() > 0) {
            textArea.setText(textArea.getText() + "\n" + new Date() + " - " + s);
        } else {
            textArea.setText(new Date() + " - " + s);
        }
    }

    public void clearLog() {
        textArea.setText("");
    }

    public String getLastLog() {
        int indexOfLastNewLine = textArea.getText().lastIndexOf("\n");
        if (indexOfLastNewLine < 0) {
            return textArea.getText();
        }
        return textArea.getText().substring(indexOfLastNewLine + 1);
    }
}
