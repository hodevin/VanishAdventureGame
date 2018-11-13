package labeleven;

import java.util.Scanner;

public class Adventure{

public static void main(String[] args) {

//colors
String ANSI_BLUE = "\u001B[34m";
String ANSI_RESET = "\u001B[0m";
String ANSI_YELLOW = "\u001B[33m";
String ANSI_WHITE = "\u001B[37m";

//Scanner
@SuppressWarnings("resource")
Scanner input = new Scanner(System.in);

System.out.println("                                ♦♢" + ANSI_BLUE + " WELCOME TO " + ANSI_RESET + "♦♢ " +
  "\n " + ANSI_BLUE +
  "\n                ██╗   ██╗ █████╗ ███╗   ██╗██╗███████╗██╗  ██╗" +
  "\n                ██║   ██║██╔══██╗████╗  ██║██║██╔════╝██║  ██║" +
  "\n                ██║   ██║███████║██╔██╗ ██║██║███████╗███████║" +
  "\n                ╚██╗ ██╔╝██╔══██║██║╚██╗██║██║╚════██║██╔══██║" +
  "\n                 ╚████╔╝ ██║  ██║██║ ╚████║██║███████║██║  ██║" +
  "\n                  ╚═══╝  ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝╚══════╝╚═╝  ╚═╝" + ANSI_RESET
  + "\n                       --------------------------------");

		// Print the first part
    System.out.println(ANSI_RESET
            + "\nHOW TO PLAY:\n"
            + "\nIn this game, you will prompted to select from options \nwhenever you encounter something."
            + "There are shops where you can buy weapons \nand upgrade your damage level."
            + "You begin the game with $20. The objective of"
            + "\nthe game is to play through the different scenarios that you encounter.\n"
            + ANSI_BLUE + "\n                                 GOOD LUCK!!\n"
            + ANSI_RESET + "\n                       --------------------------------");

		// Delays the output of the print line statements
		try {
			Thread.sleep(8000);
		}
		catch (InterruptedException ex)
		{
			// do nothing
		}

		// Print second part
    System.out.println("Hello Player! What is your name? ");

    //

    String name = input.next();
    System.out.println("--------------------------------");

    System.out.println("Hello " + ANSI_BLUE + name + ANSI_RESET + "! would you like to start" + ANSI_BLUE + " VANISH?\n"
      + ANSI_RESET + "\nEnter" + ANSI_BLUE + " 1 " + ANSI_RESET + "to start; Enter" + ANSI_BLUE + " anything else" + ANSI_RESET + " to exit.");
    int Wantstostart = input.nextInt();
    if(Wantstostart==1){
        System.out.println("Ok, VANISH will now start! Let's begin."
        + "\n--------------------------------");
        Vanish.Start(null);
    }

    else {
        System.out.println("VANISH will now exit. Thanks for playing!");
        System.exit(0);
    }
  }
}
