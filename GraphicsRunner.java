import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 1000;
	private static final int HEIGHT = 1200;

	public GraphicsRunner()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);

		//getContentPane().add(new Circles());

		//getContentPane().add(new Rectangles());

		//getContentPane().add(new Lines());

		//getContentPane().add(new Polygons());

		//getContentPane().add(new Arcs());

		//getContentPane().add(new Colors());

		//getContentPane().add(new Fonts());

		//getContentPane().add(new ImageOne());

		//getContentPane().add(new DoubleBuffer());

		//getContentPane().add(new Animation());

		//getContentPane().add(new Sounds());
      
        getContentPane().add(new ShapePanel());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}