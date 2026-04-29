import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class BarChartFX extends Application {

    @Override
    public void start(Stage stage) {

        String[] labels = {"Projects", "Quizzes", "Midterm", "Final"};
        int[] values = {20, 10, 30, 40};
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

        HBox root = new HBox(20);
        root.setAlignment(Pos.BOTTOM_CENTER);

        for (int i = 0; i < labels.length; i++) {

            Rectangle bar = new Rectangle(60, values[i] * 5);
            bar.setFill(colors[i]);

            Text text = new Text(labels[i] + " - " + values[i] + "%");

            VBox box = new VBox(10);
            box.setAlignment(Pos.BOTTOM_CENTER);

            box.getChildren().addAll(bar, text);
            root.getChildren().add(box);
        }

        Scene scene = new Scene(root, 500, 400);

        stage.setTitle("Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
/* output 
   ████
   ████        ██████
   ████        ██████       ████████
   ████  ██    ██████       ████████
   ████  ██    ██████       ████████
   ----  ----  ------       --------
  Proj   Quiz   Midterm      Final
  20%    10%     30%          40% */
