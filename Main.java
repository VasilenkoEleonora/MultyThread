package pack3;

public class Main {

	public static void main(String[] args) {
		for (int i=0; i < 3; ++i) 
		{
			new MainThread(i).start();
		}
	}
}
