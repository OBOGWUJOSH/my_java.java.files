import java.util.Scanner;
  public class Nokia {
    public static void main(String []arg) {
	

	String phonebook = """
    
	    1 ->Search
	    2 ->Service Nos. 1
	    3 ->Add name
	    4 ->Erase
	    5 ->Edit
	    6 ->Assign tone
	    7 ->Send b’card
	    8 ->Options
	    9 ->Speed dials
	    10 ->Voice tags
	""";
		
		String options = """ 
		1 ->Type of view
		2 ->Memory status
		""";


 

	String messages = """

	    1 ->Write messages
	    2 ->Inbox
	    3 ->Outbox
	    4 ->Picture messages
	    5 ->Templates
	    6 ->Smileys
	    7 ->Message settings
	    8 ->Info service
	    9 ->Voice mailbox number
	    10 ->Service command editor
	    """;

		String messageSettings1 = """
		1 ->Set 1^^2

			1 ->Message centre number
			2 ->Messages sent as
			3 ->Message validity
			""";
		String MessageSettings2 = """
		2 ->Common^^3

			1 ->Delivery reports
			2 ->Reply via same centre
			3 ->Character support
			""";




	//String Chat = """

	   // """;


	//String Callregister = """

	    //1 ->Missed calls
	    //2 ->Received calls
	    //3 ->Dialled numbers
	    //4 ->Erase recent call lists
	    //5 ->Show call duration Show Call Duration
	    //""";
			//String call duration = """
			//1 ->Last call duration
			//2 ->All calls’ duration
			//3 ->Received calls’ duration
			//4 ->Dialled calls’ duration
			//5 ->Clear timers
	    		//""";
 
	    //6 ->String Show call costs = """

			//1 ->Last call cost
			//2 ->All calls’ cost
			//3 ->Clear counters
			//""";


	    //7 ->String Call cost settings = """

			//1 ->Call cost limit
			//2 ->Show costs in
			//""";
			
	    //8 ->String Prepaid credit = """
		//""";

		

	 //String Tones = """

	    //1 Ringing tone
	    //2 Ringing volume
	    //3 Incoming call alert
	    //4 Composer
	    //5 Message alert tone
	    //6 Keypad tones
	    //7 Warning and game tones
	    //8 Vibrating alert
	    //9 Screen saver	
	//""";


	 //String Settings = """

	    //1 String Call settings = """
		//1. Automatic redial
		//2. Speed dialling
		//3. Call waiting options
		//4. Own number sending
		//5. Phone line in use
		//6. Automatic answer 1

		//""";

	    //2 String Phone settings = """

		//1. Language
		//2. Cell info display
		//3. Welcome note
		//4. Network selection
		//5. Lights 2
		//6. Confirm SIM service actions

		//""";

	    //3 String Security settings = """

	        //1. PIN code request
	        //2. Call barring service
	        //3. Fixed dialling
	        //4. Closed user group							        //5. Phone security
	        //6. Change access codes

		//""";


	    //4. Restore factory settings

		//""";

	//""";


	// String Call divert = """


	//""";


	// String Games = """

	
	//""";


	//String Calculator = """


	//""";


	// String Reminders = """
	

	//""";

	// String Clock = """

	//1. Alarm clock
	//2. Clock settings
	//3. Date setting
	//4. Stopwatch
	//5. Countdown timer
	//6. Auto update of date and time


	//""";


	// String Profiles = """

	
	//""";


	// String SIM services^^3 = """
	
	
	//""";
	

	System.out.println(phonebook);
	Scanner KeyboardInput = new Scanner (System.in);
	int userInput = KeyboardInput.nextInt();


	
	
	switch (userInput) {
		case 1-> {
			System.out.println("ponebook");

			System.out.print(phonebook);
			KeyboardInput = new Scanner(System.in);
			int Input = KeyboardInput.nextInt();
				
				switch (enInput) {
					case 1->{
						System.out.println("search");

						System.out.println(EenglishPrompt);
						KeyboardInput = new Scanner(System.in);
						int spengEnglish = KeyboardInput.nextInt();
					
					case 2->{
						System.out.println("Add name");

						System.out.println(EenglishPrompt);
						KeyboardInput = new Scanner(System.in);
						int spengEnglish = KeyboardInput.nextInt();
	
						}
					}
			}
		}




















}
}






                         