
public class WeekOneCodeAssign {

	public static void main(String[] args) {	
		
		//item prices
		double magicCard = 350;
		double videoGame = 60;
		
		//wallet
		double walletOne = 10000000;
		double walletTwo = 5;
		
		//Number of Friends
		int friendOne = 2;
		int friendTwo = 1;
		
		//Age
		int firstPersonAge = 57;
		int secondPersonAge = 21;
		
		//First Name
		String firstNameOne = "Mallory";
		String firstNameTwo = "Fernando";
		
		//Last Name
		String lastNameOne = "Anderson";
		String lastNameTwo = "Anderson";
		
		//Middle initial
		char mdInitialOne = 'L';
		char midInitialTwo = 'J';
		
		
		
		double hasNoMoney = (magicCard + videoGame) - walletTwo;
		double hasMoney = walletOne - hasNoMoney;
		
		int nmbFriendsOne = friendOne * firstPersonAge;
		int nmbFriendsTwo = friendTwo * secondPersonAge;
		
		
		String fullNameOne = firstNameOne + " " + mdInitialOne + " " + lastNameOne;
		String fullNameTwo	= firstNameTwo + " " + midInitialTwo + " " + lastNameTwo;	
		
		System.out.println(fullNameOne + " is " + fullNameTwo + "'s mother, for his birthday he wanted to buy himself a gift. A magic card for $" + magicCard + " and a video game for $" + videoGame +", not realizing that his debit card only had $" + walletTwo + " he with went under $" + hasNoMoney + ". His mother received a text message about his overdraft; she paid off his debt, not putting a dent on her account. Honestly, she still had $" + hasMoney + " just in ONE account, yes she had more. " + firstNameTwo + " was going away for college. " + firstNameOne + " decided to invite her friends " + nmbFriendsOne + " and her son's friends " + nmbFriendsTwo + ". He was happy to have the party showing off his gifts. During college, he got himself a part-time job paying his mother $" +hasNoMoney + " back. He thanked his mother for her help and asked her to no longer bail him out because he wanted to make a living on his own.");	

	}

}
