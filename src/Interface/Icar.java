package Interface;

public interface Icar {
	int x =10;
	public void drive();
	public void takeTurn();
	public void start();
	public void stop();
	
	default void addedlater() {
		System.out.println("this is map");
	}
	
	

}
