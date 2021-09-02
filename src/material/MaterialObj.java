package material;

import java.util.Scanner;

public class MaterialObj {

	public static void main(String[] args) {
		/*(1.) write a program to print the pattern given below
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5*/

//
//		for (int x=1;x<=5;x++) {
//			for(int y=1;y<=x;y++) {
//				System.out.print(y+" ");// print so that it makes the pattern like this
//			}
//			System.out.println();
//			
//		}
//
//
//	}
	
	/*(2.) Write a program to print out Left triangle star pattern
	 * 
	 * *
	 * * *
	 * * * *
	 * * * * *
	 */
		/*
	//x for rows, y for columns and row denotes the number of rows to print
	int x, y, row=5 ;  
	//outer loop for rows
	for(x=0; x<row; x++) {
		//inner loop for columns
		for (y=0; y<=x; y++) {
			//to print out stars
			System.out.print("* ");
		}
		//cursor goes to new line after printing each line
		System.out.println( );
	}

	}
	*/
	
//	(3.)	Write a program to print the pattern given below (Right Triangle Star Pattern)
	/*	
		int x,y,row=5;
		//outer loop to handle number of columns
		for(x=0;x<row;x++) {
//			for inner loop space handling
			for(y=2*(row-x); y>=0; y--) {
				//printing space
				System.out.print(" ");
			}
			//inner loop to handle number of columns
			for(y=0;y<=x;y++) {
				//printing stars
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	*/
		
//	(4.)	Write a program to print the pattern given below (Pyramid Star Pattern)
		
		//x for rows,y for columns and row denotes the number of rows to print
	/*	
		int x,y,row=5;
		//outer loop for rows
		for(x=0;x<row;x++) {
			//inner loop for space
			for(y=row-x;y>1;y--) {
				//to print space between two stars
				System.out.print(" ");
			}
			//inner loop for columns
			for(y=0;y<=x;y++) {
				//to print stars
				System.out.print("* ");
			}
				
			//cursor goes to the new line after printing each line
			System.out.println();
						
		}
			
		}
		*/
		
//		(5.)print reverse of pyramid
		/*
		int x,y,row=5;
		for(x=1;x<=row;x++) {
			for(y=1;y<x;y++) {
				System.out.print(" ");
			}
			for(y=x;y<=row;y++) {
				System.out.print(y+" ");
			}
			System.out.println();
				
			}
		}
		*/
	
//	(6.)	pattern number with mirror image
		/*
		int x,y,row=5;
//	printing the pattern
		for(x=1;x<=row;x++) {
			for(y=1;y<x;y++) {
				System.out.print(" ");
			}
			for(y=x;y<=row;y++) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
//	Printing the reverse pattern
		for(x=row-1;x>=1;x-- ) {
		for(y=1;y<x;y++) {
			System.out.print(" ");
		}
		for(y=x;y<=row;y++) {
			System.out.print(y+" ");
		}
		System.out.println();
		
		}
	}
	*/
//(7.)	Number pattern
		/*
		int x,y,num,row=5;
		for(x=1;x<=row;x++) {
			num=1;
			for(y=0;y<x;y++) {
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}
	*/
//		Numbers without reassigning
		/*
		int x,y,num=1,row=5;
		
		for(x=0;x<row;x++) {
			for(y=0;y<=x;y++) {
				System.out.print(num+ " ");
				num=num+1;
			}
			System.out.println();
		}
	}
	*/
		
//		Print christmas tree
		
		int height=5;
		int width=5;
		int space=width*5;
		int x=1;
		//code to print upper part of the tree
		/*
		for(int a=1;a<=height;a++) {
			for(int i=x;i<=width;i++) {
				for(int j=space;j>=i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			x=x+2;
			width=width+2;
		}
		//print branch of Christmas tree
		for(int i=1;i<=4;i++) {
			for(int j=space-3;j>=1;j--) {
				System.out.print(" ");
			} 
			for (int k=1;k<=4;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	*/
		
//		Print Fibonacci series
		/*
		int a=0, b=1, c, i, count=10;
		// to print 0 to 1
//		System.out.print(a+" "+b);
		//loop starts from 2. We have already printed 0 and 1
		for(i=2;i<count;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		}
		*/
		
//			Reverse a String
		/*
		StringBuffer a=new StringBuffer("Software Testing Material");
		System.out.println(a.reverse());
	}
		*/
		
//		Another method
		/*
		String a="Software testing material";
		StringBuilder b=new StringBuilder();
		b.append(a);
		b=b.reverse();
		for(int i=0;i<b.length();i++) {
			System.out.print(b.charAt(i));
		}
	}
	*/
//	Example to reverse string in Java by using for loop (without reverse())
		/*
		String s="idiot";
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a string :");
		s=scan.nextLine();
		System.out.print("After reverse string is : ");
		for(int i=s.length();i>0;i--) {
			System.out.print(s.charAt(i-1));
		}
		*/
		
//	count the total number of characters in a string
		
		String s="My name is Ahmed";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ')
				count++;
				
		}
		System.out.println(count);
		
		
		
		
		
		
		
//		Find The Largest Value From The Given Array.
		/*
		int [] arr= {18,3,15,9,17,4,23,2};
		int val=arr[0];
		for (int i=0; i<arr.length;i++) {
			if(arr[i]>val) {
				val=arr[i];
			}
		}
		System.out.println("Largest value in the given array "+val);
		
	}
*/
//		display all the prime numbers between 1 and 100
		/*
		int i=0;
		int num=0;
		String primeNumbers="";
		
		for(i=0;i<=100;i++) {
			int counter=0;
			for(num=i;num>=1;num--) {
				if (i%num==0) {
					counter=counter+1;
							
				}
			}
			if (counter==2) {
				primeNumbers=primeNumbers+i+"";
			}
		}
		System.out.println("prime numbers from 1-100 are :");
		System.out.println(primeNumbers);
	}
*/
//		display all the prime numbers between 1 and n (n is the number, get the input from user)
		/*
		Scanner scanner=new Scanner(System.in);
		int i=0;
		int num=0;
		String primeNumbers="";
		System.out.println("Enter the value of n :");
		int n=scanner.nextInt();
		scanner.close();
		for( i=0;i<=n;i++) {
			int counter=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					counter=counter+1;
				}
			}
			if(counter==2) {
				primeNumbers=primeNumbers+i+" ";
			}
			System.out.println("Prime numbers from 1 to n are :");
			System.out.println(primeNumbers);
		}
		}
		*/
//		find the given number is a prime number or not by getting input from the user
		/*
		int i,j,flag=0;
		System.out.println("Ener any number to verify whether it is a prime number or not :");
		
		Scanner s=new Scanner(System.in);
		j=s.nextInt();
		for(i=2;i<j;i++) {
			if (j%i==0){
				flag=0;
				break;
			}
			else {
				flag=1;
			}
				}
		if(flag==1) {
			System.out.println(j+" is a prime number.");
		}
		else {
			System.out.println(j+" is not a prime number.");
		}
			}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


