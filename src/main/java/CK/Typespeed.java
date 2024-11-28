package CK;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Typespeed {

    private final Logger LOG = LogManager.getLogger(Main.class);
    static Scanner GetInput = new Scanner(System.in);
    TextList TextList;
    private String Text;

    public void StartTypeSpeedTest(int Seconds, int Difficulty) {
        // TODO: Create Typespeed Test
        LOG.info("TypeSpeedTest started...");

        GetTextFromTL(Difficulty);



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
        SetText(TextList.getText());
        LOG.info(TextList.getText());
    }



    // SETTER

    private void SetText(String TextToType) {
        Text = TextToType;
    }


    // GETTER

    private String GetText() {
        return Text;
    }
}
