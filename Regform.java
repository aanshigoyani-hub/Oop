import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class RegistrationFormFX extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        Button submit = new Button("Submit");

        grid.add(new Label("Roll No:"), 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(new Label("Name:"), 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(new Label("Age:"), 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(new Label("Email:"), 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submit, 1, 4);

        submit.setOnAction(e -> {
            try {
                int roll = Integer.parseInt(rollField.getText());
                int age = Integer.parseInt(ageField.getText());
                String email = emailField.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email");
                }

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setHeaderText("Registration Successful");
                alert.setContentText(
                        "Roll: " + roll +
                        "\nName: " + nameField.getText() +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                alert.show();

            } catch (NumberFormatException ex) {
                showError("Roll No and Age must be integers");
            } catch (Exception ex) {
                showError(ex.getMessage());
            }
        });

        Scene scene = new Scene(grid, 350, 300);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    private void showError(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Validation Failed");
        alert.setContentText(msg);
        alert.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
/* output 
  Registration Successful
Roll: 101
Name: Aanshi
Age: 20
Email: abc@gmail.com*/
