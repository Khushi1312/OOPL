import javafx.scene.*;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.event.*;

public class Q1 extends Application
{
	public void start(Stage s)
	{
		s.setTitle("Calculator");
		GridPane root=new GridPane();
		Scene scene=new Scene(root,400,500);

		Label a=new Label("Number 1:");
		Label b=new Label("Number 2:");
		Label res=new Label("");
		Button add=new Button("+");
		Button sub=new Button("-");
		Button prod=new Button("*");
		Button div=new Button("/");
		TextField tf1=new TextField();
		TextField tf2=new TextField();

		root.addRow(0,a,tf1);
		root.addRow(1,b,tf2);
		root.addRow(2,add,sub);
		root.addRow(3,prod,div);
		root.addRow(4,res);

		add.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				int r;
				int n1=Integer.parseInt(tf1.getText());
				int n2=Integer.parseInt(tf2.getText());
				r=n1+n2;
				res.setText(n1+"+"+n2+" = "+r);	
			}
		});

		sub.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				int r;
				int n1=Integer.parseInt(tf1.getText());
				int n2=Integer.parseInt(tf2.getText());
				r=n1-n2;
				res.setText(n1+"-"+n2+" = "+r);	
			}
		});

		prod.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				int r;
				int n1=Integer.parseInt(tf1.getText());
				int n2=Integer.parseInt(tf2.getText());
				r=n1*n2;
				res.setText(n1+"*"+n2+" = "+r);	
			}
		});

		div.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				float r;
				float n1=Float.parseFloat(tf1.getText());
				float n2=Float.parseFloat(tf2.getText());
				r=n1/n2;
				res.setText(n1+"/"+n2+" = "+r);	
			}
		});

		s.setScene(scene);
		s.show();
	}
	public static void main(String[] args) 
	{
		launch(args);	
	}
	
}