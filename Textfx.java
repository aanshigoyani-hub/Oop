import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import java.util.Random;

public class TextFX extends Application {

    @Override
    public void start(Stage stage) {

        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);

        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);

            text.setFont(Font.font("Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC, 22));

            // Random color
            text.setFill(Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble()));

            // Random opacity (0.3 to 1.0)
            text.setOpacity(0.3 + (0.7 * rand.nextDouble()));

            root.getChildren().add(text);
        }

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("Random Text Styling");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
/*output 
  Text 1
Text 2
Text 3
Text 4
Text 5*/
