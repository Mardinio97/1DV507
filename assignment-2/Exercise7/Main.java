package km222pw_assign2.Exercise7;

import javafx.application.Application;

import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.stage.Stage;

import javax.swing.*;
import java.text.DecimalFormat;


public class Main extends Application {
    Stage window;
    GameGenerator gameGenerator = new GameGenerator();
    DecimalFormat format = new DecimalFormat("#.###");

    /*
    NOTE:please add the VM in order to make the programe work
    */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;

        Group group = new Group(gameGenerator.GameGenerator());
        stage.setScene(new Scene(group));
        stage.show();
        stage.setTitle("Compound Interest");

        gameGenerator.button.setOnAction(event -> {
            try {
                double start = Double.parseDouble(gameGenerator.start_Amount.getText());
                double interest = Double.parseDouble(gameGenerator.interest.getText());
                double years = Double.parseDouble(gameGenerator.number_of_years.getText());
                double total = calculate(start, interest, years);
                gameGenerator.label_answer.setText("In total that will be: " + format.format(total));
            } catch (NumberFormatException e) {
                gameGenerator.label_answer.setText("Oops, something went wrong. Please insert only numbers!!");
                JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.INFORMATION_MESSAGE
                );

            }
        });
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });


    }

    public double calculate(double amount, double interest, double years) {
        double result = amount * Math.pow((1 + interest / 100), years);
        return result;
    }

    public void closeProgram() {
        ConfirmBoxGenerator confirmBoxGenerator = new ConfirmBoxGenerator();
        Boolean answer = confirmBoxGenerator.display("Closing program", "Are you sure you want to terminate the program ?");
        if (answer) {
            window.close();

        }


    }
}
