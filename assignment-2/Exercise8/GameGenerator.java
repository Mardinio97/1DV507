package km222pw_assign2.Exercise8;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

public class GameGenerator {
    public Button button;
    public TextField textField;
    public GridPane gridPane;
    public Separator separator;
    public Label label;
    public Pane root = new Pane();
    public Pane GameGenerator() {
        button = new Button("Roll the dice!");
        button.setLayoutX(69);
        button.setLayoutY(237);

        textField = new TextField();
        textField.setLayoutX(160);
        textField.setLayoutY(237);

        gridPane = new GridPane();
        gridPane.setLayoutX(0);
        gridPane.setLayoutY(36);
        gridPane.prefWidth(308);
        gridPane.prefHeight(169);
        gridPane.setPadding(new Insets(15, 10, 15, 10));
        final int numCols = 5;
        final int numRows = 2;
        ColumnConstraints[] columns = new ColumnConstraints[numCols];
        for (int i = 0; i < numCols; ++i) {
            columns[i] = new ColumnConstraints();
            columns[i].setMinWidth(10);
            columns[i].setPrefWidth(129);
            columns[i].setMaxWidth(208);
            columns[i].setPercentWidth(-1);
            columns[i].setHgrow(Priority.SOMETIMES);
            columns[i].setHalignment(HPos.CENTER);
            columns[i].setFillWidth(true);
            gridPane.getColumnConstraints().add(columns[i]);
        }
        RowConstraints[] rowConstraints = new RowConstraints[numRows];
        for (int i = 0; i < numRows; ++i) {
            rowConstraints[0] = new RowConstraints();
            rowConstraints[0].setMaxHeight(132.59998168945313);
            rowConstraints[0].setPrefHeight(132.59998168945313);
            rowConstraints[0].setMaxHeight(Control.USE_COMPUTED_SIZE);
            rowConstraints[0].setPercentHeight(-1);
            rowConstraints[0].setVgrow(Priority.SOMETIMES);
            rowConstraints[0].setValignment(VPos.CENTER);

            rowConstraints[1] = new RowConstraints();
            rowConstraints[1].setMaxHeight(103.20001831054687);
            rowConstraints[1].setPrefHeight(35.800018310546875);
            rowConstraints[1].setMaxHeight(Control.USE_COMPUTED_SIZE);
            rowConstraints[1].setPercentHeight(-1);
            rowConstraints[1].setValignment(VPos.CENTER);
            gridPane.getRowConstraints().add(rowConstraints[i]);
        }
        separator = new Separator(Orientation.HORIZONTAL);
        separator.setLayoutX(-5);
        separator.setLayoutY(32);
        separator.prefWidth(456);
        separator.prefHeight(2);

        label = new Label("Yahtzee");
        label.setLayoutX(14);
        label.setLayoutY(8);
        label.prefWidth(271);
        label.prefHeight(18);

        label.setFont(new Font("Arial", 19));
        root.getChildren().addAll(button, textField, gridPane, separator, label);
        root.setPrefSize(450, 300);
        return root;
    }


}
