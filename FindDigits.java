package hackerrank;

import java.util.Scanner;

public class FindDigits {

	public static void main() {
		// TODO Auto-generated method stub

      
       // int inputNumber=Integer.parseInt(args[0]);
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine())
            {
        Integer inputNumber=in.nextInt();
            if(inputNumber<10)
                continue;
        String inputString=inputNumber.toString();
        int count=0;
        int digit=0;
        for(int i=0;i<inputString.length();i++)
            {
                
            char c=inputString.charAt(i);
            String s=""+c;
            digit=Integer.parseInt(s);
             
                if(digit!=0 && inputNumber%digit==0)
                {
                    count++;
                }
             }
        System.out.println(count);
        }
       

	}

}
