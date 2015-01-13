package crackingthecode;

import java.util.Stack;

public class HuffmanEncoding {

	public static void main(String[] args)
	{

	String input=args[0].toString();
	if(input==null || input.isEmpty() || input.length()<3)
	{
	System.out.println(input);
	}
	else 
	{
	String compressed=compress(input);
	if(compressed.length()==input.length())
	System.out.println(input);
	else
	System.out.println(compressed);
	}

	}

	public static String compress(String input)
	{
	char current=input.charAt(0);
	StringBuffer sb=new StringBuffer();
	int count=1;
	for(int i=1; i<input.length(); i++)
	{
	if(current==input.charAt(i))
	count++;
	else
	{
	sb.append(current);
	sb.append(count);
	current=input.charAt(i);
	count=1;
	}
	}
	sb.append(current);
	sb.append(count);
	return sb.toString();
	} 
}
