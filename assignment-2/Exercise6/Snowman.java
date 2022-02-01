package km222pw_assign2.Exercise6;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;

import java.util.ArrayList;

public class Snowman extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Circle bottom = new Circle(300, 250, 70, Color.WHITE);
        Circle midd = new Circle(300, 150, 50, Color.WHITE);
        Circle top = new Circle(300, 75, 30, Color.WHITE);
        Circle butt_1 = new Circle(300, 130, 5, Color.BLACK);
        Circle butt_2 = new Circle(300, 150, 5, Color.BLACK);
        Circle butt_3 = new Circle(300, 170, 5, Color.BLACK);
        Circle eye_1 = new Circle(310, 70, 5, Color.BLACK);
        Circle eye_2 = new Circle(290, 70, 5, Color.BLACK);
        Circle sun = new Circle(550, 50, 30, Color.rgb(249, 231, 42));
        Rectangle hat_bottom = new Rectangle(271, 45, 60, 5);
        Rectangle hat_top = new Rectangle(281, 0, 40, 50);
        Rectangle ground = new Rectangle(600, (100), Color.WHITE);
        Group hat = new Group(hat_top, hat_bottom);
        ground.setY(300);
        Line mouth = new Line(290, 90, 310, 90);
        Group root = new Group(bottom, midd, top, butt_1, butt_2, butt_3, eye_1, eye_2, sun, ground, mouth, hat);
        Scene scene = new Scene(root, 600, 400, Color.rgb(0, 191, 255));
        primaryStage.setTitle("Snowman Mardini");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}

