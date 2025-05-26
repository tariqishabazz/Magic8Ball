package Magic8Ball;

import java.util.*;
public class Magic8Ball 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		String userQuestion;
		String chosenFortune;
		String[] BallResponses = { "Outlook good", "Ask again later", "Yes - definitely", "Concentrate and ask again", "Reply hazy, try again",
				"My reply is no", "Very certain, you have to believe", "Signs point to yes", "Very doubtful", "Yes", "No", "You may rely on it" ,"Cannot predict now",
				"Uncertain", "My sources say no", "As I see it, yes", "Most likely", "Outlook not so good", "Signs point to yes", "Without a doubt" }; 
		
		//game instructions
		System.out.println("Hey! I am going to tell you the outcome of a response you enter. Whether it's a question regarding a goal"
				+ ", or you are just curious about your future. If you would like to quit, type quit");
		
		System.out.println("You may not like the outcome, but hey, I don't make the rules, I just enforce them.\n");
	
		//loop to continue prompting
		do
		{
			System.out.println("Now, what is your question? >>");
			userQuestion = input.nextLine();
			
			System.out.println();
			
			//quits if user types quit and doesn't offer fortune
			if(userQuestion.equals("quit"))
			{
				break;
			}
			
			//set the chosenFortune variable to a random response in the array
			chosenFortune = BallResponses[random.nextInt(BallResponses.length)];
						
			//print out response
			System.out.println("The Magic 8 Ball says: " + chosenFortune);
			
		}
		while(!userQuestion.equals("quit"));
		
		input.close();
	}
}


/*

Magic 8 Ball is a toy developed in the 1950s and used for fortune-telling or advice-seeking. 
A player asks or thinks of a yes-or-no question such as Will I be rich someday? 
The player then turns the ball over to see one of 20 randomly chosen responses—for example, 
It is certain or Very doubtful. 

*/
