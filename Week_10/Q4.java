import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.text.*;
public class Q4 extends Application
{
	public void start(Stage s)
	{
		s.setTitle("Factorial");
		Label a=new Label("Number 1:");
		Label b=new Label("Number 2:");
		Label res=new Label(" ");

		TextField t1=new TextField();
		TextField t2=new TextField();
		Button Submit=new Button("Compute");
		
		GridPane root= new GridPane();
		Scene scene=new Scene(root,400,200);

		root.addRow(0,a,t1);
		root.addRow(1,b,t2);
		root.addRow(2,Submit);
		root.addRow(3,res);

		Submit.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				int gcd=0;
				int n1=Integer.parseInt(t1.getText());
				int n2=Integer.parseInt(t2.getText());
				    for(int i=1; i <= n1 && i <= n2; ++i)
    					if(n1%i==0 && n2%i==0)
            				gcd = i;
				res.setText("GCD is:"+ gcd);
			}
		});
		s.setScene(scene);
		s.show();
	}
}