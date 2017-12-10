
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.util.Arrays;


public class Array extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);
        String[] wishList = new String[10];
        final TextField[] text = new TextField[10];
        Button btn = new Button("Submit");
        for (int i = 0; i < text.length; i++) {
            text[i] = new TextField("TextField" + (i + 1));
            vbox.getChildren().add(text[i]);
        }
        vbox.getChildren().add(btn);

        btn.setOnAction(e -> {

            String beforeSort = "\n Before sort: \n";
            String afterSort = "\n After sort: \n";

            for (int i = 0; i < text.length; i++) {
                wishList[i] = text[i].getText();
                beforeSort += wishList[i] + "\t";
            }


            Arrays.sort(wishList, 0, 9);

            for (int i = 0; i < text.length; i++) {
                afterSort += wishList[i] + "\t";
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(beforeSort + afterSort);
            alert.showAndWait();

        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

