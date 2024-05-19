import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;

public class Login extends Application{
	
	TextField name;
	TextField pas;
	Button k;
	Button b ;
	Label su;
	public void start(Stage ps){
		
		ps.setTitle("welcome");
		
		Label un = new Label("Username: ");
		name = new TextField();
		
		Label pass = new Label("Password: ");
		pas = new TextField();
		
		k = new Button("Ok");
		k.setOnAction(this :: kHandler);
		
		su = new Label(null);
		
		FlowPane a = new FlowPane(un, name, pass, pas, k, su);
		a.setAlignment(Pos.CENTER);
		a.setVgap(20);
		a.setHgap(20);
		
		Scene s = new Scene(a,300,300);
		ps.setScene(s);
		ps.show();
	}
	
	public void kHandler(ActionEvent e){
		
		b = new Button("Ok");
		b.setOnAction(this :: bHandler);
		
		Label m = new Label("Successfully logdin!");
		FlowPane f = new FlowPane(m, b);
		f.setAlignment(Pos.CENTER);
		f.setVgap(20);
		f.setHgap(20);
		
		Scene x = new Scene(f, 500, 200);

		if(e.getSource() == k){		
			
			if((name.getText().equalsIgnoreCase("manju")) && (pas.getText().equalsIgnoreCase("123"))){
				
				k.setDisable(true);
				Stage success = new Stage();
				success.setScene(x);
				success.show();	
			}
			else{		
				su.setText("The username or password is incorrect.");
			}
		}
	}
			
	public void bHandler(ActionEvent a){
		if(a.getSource() == b){
						
			Stage manju = new Stage();
			
			b.setDisable(true);
			Label x = new Label("Your name is Manjunath. Full name Sai Manjunath Reddy Kotthireddy. Son of Mallareddy and Soumya, brother of Manideep Reddy.");
			FlowPane pane = new FlowPane(x);
			pane.setAlignment(Pos.CENTER);
			pane.setVgap(20);
			pane.setHgap(20);
						
			Scene sc = new Scene(pane, 1000,200);
			manju.setScene(sc);
			manju.show();
		}
	}
} 
