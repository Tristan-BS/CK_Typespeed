package CK;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Typespeed {

    private final Logger LOG = LogManager.getLogger(Main.class);
    static Scanner GetInput = new Scanner(System.in);
    TextList TextList;
    protected String Text;
    private int Mistakes;
    private int WPM;

    public void StartTypeSpeedTest(int Seconds, int Difficulty) {
        // TODO: Create Typespeed Test
        LOG.info("TypeSpeedTest started...");

        GetTextFromTL(Difficulty);

        System.out.println("Your Test begins: \n" + Text);


    }

    private void GetTextFromTL(int Difficulty) {
        switch(Difficulty) {
            case 1: {
                LOG.info("Getting Easy Text...");
                TextList = CK.TextList.EASY;
                break;
            }
            case 2: {
                LOG.info("Getting Normal Text...");
                TextList = CK.TextList.NORMAL;
                break;
            }
            case 3: {
                LOG.info("Getting Hard Text...");
                TextList = CK.TextList.HARD;
                break;
            }
            case 4: {
                LOG.info("Getting Impossible Text...");
                TextList = CK.TextList.IMPOSSIBLE;
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown Difficulty: " + Difficulty);
            }
        }
        Text = TextList.getText();
        LOG.info("Extracted Text: ");
        LOG.info(TextList.getText());
    }


    // GETTER
    public int GetMistakes() {
        return Mistakes;
    }

    public int GetWPM() {
        return WPM;
    }

    // SETTER

    protected void SetMistakes(int Value) {
        Mistakes = Value;
    }

    protected void SetWPM(int Value) {
        WPM = Value;
    }
}
