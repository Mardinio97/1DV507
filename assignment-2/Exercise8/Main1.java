package km222pw_assign2.Exercise8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
/*
NOTE:please add the VM in order to make the programe work
*/
public class Main1 extends Application {
    GameGenerator creatGame = new GameGenerator();
    Image diec1;
    Image diec2;
    Image diec3;
    Image diec4;
    Image diec5;
    int controller = 3;
    public Pane root = new Pane();
    ArrayList<ImageView> imageViewArrayList = new ArrayList<>();
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox_arr[];
    int random_holder;
    ArrayList<Integer> dice_Roller = new ArrayList<Integer>();
    public boolean three_OF_Kind = false;
    public boolean pair = false;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        for (int i = 0; i < 5; i++) {
            dice_Roller.add(0);
        }
        checkBox1 = new CheckBox();
        checkBox2 = new CheckBox();
        checkBox3 = new CheckBox();
        checkBox4 = new CheckBox();
        checkBox5 = new CheckBox();
        checkBox_arr = new CheckBox[]{
                checkBox1, checkBox2, checkBox3, checkBox4, checkBox5
        };
        Group group = new Group(creatGame.GameGenerator());


        for (int i = 0; i < checkBox_arr.length; i++) {

            creatGame.gridPane.add(checkBox_arr[i], i, 1);
            checkBox_arr[i].setDisable(true);
            creatGame.textField.setText("You have " + 3 + " roll(s) left.");
        }

        for (int i = 1; i <= 5; i++) {
            imageViewArrayList.add(setImage(i));
            creatGame.gridPane.add(imageViewArrayList.get((i - 1)), (i - 1), 0);


        }
        ArrayList<Integer> dices = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            dices.add(i);
        }


        creatGame.button.setOnAction(e -> {
            ArrayList<Object> test = new ArrayList<>();

            controller--;
            if (controller < 3) {
                for (int i = 0; i < checkBox_arr.length; i++) {
                    checkBox_arr[i].setDisable(false);

                }

            }

            if (controller >= 0) {

                for (int i = 0; i < imageViewArrayList.size(); i++) {

                    Image img;

                    if (!checkBox_arr[0].isSelected()) {
                        int test1 = randomizing();

                        img = new Image("km222pw_assign2/Exercise8/dice" + test1 + ".png");
                        imageViewArrayList.get(0).setImage(img);

                        dice_Roller.set(0, test1);


                    }
                    if (!checkBox_arr[1].isSelected()) {

                        random_holder = randomizing();

                        img = new Image("km222pw_assign2/Exercise8/dice" + random_holder + ".png");
                        imageViewArrayList.get(1).setImage(img);
                        dice_Roller.set(1, random_holder);


                    }


                    if (!checkBox_arr[2].isSelected()) {
                        int test1 = randomizing();

                        img = new Image("km222pw_assign2/Exercise8/dice" + test1 + ".png");
                        imageViewArrayList.get(2).setImage(img);
                        dice_Roller.set(2, test1);

                    }

                    if (!checkBox_arr[3].isSelected()) {
                        int test1 = randomizing();

                        img = new Image("km222pw_assign2/Exercise8/dice" + test1 + ".png");
                        imageViewArrayList.get(3).setImage(img);
                        dice_Roller.set(3, test1);


                    }
                    if (!checkBox_arr[4].isSelected()) {
                        int test1 = randomizing();

                        img = new Image("km222pw_assign2/Exercise8/dice" + test1 + ".png");
                        imageViewArrayList.get(4).setImage(img);
                        dice_Roller.set(4, test1);


                    }


                }

                creatGame.textField.setEditable(false);
                creatGame.textField.setText("You have " + controller + " roll(s) left.");

            }


            if (controller < 0) {
                for (int i = 0; i < checkBox_arr.length; i++) {
                    checkBox_arr[i].setDisable(true);
                    creatGame.textField.setText(showResult());
                }
            }
        });


        stage.setScene(new Scene(group));
        stage.setTitle("Yahtzee");
        stage.show();

    }




    public ImageView setImage(int nr) {
        ImageView imageView = new ImageView();


        switch (nr) {

            case 1:
                diec1 = new Image("km222pw_assign2/Exercise8/dice1.png");
                imageView.setImage(diec1);
                break;
            case 2:
                diec2 = new Image("km222pw_assign2/Exercise8/dice2.png");
                imageView.setImage(diec2);
                break;
            case 3:
                diec3 = new Image("km222pw_assign2/Exercise8/dice3.png");
                imageView.setImage(diec3);
                break;
            case 4:
                diec4 = new Image("km222pw_assign2/Exercise8/dice4.png");
                imageView.setImage(diec4);
                break;
            case 5:
                diec5 = new Image("km222pw_assign2/Exercise8/dice5.png");
                imageView.setImage(diec5);
                break;
            default:
                System.out.println("Oops, something went wrong. Please try again");
        }
        return imageView;
    }

    public String showResult() {
        for (int i = 0; i < dice_Roller.size(); i++) {

        }


        for (int i = 0; i <= 4; i++) {
            int matches = 0;
            for (int j = 0; j < 5; j++) {
                if (dice_Roller.get(i) == i) {

                    matches++;
                }
                if (matches == 5) {
                    return "Yahtzee";
                }
            }
        }
        for (int i = 0; i <= 4; i++) {
            int matches = 0;
            for (int j = 0; j < 5; j++) {
                if (dice_Roller.get(j) == i) {

                    matches++;
                }
                if (matches == 2) {

                    return "Pair";
                }
            }
        }

        for (int i = 0; i <= 4; i++) {
            int matches = 0;
            for (int j = 0; j < 5; j++) {
                if (dice_Roller.get(j) == i) {

                    matches++;
                }
                if (matches == 3) {
                    three_OF_Kind = true;
                    return "Three of a kind";
                }
            }
        }

        for (int i = 0; i <= 4; i++) {
            int matches = 0;
            for (int j = 0; j < 5; j++) {
                if (dice_Roller.get(j) == i) {

                    matches++;
                }
                if (matches == 4) {
                    return "Four of a kind";
                }
            }
        }


        if (pair == three_OF_Kind) {

            return "Full House";
        }
        if (((dice_Roller.get(0) == 1 && dice_Roller.get(1) == 2 && dice_Roller.get(2) == 3 && dice_Roller.get(3) == 4) || (dice_Roller.get(1) == 2 && dice_Roller.get(2) == 3 && dice_Roller.get(3) == 4 && dice_Roller.get(4) == 5) ||
                (dice_Roller.get(2) == 3 && dice_Roller.get(3) == 4 && dice_Roller.get(4) == 5 && dice_Roller.get(4) == 6))) {
            return "Small Straight";
        }


        if ((dice_Roller.get(0) == 1 && dice_Roller.get(1) == 2 && dice_Roller.get(2) == 3 && dice_Roller.get(3) == 4 && dice_Roller.get(4) == 5) ||
                (dice_Roller.get(0) == 2 && dice_Roller.get(1) == 3 && dice_Roller.get(2) == 4 && dice_Roller.get(3) == 5 && dice_Roller.get(4) == 6)) {
            return "Large Straight";
        }


        return "Oops, something went wrong. Please try again";
    }
    public static int randomizing() {

        return (int) (1 + (Math.random() * 5));
    }
}