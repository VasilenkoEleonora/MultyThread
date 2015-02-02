package pack3;

public class SideThread2 extends MainThread{
	
	public SideThread2(int _num) {
		super(_num);
	}
	
	@Override
	public void run()
	{
		System.out.println("Depth 3rd.Thred ¹ " + num);
	}

}
