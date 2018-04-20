
// In this example, I am showing what an Abstract class does. In Abstract classes, it can only be inherited, but not instantiated. 
// That is the difference between Abstract and Interface.

package game;

public abstract class GameObject {
	
	
	public abstract void draw();
	
	public static void main(String [] args) {
		GameObject player = new Player ();
		player.draw();
		
		GameObject menu = new Menu();
		menu.draw();
		
		GameObject[] gameObjects = new GameObject [2];
		gameObjects[0] = player;
		gameObjects[1] = menu;
		
		for (GameObject obj : gameObjects) {
			obj.draw();
		}
	}

}
