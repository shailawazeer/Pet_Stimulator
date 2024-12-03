import javafx.application.Application;
import javafx.stage.Stage;
import org.w3c.dom.ls.LSOutput;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pet pet = new Pet("Buddy");
        GameLogic gameLogic = new GameLogic(pet);
        ScoreTracker scoreTracker = new ScoreTracker();

        // Example interactions
        pet.feed();
        scoreTracker.incrementScore(10);

        pet.play();
        scoreTracker.incrementScore(15);

        SaveLoadManager.saveGame(pet);

        Pet loadedPet = SaveLoadManager.loadGame();
        if (loadedPet != null) {
            AchievementManager.checkAchievements(loadedPet);

            System.out.println("Hello");

            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}


