import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.input.MouseEvent;
import javafx.geometry.*;

public class Q2 extends Application
{
	GraphicsContext gc;
	String st="";
	public void start(Stage s)
	{
		s.setTitle("Shapes");
		FlowPane root=new FlowPane(10,10);
		Scene scene=new Scene(root,300,600);
		s.setScene(scene);
		Canvas can=new Canvas(300,500);
		gc=can.getGraphicsContext2D();

		RadioButton rbc=new RadioButton("Circle");
		RadioButton rbr=new RadioButton("Rectangle");
		RadioButton rbl=new RadioButton("Line");
		ToggleGroup tg=new ToggleGroup();
		rbc.setToggleGroup(tg);
		rbr.setToggleGroup(tg);
		rbl.setToggleGroup(tg);

		rbc.setOnAction(new MyHandler());
		rbr.setOnAction(new MyHandler());
		rbl.setOnAction(new MyHandler());
		root.getChildren().addAll(rbc,rbr,rbl,can);
		s.show();

		can.addEventFilter(MouseEvent.ANY, new EventHandler<MouseEvent>()
		{	
				double x,y,x1,y1;
				public void handle(MouseEvent mouseEvent)
				{
					if(mouseEvent.getEventType()==MouseEvent.MOUSE_CLICKED)
					{
						x=mouseEvent.getX();
						y=mouseEvent.getY();
					}
					if(mouseEvent.getEventType()==MouseEvent.MOUSE_DRAGGED)
					{
						x1=mouseEvent.getX();
						y1=mouseEvent.getY();
						
						gc.setFill(Color.WHITE);
						gc.fillRect(0,0,300,500);

						if("Line".equals(st))
						{
							gc.strokeLine(x,y,x1,y1);
							gc.strokeText("Line drawn",25,450);
						}
						else if("Rectangle".equals(st))
			            {
			    	        gc.strokeRect(x,y,x1-x,y1-y);
			                gc.strokeText("Area of rectangle=" + (x1-x)*(y1-y),25,450);
			            }
						else
						{
							gc.strokeOval(x,y,x1-x,y1-y);
							gc.strokeText("ARea circ="+3.14*(x1-x)*(x1-x),25,450);
						}
					}
				}
			});
	}
	class MyHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent ae)
		{
			st=((RadioButton)ae.getSource()).getText();
		}
	}
	public static void main(String[] args) 
	{
		launch(args);	
	}
}