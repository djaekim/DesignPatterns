package MVCObserver;
import java.util.Observable;
import java.util.Observer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CalculateController implements Observer {
	private ValueModel model;
	
	@FXML
	TextField inputField;
	
	@FXML
	Button addButton;
	
	@FXML
	Text State;
	
	@FXML
	public void calculate() {
		if (!inputField.getText().equals("")) {
			int adding = Integer.parseInt(inputField.getText());
			int value = model.getState() + adding;
			model.setState(value);
		} else {
			System.out.println("rejected no input value");
		}
	}
	
	public CalculateController(ValueModel m) {
		model = m;
		model.addObserver(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		State.setText("Current State: " + arg1.toString());
	
	}
}
