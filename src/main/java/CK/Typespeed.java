package CK;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Typespeed {

    private static final Logger LOG = LogManager.getLogger(Main.class);
    static Scanner GetInput = new Scanner(System.in);
    TextList TextList;

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
            }
            case 2: {
                LOG.info("Getting Normal Text...");
                TextList = CK.TextList.NORMAL;
            }
            case 3: {
                LOG.info("Getting Hard Text...");
                TextList = CK.TextList.HARD;
            }
            case 4: {
                LOG.info("Getting Impossible Text...");
                TextList = CK.TextList.IMPOSSIBLE;
            }

        }
    }
}
