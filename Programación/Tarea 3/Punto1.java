
import java.io.*;
import java.util.*;
import acm.program.*;
import acm.util.*;
public class Punto1 extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	
	public void run()
	{
		setSize(500,500);
		println("Este programa es la realización del punto 1 de la Tarea 3 de Programación.");
		///Usar la variable estática "File" al final del código si es necesario.
		try 
		{
			rd = new BufferedReader(new FileReader(file));
		} 
		catch (IOException exception)
		{
			throw new ErrorException("Imposible de leer el archivo");
		}
		
		pause(1000);
		println("\n///Archivo \n");
		FilePrinter();
		pause(1000);
		println("\n///Plurales \n");
		PluralIdentifier();
		pause(1000);
		println("\n///Órden contrario \n");
		ReverseOrder();
		pause(1000);
		println("\n///Eliminar plurales \n");
		RemovePlurals();
		
		pause(1000);
		println("\n///Plurales a mayúsculas (Array) \n");
		AddingWordsToAList();
		println("\nLista nueva con plurales a mayúsculas: " + arChangePluralUP(wordsAR));
		
		pause(1000);
		println("\n///Eliminar plurales (Array) \n");
		AddingWordsToAList();
		println("\nLista nueva con plurales removidos: " + arRemovePlurals(wordsAR));
		
		pause(1000);
		println("\n///Histograma (Array) \n");
		AddingWordsToAList();
		HistogramVocals(wordsAR);
		}
	
///// Punto a	
	private void FilePrinter() 
	{
		try
		{
			rd = new BufferedReader(new FileReader(file));
			ArrayList<String> linear = new ArrayList<String>();
			String ln = rd.readLine();
			while(ln != null)
			{
				linear.add(ln);
				ln = rd.readLine();
			}
			
			for(int i = 0; i < linear.size(); i++)
			{
				println(linear.get(i));
			}
			
		rd.close();
		}
		catch(IOException exception)
		{
			throw new ErrorException("Imposible imprimir");
		}
	}
///// Punto b	
	private void PluralIdentifier()
	{

		try {
		rd = new BufferedReader(new FileReader(file));
		ArrayList<String> linear = new ArrayList<String>();
		String ln = rd.readLine();
		while(ln != null)
		{
			linear.add(ln);
			ln = rd.readLine();
		}
			for(int i = 0; i < linear.size(); i++)
			{
			StringTokenizer tokenizer = new StringTokenizer(linear.get(i), " ,.:;");
				while(tokenizer.hasMoreTokens() == true)
				{	
					String wrd = tokenizer.nextToken();
						if(wrd.endsWith("S") || wrd.endsWith("s") && wrd.length() > 2)
						{
							println(wrd);	
						}
				}
			}	
		rd.close();
		}
		catch(IOException exception)
		{
			throw new ErrorException("Imposible identificar plurales.");
		}
	}
///// Punto c	
	private void ReverseOrder()
	{
		try
		{
			rd = new BufferedReader(new FileReader(file));
			ArrayList<String> linear = new ArrayList<String>();
			String ln = rd.readLine();
			while(ln != null)
			{
				linear.add(ln);
				ln = rd.readLine();
			}
			
			for(int i = linear.size() - 1; i >= 0; i--)
			{
				println(linear.get(i));
			}
			
		rd.close();
		}
		catch(IOException exception)
		{
			throw new ErrorException("Imposible revertir");
		}
	}
///// Punto d	
	private void RemovePlurals()
	{
		try {
			rd = new BufferedReader(new FileReader(file));
			ArrayList<String> linear = new ArrayList<String>();
			String ln = rd.readLine();
			String withoutP =  "";
			String wrd;
			while(ln != null)
			{
				linear.add(ln);
				ln = rd.readLine();
			}
				for(int i = 0; i < linear.size(); i++)
				{
				StringTokenizer tokenizer = new StringTokenizer(linear.get(i), " ,.:;");
					while(tokenizer.hasMoreTokens() == true)
					{	
						wrd = tokenizer.nextToken();
							if(wrd.endsWith("S") == false && wrd.endsWith("s") == false || wrd.length() > 2 == false)
							{	
								withoutP += wrd + " ";	
							}
					}	
					println(withoutP);
					withoutP = "";
				}	
				
			rd.close();
			}
			catch(IOException exception)
			{
				throw new ErrorException("Imposible remover plurales");
			}
	}
///// Punto e	
	private ArrayList<String> arChangePluralUP(ArrayList<String> AR)
	{
		println(AR);
		String wrd;
		for(int i = 0; i < AR.size(); i++)
			{
					wrd = AR.get(i);
						if(wrd.endsWith("S") || wrd.endsWith("s") && wrd.length() > 2 )
						{	
							AR.set(i, AR.get(i).toUpperCase());
						}	
			}	
		return AR;
	}
///// Punto f
	private ArrayList<String> arRemovePlurals(ArrayList<String> AR)
	{
		println(AR);
		String wrd;
		for(int i = 0; i < AR.size(); i++)
			{
					wrd = AR.get(i);
						if(wrd.endsWith("S") || wrd.endsWith("s") && wrd.length() > 2)
						{	
							AR.remove(i);
							i--;
						}
			}	
		return AR;
	}
///// Punto g	
	private void HistogramVocals(ArrayList<String> AR)
	{
		println(AR);
		String wrd;
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		for(int v = 0; v < AR.size(); v++)
			{
				wrd = AR.get(v);
				for(int c = 0; c < wrd.length(); c++)
				{
					if(wrd.charAt(c) == 'a' || wrd.charAt(c) == 'A' || wrd.charAt(c) == 'á' || wrd.charAt(c) == 'Á')
					{
						a++;	
					}
					else if(wrd.charAt(c) == 'e' || wrd.charAt(c) == 'E' || wrd.charAt(c) == 'é' || wrd.charAt(c) == 'É')
					{
						e++;	
					}
					else if(wrd.charAt(c) == 'i' || wrd.charAt(c) == 'I' || wrd.charAt(c) == 'í' || wrd.charAt(c) == 'Í')
					{
						i++;	
					}
					else if(wrd.charAt(c) == 'o' || wrd.charAt(c) == 'O' || wrd.charAt(c) == 'ó' || wrd.charAt(c) == 'O')
					{
						o++;	
					}
					else if(wrd.charAt(c) == 'u' || wrd.charAt(c) == 'U' || wrd.charAt(c) == 'ú' || wrd.charAt(c) == 'Ú')
					{
						u++;	
					}
				}	
			}	
		println("a: " + a);
		println("e: " + e);
		println("i: " + i);
		println("o: " + o);
		println("u: " + u);
	}
///// Método que retorna un Array de las palabras contenidas en el archivo .txt	
	private ArrayList<String> AddingWordsToAList()
	{
		try {
			wordsAR = new ArrayList<String>();
			BufferedReader rd = new BufferedReader(new FileReader(file));
			ArrayList<String> linear = new ArrayList<String>();
			String ln = rd.readLine();
			String wrd;
			while(ln != null)
			{
				linear.add(ln);
				ln = rd.readLine();
			}
				for(int i = 0; i < linear.size(); i++)
				{
				StringTokenizer tokenizer = new StringTokenizer(linear.get(i), " ,:;.");
					while(tokenizer.hasMoreTokens() == true)
					{	
						wrd = tokenizer.nextToken();
						wordsAR.add(wrd);
					}	
				}	
			rd.close();
			return wordsAR;
			}
			catch(IOException exception)
			{
				throw new ErrorException("Imposible crear Array con las palabras del archivo");
			}
	}
	
	
	private static ArrayList<String> wordsAR = new ArrayList<String>();
	private static BufferedReader rd;
	private static String file = "C:\\Users\\samue\\Desktop\\Tarea 4\\punto1.txt";
}
