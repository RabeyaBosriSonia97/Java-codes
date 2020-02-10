
			
			####1
	public class area {
	public static void main(String []args{
			int height = 10;
			int width = 20;
			int area = height * width;
			int perimeter = 2*(height*width);
			System.out.println( "The area of the rectangle is " + area);
			System.out.println( "The perimeter of the rectangle is " + perimeter);
		}
		}
		#####2
	public class vat{
	public static void main(String []args{
		int amount = 50;
		double vat = 15 * 100 / amount; 
		System.out.println(vat);
		}
		}	
		
		##### 3
	public class EvenOdd{
	public static void main(String []args{	
		
		int givenNumber = 8;
		
		if(givenNumber % 2 == 0) 
		{
			System.out.println("Even Number");
		}
		else 
		{
			System.out.println("Odd Number");
		}
		}
		}
		
		######4


	c
		
		int numberOne = 10;
		int numberTwo = 20;
		int numberThree = 30;
		
		
		if(numberOne > numberTwo && numberOne > numberThree) 
		{
			System.out.println("Number One is greater");
		}else if(numberTwo > numberOne && numberTwo > numberThree) 
		{
			System.out.println("Number Two is greater");
		}else 
		{
			System.out.println("Number Three is greater");
		}

			}
			}









		
		
		####5
	public class Number{
	public static void main(String []args{	
		
	
		for(int i=10; i<100; i++) 
		{
			if(i % 2 == 0) 
			{
				
			}
			else 
			{
				System.out.println("Number is Odd " + i);
			}
		}
		}
		}
		####6
 	public class Array{
	public static void main(String []args{	
		
		
		int[] myArray = {10, 20, 30,40, 30};
	
		
		for(int i=0; i< 5; i++) 
		{
			if(myArray[i] == 30) 
			{
				System.out.println("Found Value 30");
			}
		}
		}
			}
 ######7
	public class Codes{
	public static void main(String []args{	
		
		
		for(int i=0; i<4; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		for(int i=3; i > 0; i--) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
		

		int alphabet = 65; //A
		
		for(int i=0; i<4; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print((char) alphabet);
				alphabet = alphabet+1;
			}
			System.out.print("\n");
		}
			
	   }
}


