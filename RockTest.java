import javax.swing.JFrame;

public class RockTest
{
	public static void main(String[] args)
	{
		Rock t = new Rock();
		
		t.setTitle("Player VS AI");
		t.setSize(500, 600);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setVisible(true);
		t.setResizable(true);
	}
}