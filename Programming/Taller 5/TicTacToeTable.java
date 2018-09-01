import acm.program.*;
import acm.graphics.*;
public class TicTacToeTable extends GraphicsProgram
{
private static final long serialVersionUID=1L;

	public void run()
	{
		setSize(200, 200);
		add(new GLine(55, 80, 145, 80));
		add(new GLine(55, 110, 145, 110));
		add(new GLine(80, 55, 80, 145));
		add(new GLine(110, 55, 110, 145));
	}
	//private static int BOARD_SIZE= 	90*90;
	
}
