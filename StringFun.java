import java.util.Scanner;
public class StringFun {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String original;
		String command;
		String output = "";
	
		
		
		System.out.println("Enter the string to be manipulated");
		original = input.nextLine();
		
		restartLoop:
		while (true) { 
			System.out.println("Enter your command (quit, print reverse, replace all, replace single, remove)");
			Scanner comm = new Scanner(System.in); 
			command = comm.nextLine();
				if(command.equalsIgnoreCase("print reverse"))
				{
					for (int i = original.length() - 1; i >= 0; i--)
					{
					System.out.print(original.charAt(i));
					}
				System.out.print("\n");	
				}
				if(command.equalsIgnoreCase("replace all"))
				{
					System.out.println("Enter the character to replace");
					char toReplace = input.next().charAt(0);
					int k = 0;
					int count = 0;
						while (k < original.length())
						{
							if(original.charAt(k) == toReplace)
							{
								count++;
							}	
						k++;	
						}
						if(count == 0)
						{		
							System.out.println("Error, you are trying to manipulate a letter that does not exist");
							continue restartLoop;
						}	
					System.out.println("Enter the new character");
					char newChar = input.next().charAt(0);
					int i = 0;
						while (i < original.length())
						{
							if (original.charAt(i) == toReplace){
								original = original.substring(0, i) + newChar + original.substring(i + 1, original.length());
							}
							i++;
						}
					System.out.println("The new sentence is: " + original);		
				}
				if(command.equalsIgnoreCase("replace single"))
				{
					System.out.println("Enter the character to replace");
					char toReplace = input.next().charAt(0);
					int k = 0;
					int count = 0;
						while (k < original.length())
						{
							if(original.charAt(k) == toReplace)
							{
								count++;
							}	
						k++;	
						}
						if(count == 0)
						{		
							System.out.println("Error, you are trying to manipulate a letter that does not exist");
							continue restartLoop;
						}
					System.out.println("Enter the new character");
					char newChar = input.next().charAt(0);
					System.out.println("Which " + newChar + " would you like to replace?");
					int whichOne = input.nextInt();
					count = 0;
					int i = 0;
						while (i < original.length())
						{	
							if (original.charAt(i) == toReplace)
							{
								count++;
									if (count == whichOne)
									{
										original = original.substring(0, i) + newChar + original.substring(i + 1, original.length());
									}
							}
						i++;	
						}
					System.out.println("The new sentence is: " + original);
				}
				if(command.equalsIgnoreCase("remove"))
				{
					System.out.println("Enter the character to remove");
					char toRemove = input.next().charAt(0);
					int k = 0;
					int count = 0;
						while (k < original.length())
						{
							if(original.charAt(k) == toRemove)
							{
								count++;
							}	
						k++;	
						}
						if(count == 0)
						{		
							System.out.println("Error, you are trying to manipulate a letter that does not exist");
							continue restartLoop;
						}
					int i = original.length() - 1;
						while (i > 0)
						{
							if (original.charAt(i) == toRemove){
								original = original.substring(0, i) + original.substring(i + 1, original.length());
							}
						i--;
						}
					System.out.println("The new sentence is: " + original);
				}
				if(command.equalsIgnoreCase("quit"))
				{
					System.exit(0);
				} 
		}	

	}
}
