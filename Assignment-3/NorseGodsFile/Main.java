package km222pw_assign3.NorseGodsFile;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;


    /*
    NOTE:please add the VM in order to make the programe work
    */
public class Main extends Application {
    Text text_Desc;

    GuiGenerator guiGenerator = new GuiGenerator();
    NorseGods_Info gods_info = new NorseGods_Info();
    @Override
    public void start(Stage stage) throws Exception{
        Group group = new Group( guiGenerator.guiGenerator());

        for (int i = 0; i <gods_info.norseGodsArrayList().size() ; i++) {
            guiGenerator.listView.getItems().add(gods_info.norseGodsArrayList().get(i).getName());



        }



        controller();

        stage.setScene(new Scene(group));
        stage.setTitle("Norse Gods");
        stage.show();
    }

    public void controller() {
                guiGenerator.listView.getSelectionModel().selectedIndexProperty().addListener((ov, oldValue, newValue) -> {
                    guiGenerator.textFlow.getChildren().clear();

                    if (guiGenerator.listView.getSelectionModel().getSelectedIndex() == 0) {
                        text_Desc = new Text();
                        text_Desc.setText(gods_info.norseGodsArrayList().get(0).getDesc());
                        guiGenerator.label_Name.setText(gods_info.norseGodsArrayList().get(0).getName());
                        guiGenerator.label_race.setText(gods_info.norseGodsArrayList().get(0).getRace());

                        guiGenerator.textFlow.getChildren().add(text_Desc);

                    }
                    if (guiGenerator.listView.getSelectionModel().getSelectedIndex() == 1) {
                        text_Desc = new Text();
                        text_Desc.setText(gods_info.norseGodsArrayList().get(1).getDesc());
                        guiGenerator.label_Name.setText(gods_info.norseGodsArrayList().get(1).getName());
                        guiGenerator.label_race.setText(gods_info.norseGodsArrayList().get(1).getRace());

                        guiGenerator.textFlow.getChildren().add(text_Desc);

                    }
                    if (guiGenerator.listView.getSelectionModel().getSelectedIndex() == 2) {
                        text_Desc = new Text(gods_info.norseGodsArrayList().get(2).getDesc());
                        guiGenerator.label_Name.setText(gods_info.norseGodsArrayList().get(2).getName());
                        guiGenerator.label_race.setText(gods_info.norseGodsArrayList().get(2).getRace());
                        guiGenerator.textFlow.getChildren().add(text_Desc);

                    }
                    if (guiGenerator.listView.getSelectionModel().getSelectedIndex() == 3) {
                        text_Desc = new Text(gods_info.norseGodsArrayList().get(3).getDesc());
                        guiGenerator.label_Name.setText(gods_info.norseGodsArrayList().get(3).getName());
                        guiGenerator.label_race.setText(gods_info.norseGodsArrayList().get(3).getRace());
                        guiGenerator.textFlow.getChildren().add(text_Desc);

                    }
                    if (guiGenerator.listView.getSelectionModel().getSelectedIndex() == 4) {
                        text_Desc = new Text(gods_info.norseGodsArrayList().get(4).getDesc());
                        guiGenerator.label_Name.setText(gods_info.norseGodsArrayList().get(4).getName());
                        guiGenerator.label_race.setText(gods_info.norseGodsArrayList().get(4).getRace());
                        guiGenerator.textFlow.getChildren().add(text_Desc);

                    }
                    if (guiGenerator.listView.getSelectionModel().getSelectedIndex() == 5) {
                        text_Desc = new Text(gods_info.norseGodsArrayList().get(5).getDesc());
                        guiGenerator.label_Name.setText(gods_info.norseGodsArrayList().get(5).getName());
                        guiGenerator.label_race.setText(gods_info.norseGodsArrayList().get(5).getRace());
                        guiGenerator.textFlow.getChildren().add(text_Desc);

                    }
                    if (guiGenerator.listView.getSelectionModel().getSelectedIndex() == 6) {
                        text_Desc = new Text(gods_info.norseGodsArrayList().get(6).getDesc());
                        guiGenerator.label_Name.setText(gods_info.norseGodsArrayList().get(6).getName());
                        guiGenerator.label_race.setText(gods_info.norseGodsArrayList().get(6).getRace());
                        guiGenerator.textFlow.getChildren().add(text_Desc);

                    }
                    if (guiGenerator.listView.getSelectionModel().getSelectedIndex() == 7) {
                        text_Desc = new Text(gods_info.norseGodsArrayList().get(7).getDesc());
                        guiGenerator.label_Name.setText(gods_info.norseGodsArrayList().get(7).getName());
                        guiGenerator.label_race.setText(gods_info.norseGodsArrayList().get(7).getRace());

                        guiGenerator.textFlow.getChildren().add(text_Desc);

                    }
                });
            }





    public static void main(String[] args) {
        launch(args);
    }
}
