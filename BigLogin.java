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

public class BigLogin extends Application{
	
	String username;
	String password;
	TextField u1;
	TextField u2;
	TextField p1;
	TextField p2;
	TextField u3;
	TextField p3;
	TextField u4;
	TextField p4;
	Button k1;
	Button k2;
	Button k3;
	Button k4;
	Button k5;
	Button k6;
	Button forgot;
	Button reset;
	Label tab;
	Label fn;
	Label ls;
	Label un1;
	Label pas1;
	Label w;
	Label wr; 
	Label se;
	Label q1;
	TextField m1;
	TextField m2; 	
	Label q2;
	TextField f1;
	TextField f2;
	TextField name1;
	TextField name2;
	TextField name3;
	TextField name4;
	Label msg;
	Label msg1;
	Stage ps = new Stage();
	Stage ps4;
	
	public void start (Stage ps){
		
		Label wel = new Label("Welcome to my beta test.");
		
		un1 = new Label("Username: ");
		u1 = new TextField();
		username = u1.getText();
		
		pas1 = new Label("Password: ");
		p1 = new TextField();
		password = p1.getText();
		
		se = new Label("Security Questions");
		q1 = new Label("What is ur mother's name ?");
		m1 = new TextField();
		q2 = new Label("What is ur father's name ?");
		f1 = new TextField();
		
		k1 = new Button("Ok");
		k1.setOnAction(this :: k1Handler);
		
		FlowPane pane1 = new FlowPane(wel, un1, u1, pas1, p1, se, q1, m1, q2, f1, k1);
		pane1.setAlignment(Pos.CENTER);
		pane1.setVgap(20);
		pane1.setHgap(80);
		
		Scene sc = new Scene(pane1, 300,550);
		ps.setScene(sc);
		ps.show();
	}
	
	public void k1Handler(ActionEvent e1){
		
		//ps.close();
		
		if(e1.getSource() == k1){
			
			ps.close();
			
			Stage ps2 = new Stage();
			
			k1.setDisable(true);
			tab = new Label("Please enter the username" + "\n" + "\t\t" + "   and" + "\n" + "Password that use just saved");
			k2 = new Button("Ok");
			k2.setOnAction(this :: k2Handler);
			
			forgot = new Button("Forgot ?");
			forgot.setOnAction(this :: k2Handler);

			u2 = new TextField();
			p2 = new TextField();
			
			w = new Label(null);
			
			FlowPane pane2 = new FlowPane(tab,un1, u2, pas1, p2, k2, forgot, w);
			pane2.setAlignment(Pos.CENTER);
			pane2.setVgap(20);
			pane2.setHgap(31);
			
			Scene sc1 = new Scene(pane2, 250, 400);
			ps2.setScene(sc1);
			ps2.show();
		}
	}
	
	public void k2Handler(ActionEvent e2){
		
		Stage ps3 = new Stage();
		
		if(e2.getSource() == k2){
			
			if((u1.getText().equals(u2.getText())) && p1.getText().equals(p2.getText())){
				
				fn= new Label("What is your First Name: ");
				name1 = new TextField();
				
				ls = new Label("What is your Last Name: ");
				name2 = new TextField();
				
				k3 = new Button("Ok");
				k3.setOnAction(this :: k3Handler);
				
				FlowPane pane3 = new FlowPane(fn, name1, ls, name2, k3);
				pane3.setAlignment(Pos.CENTER);
				pane3.setVgap(20);
				pane3.setHgap(20);
				
				Scene sc2 = new Scene(pane3, 430, 300);
				ps3.setScene(sc2);
				ps3.show();
			}
			
			else{
				w.setText("Username or Password is wrong." + "\n" +"Please try again.");
			}
		}
		
		else if(e2.getSource() == forgot){
			
			forgot.setDisable(true);
			
			m2 = new TextField();
			f2 = new TextField();
			
			Button k4 = new Button("Ok");
			k4.setOnAction(this :: k4Handler);
			
			wr = new Label(null);
			
			FlowPane pane4 = new FlowPane(se, q1, m2, q2, f2, k4, wr);
			pane4.setAlignment(Pos.CENTER);
			pane4.setVgap(20);
			pane4.setHgap(20);
			
			Scene sc3 = new Scene(pane4, 200, 400);
			ps3.setScene(sc3);
			ps3.show();
		}
	}
	
	public void k3Handler(ActionEvent e3){
		
		ps4 = new Stage();
		
		k3.setDisable(true);
		
		if(e3.getSource() == k3){
			
			//System.out.println(name1.getText() + "\n" + name2.getText());
			
			msg = new Label("Hi " + name1.getText() + " " + name2.getText() + " !");
			
			FlowPane pane5 = new FlowPane(msg);
			pane5.setAlignment(Pos.CENTER);
			pane5.setVgap(20);
			pane5.setHgap(20);
			
			Scene sc4 = new Scene(pane5, 300, 300);
			ps4.setScene(sc4);
			ps4.show();
		}
	}
	
	public void k4Handler(ActionEvent e4){
		
		//k4.setDisable(true);
		
		if((m1.getText().equals(m2.getText())) && (f1.getText().equals(f2.getText()))){
			
			//k4.setDisable(true);
			
			Label r = new Label("Please reset your username and password.");
				
			u3 = new TextField();
			p3 = new TextField();
			
			reset = new Button("Reset");
			reset.setOnAction(this :: resetHandler);
			
			FlowPane pane6 = new FlowPane(r, un1, u3, pas1, p3, reset);
			pane6.setAlignment(Pos.CENTER);
			pane6.setVgap(20);
			pane6.setHgap(20);
			
			Scene sc5 = new Scene(pane6, 300, 300);
			ps.setScene(sc5);
			ps.show();
			
			//k4.setDisable(true);
		}
		
		else{
			wr.setText("Something went wrong."+"\n"+"Please try again.");
		}
		//k4.setDisable(true);
	}
	
	public void resetHandler(ActionEvent e5){
		
		reset.setDisable(true);
		
		username = u3.getText();
		password = p3.getText();
			
		u4 = new TextField();
		p4 = new TextField();
			
		k5 = new Button("Ok");
		k5.setOnAction(this :: k5Handler);
		
		w = new Label(null);
			
		FlowPane pane7 = new FlowPane(tab, un1, u4, pas1, p4, k5, w);
		pane7.setAlignment(Pos.CENTER);
		pane7.setVgap(20);
		pane7.setHgap(20);
			
		Scene sc6 = new Scene(pane7, 230, 400);
		ps.setScene(sc6);
		ps.show();
	}
	
	public void k5Handler(ActionEvent e6){
	
		if(username.equals(u4.getText()) && password.equals(p4.getText())){
			
			k5.setDisable(true);
			
			name3 = new TextField();
			name4 = new TextField();
			
			k6 = new Button("Ok");
			k6.setOnAction(this :: k6Handler);
			
			Label fn1 = new Label("What is your First Name: ");
			Label ls1 = new Label("What is your Last Name: ");
			
			FlowPane pane8 = new FlowPane(fn1, name3, ls1, name4, k6);
			
			pane8.setAlignment(Pos.CENTER);
			pane8.setVgap(20);
			pane8.setHgap(20);
			
			Scene sc7 = new Scene(pane8, 400, 300);
			ps.setScene(sc7);
			ps.show();
		}
		else{
			w.setText("Username or Password is wrong."+"\n"+"Please try again.");
		}	
	}
	
	public void k6Handler(ActionEvent e7){
		
		k6.setDisable(true);
		
		msg = new Label("Hi " + name3.getText() + " " + name4.getText() + " !");
			
		FlowPane pane9 = new FlowPane(msg);
		pane9.setAlignment(Pos.CENTER);
		pane9.setVgap(20);
		pane9.setHgap(20);
			
		Scene sc8 = new Scene(pane9, 300, 300);
		ps.setScene(sc8);
		ps.show();
	}
}