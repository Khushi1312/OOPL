import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;


public class Q3 extends Application
{
	public void start(Stage primaryStage)
	{
		Label welcome=new Label("Welcome");
		Label first_name=new Label("User Name: ");
		Label Password=new Label("Password: ");
		Label Result=new Label(" ");
		Label Space=new Label("\t");
		TextField tf1=new TextField();
		PasswordField tf2=new PasswordField();
		Button Submit=new Button("Sign in");
		GridPane root= new GridPane();
		Scene scene=new Scene(root,400,200);
		root.addRow(0,welcome);
		root.addRow(2, first_name,tf1);
		root.addRow(4, Password,tf2);
		root.addRow(6,Space,Result);
		root.addRow(6,Submit);
		Submit.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				Result.setText("Welcome "+tf1.getText());

			}
		});
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) 
	{
		launch(args);	
	}
}