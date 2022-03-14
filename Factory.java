package init;

//Usine des robots
// tu peux rajouter les tapis roulant/laser/puits/broyeurs

public class Factory {

	public Robot newRobot(int id) {
		
		switch(id) {
		
		case 0 :
			return new Robot(" " , Color.Green);
		case 1 :
			return new Robot(" ", Color.Yellow);
		}
		return null;
	}
	
}
