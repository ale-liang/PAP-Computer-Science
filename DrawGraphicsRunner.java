import javax.swing.JFrame;

public class DrawGraphicsRunner extends JFrame
{
	private static final int WIDTH = 1050;
	private static final int HEIGHT = 700;

	public DrawGraphicsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new DrawGraphics());
				
		setVisible(true);
      
      
	}
	
	public static void main( String args[] )
	{
		DrawGraphicsRunner run = new DrawGraphicsRunner();
	} 
}