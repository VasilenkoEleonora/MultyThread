package pack3;


public class MainThread extends Thread{

	protected int num;
	
	public MainThread(int _num)
	{
		num = _num;
	}
	public void run()
	{
		System.out.println("Depth 1st.Thred ¹ " + num);
		for ( int i=0; i < 3; ++i)
		{
			new SideThread(i).start();
		}
	}

}
