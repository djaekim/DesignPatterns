package Control;
import java.util.Observable;

public class ValueModel extends Observable {
	int State = 0;
	
	public void setState(int i) {
		State = i;
		setChanged();
		notifyObservers(State);
	}
	public int getState() {
		return State;
	}
	
}
