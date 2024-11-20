import java.io.File;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{

	
	
	public static void main(String[] args) {
		
		
		launch(args);
		
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		
		Text titleLabel = new Text ("Hello World!");
		Text data = new Text(STLHelper.getFileSize(STYLESHEET_MODENA));
		
	//	System.out.println(STLHelper.getFileSize(STYLESHEET_MODENA));
		
		
		Files f = new File("res/");
		for (File f1 : f.listFiles()) 
		{
			names.add(f1.getName());
		}
		
		
		Text listLabel = new Text ("List of Models: ");
		ObservableList<String> names = FXCollections.observableArrayList();
		ListView<String> listView = new ListView<String>(names);
		
		
		ListView.getSelectionModel().select(0);
		
		
		
		GridPane gridPane = new GridPane();
		
		Button showInfo = new Button ("Show Info");
		showInfo.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override public void handle(ActionEvent e) 
			{
				titleLabel.setText("Size of STYLESHEET_MODENA");
				data.setText(STLHelper.getFileSize("STYLESHEET_MODENA"));
			}
		});
		
		
		
		
		gridPane.add(titleLabel, 0, 0);
		gridPane.add(data, 1, 0);
		gridPane.add(showInfo, 0, 8);
		gridPane.add(listLabel, 0, 1);
		gridPane.add(listView, 0, 2);
		
		
		
		Scene scene = new Scene(gridPane);
		
		
		arg0.setTitle("Hello World!");
		arg0.setHeight(300);
		arg0.setWidth(400);
		arg0.show();
		arg0.setScene(scene);
		
	}

}
