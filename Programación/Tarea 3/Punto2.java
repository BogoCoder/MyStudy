import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;
public class Punto2 extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;
	ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Integer> b = new ArrayList<Integer>();
	public void run()
	{
		setSize(1000, 600);
		println("This program is the homework #4");
		BufferedReader rd;
		try
		{
			rd = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\Programación\\Corte 2\\EjemploTarea4.txt"));
		}
		catch (FileNotFoundException e)
		{
			throw new ErrorException("Unable to read");
		}
		printNumbers(rd);
		calculateAverage(rd);
		max_and_min(rd);
		remove_even(rd);
		divide_array(rd);
		for(int i = 0; i <= 15; i += 3)
		{
			a.add(i);
		}
		for(int j = 0; j <= 15; j += 2)
		{
			b.add(j);
		}
		println("// Operations between arrays.");
		println("The firts Array is: " + a);
		println("The second Arrary is:" + b);
		union(a, b);
		differ(a, b);
		intersec(a, b);
	}
	private void printNumbers(BufferedReader rd)
	{
		try 
		{
			println(); println("// Print file.");
			rd = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\Programación\\Corte 2\\EjemploTarea4.txt"));
			String ln = rd.readLine();
			ArrayList<String> file = new ArrayList<String>();
			while(ln != null)
			{
				file.add(ln);
				ln = rd.readLine();
			}
			for(int i = 0; i < file.size(); i++)
			{
				println(file.get(i));
			}
			rd.close();
		}
		catch(IOException exception)
		{
			throw new ErrorException("Unable to count the number of words.");
		}
	}
	private void calculateAverage(BufferedReader rd)
	{
		try 
		{
			println(); println("// Calculate the average.");
			rd = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\Programación\\Corte 2\\EjemploTarea4.txt"));
			String ln = rd.readLine();
			ArrayList<Integer> file = new ArrayList<Integer>();
			int sum = 0;
			int dates = 0;
			while(ln != null)
			{
				StringTokenizer tokenizer = new StringTokenizer(ln, " ");
				while(tokenizer.hasMoreTokens() == true)
				{	
					int data = Integer.parseInt(tokenizer.nextToken()); 
					file.add(data);
					dates++;
				}
				ln = rd.readLine();
			}
			for(int j = 0; j < file.size(); j++)
			{
				sum = sum + file.get(j);
			}
			double average = sum / dates;
			println("The average is: " + average);
			rd.close();
		}
		catch(IOException exception)
		{
			throw new ErrorException("Unable to count the number of words.");
		}
	}
	private void max_and_min(BufferedReader rd)
	{
		try
		{
			println(); println("// Calculate the max and the min.");
			rd = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\Programación\\Corte 2\\EjemploTarea4.txt"));
			String ln = rd.readLine();
			ArrayList<Integer> file = new ArrayList<Integer>();
			while(ln != null) 
			{
				StringTokenizer tokenizer = new StringTokenizer(ln, " ");
				while(tokenizer.hasMoreTokens() == true)
				{	
					int data = Integer.parseInt(tokenizer.nextToken()); 
					file.add(data);
				}
				ln = rd.readLine();
			}
			int max = file.get(0);
			int min = file.get(file.size() - 1);
			for(int i = 0; i < file.size(); i++)
			{
				if(file.get(i) > max)
				{
					max = file.get(i);
				}
			}
			for(int i = file.size() - 1; i >= 0; i--)
			{
				if(file.get(i) < min)
				{
					min = file.get(i);
				}
			}
			println("The max is " + max + " and the min is " + min);
			rd.close();
		}
		catch(IOException exception)
		{
			throw new ErrorException("Unable to count the number of words.");
		}
	}
	private void remove_even(BufferedReader rd)
	{
		try
		{
			println(); println("// Just show the odd numbers in the file in the file.");
			rd = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\Programación\\Corte 2\\EjemploTarea4.txt"));
			String ln = rd.readLine();
			ArrayList<Integer> file = new ArrayList<Integer>();
			while(ln != null)
			{
				StringTokenizer tokenizer = new StringTokenizer(ln, " ");
				while(tokenizer.hasMoreTokens() == true)
				{	
					int data = Integer.parseInt(tokenizer.nextToken()); 
					file.add(data);
				}
				ln = rd.readLine();
			}
			for(int i = 0; i < file.size(); i++)
			{
				if(file.get(i) % 2 == 1)
				{
					println(file.get(i));
				}
			}
			rd.close();
		}
		catch(IOException exception)
		{
			throw new ErrorException("Unable to count the number of words.");
		}
	}
	private void divide_array(BufferedReader rd)
	{
		try 
		{
			println(); println("// Divide the fille in two equals parts.");
			rd = new BufferedReader(new FileReader("C:\\Users\\Usuario\\Documents\\Programación\\Corte 2\\EjemploTarea4.txt"));
			String ln = rd.readLine();
			ArrayList<Integer> file = new ArrayList<Integer>();
			int datas = 0;
			while(ln != null)
			{
				StringTokenizer tokenizer = new StringTokenizer(ln, " ");
				while(tokenizer.hasMoreTokens() == true)
				{	
					int data = Integer.parseInt(tokenizer.nextToken()); 
					file.add(data);
					datas++;
				}
				ln = rd.readLine();
			}
			if(datas % 2 == 1)
			{
				println(">>>>>>> Is imposible divide this file in two equals parts!");
			}
			else
			{
				ArrayList<Integer> onepart = new ArrayList<Integer>();
				ArrayList<Integer> secondpart = new ArrayList<Integer>();
				for(int i = 0; i < file.size();i++)
				{
					if(i < file.size() / 2)
					{
						onepart.add(file.get(i));
					}
					else
					{
						secondpart.add(file.get(i));
					}
				}
				println("The firts half is: " + onepart);
				println("The second half is: " + secondpart);
			}
			rd.close();
		}
		catch(IOException exception)
		{
			throw new ErrorException("Unable to count the number of words.");
		}
	}
	private void union(ArrayList<Integer> a, ArrayList<Integer> b)
	{
		ArrayList<Integer> aUb = new ArrayList<Integer>();
		for(int i = 0; i < a.size();i++)
		{
			aUb.add(a.get(i));
		}
		for(int i = 0; i < b.size();i++)
		{
			aUb.add(b.get(i));
		}
		println("The union array between the firts array and the second array is: " + aUb);
	}
	private void differ(ArrayList<Integer> a, ArrayList<Integer> b)
	{
		ArrayList<Integer> aDb = new ArrayList<Integer>();
		for(int i = 0; i < a.size(); i++)
		{
			for(int j = 0; j < b.size(); j++)
			{
				if(a.get(i) != b.get(j)) 
				{
					aDb.add(a.get(i));
				}
			}
		}
		/*for(int i = 0; i < aDb.size(); i++)
		{
			for(int j = 0; j < aDb.size(); j++)
			{
				if(aDb.get(i) == aDb.get(j))
				{
					aDb.remove(j);
				}
			}
		}*/
		println("The difference between the firts array and the second array is : " + aDb);
	}
	private void intersec(ArrayList<Integer> a, ArrayList<Integer> b)
	{
		ArrayList<Integer> aIb = new ArrayList<Integer>();
		for(int i = 0; i < a.size(); i++)
		{
			for(int j = 0; j < b.size(); j++)
			{
				if(a.get(i) == b.get(j)) 
				{
					aIb.add(a.get(i));
				}
			}
		}
		println("The intersection between the firts array and the second array is : " + aIb);
	}
}