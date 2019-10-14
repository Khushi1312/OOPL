import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class Q1 extends Application
{
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("This is the first JavaFX Application");
		Label b=new Label("Welcome to JavaFX programming");
		b.setTextFill(Color.MAGENTA);
		FlowPane root=new FlowPane(10.0,10.0);
		//root.setHgap(10.0);
		//root.setVgap(10.0);
		root.getChildren().add(b);
		Scene scene=new Scene(root,500,200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void stop()
	{
		System.out.println("Stopped");
	}
	public static void main(String[] args) 
	{
		launch(args);	
	}
}