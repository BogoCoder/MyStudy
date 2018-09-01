import acm.program.*;
public class Books extends ConsoleProgram
{
private static final long serialVersionUID = 1L;

public void run()
{
	LibraryRecord Odisea = new LibraryRecord("Odisea", "Homero", "Homero", 396, 22.565);
	String a = Odisea.toString();
	println(a);
	println(Odisea.getCirculation());
	
}
}
