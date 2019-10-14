import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.text.*;
public class Q2 extends Application
{
	public void start(Stage s)
	{
		s.setTitle("Factorial");
		Label a=new Label("Number:");
		Label res=new Label(" ");

		TextField t=new TextField("Enter a number");
		
		Button Submit=new Button("Compute");
		
		GridPane root= new GridPane();
		Scene scene=new Scene(root,400,200);

		root.addRow(0,a,t);
		root.addRow(1,Submit);
		root.addRow(2,res);

		Submit.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				int f=1,i;
				int n=Integer.parseInt(t.getText());
				for(i=1;i<=n;i++)
					f=f*i;
				res.setText("Factorial is:"+f);
			}
		});
		s.setScene(scene);
		s.show();
	}
}