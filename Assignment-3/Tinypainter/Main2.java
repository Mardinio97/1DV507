package km222pw_assign3.Tinypainter;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
   /*
    NOTE:please add the VM in order to make the programe run
    */
public class Main2 extends Application {
    public Pane root = new Pane();
    public Group group;
    public Canvas canvas;
    public HBox hBox;
    public ComboBox<String> comboBox_choice;
    public ComboBox<Integer> size_ComboBox;
    public ColorPicker colorPicker;
    public Line line;
    public Rectangle rectangle;
    public   Rectangle rectangle1;
    public Circle circle;
    public double x;
    public double y;
    @Override
    public void start(Stage stage) throws Exception {
        group = new Group(guiGenerator());

        stage.setScene(new Scene(group));
        stage.setTitle("Norse Gods");
        stage.show();
        canvas.setOnMousePressed(e -> {
            x = e.getX();
            y = e.getY();
            mouse_Pressed(e);

        });
        canvas.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                mouse_Released(event);
            }
        });
    }
    public  void mouse_Pressed(MouseEvent event){
        double x = event.getX();
        double   y = event.getY();
        switch (comboBox_choice.getValue()){
            case "Line":
                line = new Line();
                line.setStrokeWidth(size_ComboBox.getValue());
                line.setStroke(colorPicker.getValue());
                line.relocate(x, y);
                root.getChildren().addAll(line);
                break;
            case "Dot":
                rectangle1 = new Rectangle(x, y, size_ComboBox.getValue(), size_ComboBox.getValue());
                rectangle1.setFill(colorPicker.getValue());
                group.getChildren().add(rectangle1);
                break;
            case "Rectangle":
                rectangle = new Rectangle();
                rectangle.relocate(x, y);
                rectangle.setFill(colorPicker.getValue());
                root.getChildren().addAll(rectangle);
                break;
            case "Circle":
                circle = new Circle();
                circle.relocate(x, y);
                circle.setFill(colorPicker.getValue());
                root.getChildren().addAll(circle);
                break;
        }


    }

    public  void mouse_Released (MouseEvent event){

        switch (comboBox_choice.getValue()){
            case "Line":
                line.setEndX(event.getX() - x);
                line.setEndY(event.getY() - y);
                break;
            case "Dot":
                rectangle1 = new Rectangle(x, y, size_ComboBox.getValue(), size_ComboBox.getValue());
                rectangle1.setFill(colorPicker.getValue());
                group.getChildren().add(rectangle1);
                break;
            case "Rectangle":
                rectangle.setHeight(event.getY() - y);
                rectangle.setWidth(event.getX() - x);
                break;
            case "Circle":
                circle.setRadius(event.getX() - x);
                break;
        }


    }
    public Pane guiGenerator() {

        canvas = new Canvas(700, 600);


        hBox = new HBox();

        hBox.prefHeight(40);
        hBox.prefWidth(514);

        comboBox_choice = new ComboBox<>();
        comboBox_choice.prefWidth(150);
        comboBox_choice.setPadding(new Insets(2, 2, 2, 2));
        comboBox_choice.prefWidth(150);
        comboBox_choice.getItems().addAll(
                "Line",
                "Dot",
                "Rectangle",
                "Circle");
        comboBox_choice.setPromptText("Line");

        size_ComboBox = new ComboBox<>();
        size_ComboBox.prefWidth(150);
        size_ComboBox.setPadding(new Insets(2, 2, 2, 2));
        size_ComboBox.getItems().addAll(1,5,10,15,20,25,30,35,40);
        size_ComboBox.setPromptText("1");

        size_ComboBox.getItems().addAll();

        colorPicker = new ColorPicker();
        colorPicker.setPadding(new Insets(2, 2, 2, 2));

        hBox.getChildren().addAll(comboBox_choice, size_ComboBox, colorPicker);
        hBox.setSpacing(10);

        root.getChildren().addAll(canvas, hBox);
        root.setPrefSize(800, 600);
        return root;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
