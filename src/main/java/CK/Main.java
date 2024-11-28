package CK;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOG = LogManager.getLogger(Main.class);

    static Scanner GetInput = new Scanner(System.in);

    Typespeed TS = new Typespeed();
    static Main Main = new Main();

    private static int Choice;

    public static void main(String[] args) {
        LOG.info("Typespeed Program started!");

        while (true) {
            System.out.println("\n\n" +
                    "MENU \n" +
                    "1) Typespeed \n" +
                    "2) Statistics \n" +
                    "3) Settings \n" +
                    "4) Quit");

            Choice = GetInput.nextInt();

            switch (Choice) {
                case 1: {
                    Main.Starting_Typespeed();
                    break;
                }
                case 2: {
                    Main.Starting_Statistics();
                    break;
                }
                case 3: {
                    Main.Starting_Settings();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
            }
        }
    }

    public void Starting_Typespeed() {
        LOG.info("Starting Typespeed triggered");
        int Seconds;
        int Difficulty;


        System.out.println("Choose your Typespeed Program: \n" +
                "1) 30 Seconds \n" +
                "2) 60 Seconds \n" +
                "3) 90 Seconds \n" +
                "4) 120 Seconds \n");
        Seconds = GetInput.nextInt();

        
        System.out.println("Choose your Difficulty: \n" +
                "1) Easy \n" +
                "2) Normal \n" +
                "3) Hard \n" +
                "4) Impossible");
        Difficulty = GetInput.nextInt();

        TS.StartTypeSpeedTest(Seconds, Difficulty);
    }

    public void Starting_Statistics() {
        // TODO: Show Statistics / Leaderboard

        LOG.info("TODO: Show Statistics / Leaderboard");
    }

    public void Starting_Settings() {
        // TODO: Show Settings - Edit Settings
        // TODO: Add to Settings: Username, ignore Upper and lower case letters, Language

        LOG.info("TODO: Show Settings - Edit Settings");
        LOG.info("TODO: Add to Settings: Username, ignore Upper and lower case letters, Language");
    }
}