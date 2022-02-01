package km222pw_assign2.Exercise7;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class GameGenerator {
    public Button button;
    public GridPane gridPane;
    public TextField start_Amount;
    public TextField interest;
    public TextField number_of_years;
    public Label label;
    public Label label_answer;
    public Label label_start_amount;
    public Label label_interest;
    public Label label_number_of_years;
    public Pane root = new Pane();
    public Pane GameGenerator() {
        gridPane = new GridPane();
        gridPane.setLayoutX(0);
        gridPane.setLayoutY(36);
        gridPane.prefWidth(308);
        gridPane.prefHeight(169);
        gridPane.setPadding(new Insets(15, 10, 15, 10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        button = new Button("Calculate");
        button.setLayoutX(14);
        button.setLayoutY(181);

        start_Amount = new TextField();
        interest = new TextField();
        number_of_years = new TextField();


        label_answer = new Label();   //*****//
        label_answer.setLayoutX(14);
        label_answer.setLayoutY(219);
        label_answer.prefHeight(17);
        label_answer.prefWidth(233);

        label_start_amount = new Label();
        label_start_amount.setText("Start amount:");
        label_start_amount.prefHeight(17);
        label_start_amount.prefWidth(233);

        label_interest = new Label();
        label_interest.setText("Interest:");
        label_interest.prefHeight(17);
        label_interest.prefWidth(233);

        label_number_of_years= new Label();
        label_number_of_years.setText("Number of years:");
        label_number_of_years.prefHeight(17);
        label_number_of_years.prefWidth(233);


        start_Amount = new TextField();
        interest = new TextField();
        number_of_years = new TextField();


        label = new Label("Compound Interest");
        label.setLayoutX(14);
        label.setLayoutY(8);
        label.prefWidth(271);
        label.prefHeight(18);


        gridPane.add(label_start_amount, 0, 0);
        gridPane.add(label_interest, 0, 1);
        gridPane.add(label_number_of_years, 0, 2);

        gridPane.add(start_Amount, 1, 0);
        gridPane.add(interest, 1, 1);
        gridPane.add(number_of_years, 1, 2);




        label.setFont(new Font("Arial", 19));
        root.setPrefSize(350, 250);
        root.getChildren().addAll(button, gridPane, label,label_answer
        );

        return root;
    }
}
