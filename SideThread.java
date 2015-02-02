package pack3;

public class SideThread extends MainThread{

	 public SideThread(int _num) {
		super(_num);
	}
	 
	@Override
	public void run()
	{
		System.out.println("Depth 2nd.Thred ¹ " + num);
		for ( int i=0; i < 3; ++i)
		{
			new SideThread2(i).start();
		}
	}

}
