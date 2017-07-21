import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by got_r on 21/07/2017.
 */
public class TestLogin extends Application{


    @Override
    public void start(Stage stage) throws Exception {

        Parent parent =  FXMLLoader.load(getClass().getResource("/views/Login/Login.fxml"));
        //stage.getIcons().add(new Image(getClass().getResourceAsStre("img/icone.png"<img src="">));
        Scene scene = new Scene(parent);
        scene.setFill(null);
        stage.setScene(scene);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();


    }

}
