import java.util.Scanner;

public class divingRightin
	{
		static String name;
		static int currentAge, birthYear, yearCounter;

		public static void main(String[] args)
			{
				greetUser();
				describeAge();
				generateDogAge();
				generateNumberOfLeapYears();
			}

		public static void greetUser()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello! What is your name?");
				name = userInput.nextLine();
				System.out.println("Alright, " + name + ", what is your current age?");
				currentAge = userInput.nextInt();
				if (currentAge <= 16 && currentAge > 0)
					{
						System.out.println("Wow, that's young!");
					} 
				else if (currentAge == 17 && currentAge > 0)
					{
						System.out.println("The guy who coded this is that age also.");
					} 
				else if (currentAge >= 18 && currentAge > 0)
					{
						System.out.println("That's a pretty good age, in my opinion.");
					} 
				else
					{
						System.out.println("That's not an age. Your punishment for this heinous crime is that you have to restart the program.");
					}
				System.out.println("What year were you born in?");
				birthYear = userInput.nextInt();
			}

		public static void describeAge()
			{
				int j = 0;
				yearCounter = birthYear;
				for (int i = 0; i < currentAge; i++)
					{
						if (i == 1)
							{
								System.out.println("In " + yearCounter + ", you were " + j + " year old.");
								yearCounter++;
								j++;
							} 
						else
							{
								System.out.println("In " + yearCounter + ", you were " + j + " years old.");
								yearCounter++;
								j++;
							}
					}
			}

		public static void generateDogAge()
			{
				int dogAge = currentAge * 7;
				System.out.println("Your age in dog years is " + dogAge + ".");
			}
		public static void generateNumberOfLeapYears()
			{
				
			}
	}
