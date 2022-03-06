package init;

//Usine des robots

public class Factory {

	public Robot newRobot(int id) {
		
		switch(id) {
		
		case 0 :
			return new Robot("" , Color.Green);
		case 1 :
			return new Robot(" ", Color.Yellow);
		}
		return null;
	}
	
}
