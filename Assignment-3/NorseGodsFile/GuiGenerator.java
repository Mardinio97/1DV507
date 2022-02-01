package km222pw_assign3.NorseGodsFile;


import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextFlow;

public class GuiGenerator {
    public Pane root = new Pane();
    public ScrollPane scrollPane;
    public ListView<String> listView;

    public VBox vBox;
    public Label label;
    public Label label_Name;
    public Label label_race;
    public TextFlow textFlow;


    public Pane guiGenerator() {
        vBox = new VBox();
        vBox.setPrefWidth(426);
        vBox.setPrefHeight(416);
        vBox.setPadding(new Insets(10,10,10,10));

        textFlow = new TextFlow();

        textFlow.setLayoutX(188);
        textFlow.setLayoutY(61);
        textFlow.setPadding(new Insets(10,10,0,0));
        textFlow.setLineSpacing(5.0);

        label = new Label("Norse Gods and other Beings");
        label.setFont(new Font("System", 22));
        label.setLayoutX(21);
        label.setLayoutY(28);

        label_Name = new Label();
        label_Name.setFont(new Font("Goudy Old Style", 18));

        label_Name.setPrefWidth(118);
        label_Name.setPrefHeight(21);



        label_race = new Label();

        label_race.setFont(new Font("System", 12));
        label_race.setPrefWidth(173);
        label_race.setPrefHeight(17);

        vBox.getChildren().addAll(label_Name,label_race,textFlow);
        scrollPane = new ScrollPane();
        scrollPane.setContent(vBox);
        scrollPane.setPrefSize(426, 412);
        scrollPane.setLayoutX(188);
        scrollPane.setLayoutY(61);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);

        scrollPane.setFitToWidth(true);

        listView = new ListView<String>();
        listView.setPrefSize(157, 412);
        listView.setLayoutX(21);
        listView.setLayoutY(61);
        listView.setOrientation(Orientation.VERTICAL);


        root.getChildren().addAll(label, scrollPane,listView);
        root.setPrefSize(600, 500);

        return root;
    }
}
