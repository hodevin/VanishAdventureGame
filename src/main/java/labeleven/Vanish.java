package labeleven;

import java.util.Scanner;

public class Vanish {

public static void Start(String[] args){

    //Scanner
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);

    //stats
    int money = 20;
    @SuppressWarnings("unused")
    boolean Sword = false;
    @SuppressWarnings("unused")
    boolean Rifle = false;
    int damage = 0;
    double HP = 1;

    //colors
    String ANSI_BLUE = "\u001B[34m";
    String ANSI_RESET = "\u001B[0m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_WHITE = "\u001B[37m";
    String ANSI_RED = "\u001B[31m";
    String ANSI_PURPLE = "\u001B[35m";

    //first question
    System.out.println("Small towns harbor many secrets. It's almost the end of the year and the darkness and fog hovers around.");

    //pause...#1
    try {
      Thread.sleep(3000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("...");
    try {
      Thread.sleep(4000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("\nThe place which used to be lively a couple of years ago is now nearly deserted. ");

    //pause...#2
    try {
      Thread.sleep(3000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("...");
    try {
      Thread.sleep(4000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }

    System.out.println("No one knows where everyone disappeared off to. The old folks say that the forest "
    + "in the outskirts of the town is where people used to go in search of wood and "
    + "never came back. ");

    //pause...#3
    try {
      Thread.sleep(4000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("...");
    try {
      Thread.sleep(6000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }

    System.out.println(ANSI_WHITE + "\n       _T      .,,.    ~--~ ^^" +
      "\n ^^   // \\\\                    ~" +
      "\n      ][O]    ^^      ,-~ ~" +
      "\n   /^^-I_I         _II____" +
      "\n__/_  /   \\\\ ______/ ''   /'\\\\_,__" +
      "\n  | II--'''' \\\\,--:--..,_/,.-{ }," +
      "\n; '/__\\\\,.--';|   |[] .-.| O { _ }" +
      "\n:' |  | []  -|   ''--:.;L,.'\\\\,/" +
      "\n'  |[]|,.--'' '',   ''-,.    |" +
      "\n  ..    ..-''    ;       ''. '" + ANSI_RESET);

    System.out.println("That seems awfully strange, right? "
    + "You are curious about what exactly is going on.");

    //pause...#4
    try {
      Thread.sleep(5000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("...");
    try {
      Thread.sleep(4000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }

    System.out.println("So one day, you decide to go into the woods and explore. You encounter a wooden "
    + "cabin. It appears to be an armory. The sign reads" + ANSI_WHITE + " \"Harold's Armory\"" + ANSI_RESET);

    //pause...#5
    try {
      Thread.sleep(4000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("...");
    try {
      Thread.sleep(6000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }

    System.out.println();
    System.out.println(ANSI_WHITE + "                           (   )" +
      "\n                          (    )" +
      "\n                           (    )" +
      "\n                          (    )" +
      "\n                            )  )" +
      "\n                           (  (" + ANSI_BLUE + "                  /\\" + ANSI_WHITE +
      "\n                            (_)                 " + ANSI_BLUE + "/  \\  /\\" + ANSI_YELLOW +
      "\n                    ________[_]________      " + ANSI_BLUE + "/\\/    \\/\\  \\" +
      "\n           /\\      " + ANSI_YELLOW + "/\\        ______    \\    " + ANSI_BLUE + "/   /\\/\\  /\\/\\ " +
      "\n          /  \\    " + ANSI_YELLOW + "//_\\       \\    /\\    \\  " + ANSI_BLUE + "/\\/\\/    \\/    \\" +
      "\n   /\\    / /\\/\\  " + ANSI_YELLOW + "//___\\       \\__/  \\    \\" + ANSI_BLUE + "/" +
      "\n  /  \\  /\\/    \\" + ANSI_YELLOW + "//_____\\       \\ |[]|     \\" + ANSI_BLUE +
      "\n /\\/\\/\\/       " + ANSI_YELLOW + "//_______\\       \\|__|      \\" + ANSI_BLUE +
      "\n/      \\      " + ANSI_YELLOW + "/XXXXXXXXXX\\  " + ANSI_WHITE + "HAROLD'S ARMORY" + ANSI_YELLOW + " \\" + ANSI_BLUE +
      "\n        \\    " + ANSI_YELLOW + "/_I_II  I__I_\\__________________\\" +
      "\n               I_I|  I__I_____[]_|_[]_____I" +
      "\n               I_II  I__I_____[]_|_[]_____I" +
      "\n               I II__I  I     XXXXXXX     I" +
      "\n            ~~~~~\"   \"~~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
    System.out.println();

    //pause...#6
    try {
      Thread.sleep(3000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("");
    try {
      Thread.sleep(4000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("\n--------------------------------\n");
    System.out.println("That sounds like a good place to get some weapons. Let's go in!");
    System.out.println("Hello! Welcome to Harold's Armory. What would you like to buy?\n"
    + "\n--------------------------------"
    + "\nThe man behind the counter says to you:"
    + "\nWe have the absolute finest weapons in town! Best deals anywhere!"
    + "\nPRESS" + ANSI_BLUE + " 1 " + ANSI_RESET + "TO BUY A SWORD: $12 (+2 damage) | PRESS" + ANSI_BLUE + " 2 " + ANSI_RESET + "FOR A RIFLE: $10 (+3 damage) "
    + "\n--------------------------------");
    int ATB1 = input.nextInt();
    if(ATB1==2){
        money = money - 10;
        System.out.println("You have " + money + " dollars left.");
        Rifle = true;
        damage = damage + 2;
        System.out.println("You have a rifle now."
        + "\n--------------------------------");
    }

    if(ATB1==1){
        money = money - 12;
        System.out.println("You have " + money + " dollars left.");
        Sword = true;
        damage = damage + 3;
        System.out.println("You have a sword now."
        + "\n--------------------------------");

        }

        //pause...#7
        try {
          Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
          // do nothing
        }
        System.out.println("");
        try {
          Thread.sleep(4000);
        }
        catch (InterruptedException ex)
        {
          // do nothing
        }

    System.out.println("After leaving the weapon armory, you walk out the door and begin going deeper into the direction of the forest.");

    //pause...#8
    try {
      Thread.sleep(2000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("");
    try {
      Thread.sleep(4000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }

    //first enemy
    System.out.println("Whoosh...You hear the rustling of the leaves. A vicious looking creature caught you "
    + "just above the eye. You get interrupted by this annoying sight and sound of it soaring through the "
    + "air.");

    //pause...#9
    try {
      Thread.sleep(2000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("...");
    try {
      Thread.sleep(3000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("\nSQUAW! SQUAW! SQUAAAAAAAAW!");
    System.out.println(ANSI_PURPLE + "    ._.                  _.____." +
      "\n   ) \\.              /    .(" +
      "\n   )  |            .'   .(" +
      "\n   ). ).          .'  .(" +
      "\n     ) |.        .'  (" +
      "\n     ). ;      ./  .(" +
      "\n      ) |      )  (" +
      "\n      ).;      :.(" +
      "\n       )|    .|.;" +
      "\n       .^--^./ (." +
      "\n         ;0..0;   \\" +
      "\n        'vv'_.:_.;   " +
      "\n             m  M" +
      "\n" + ANSI_RESET);

      //pause...#10
      try {
        Thread.sleep(3000);
      }
      catch (InterruptedException ex)
      {
        // do nothing
      }
      System.out.println("...");
      try {
        Thread.sleep(4000);
      }
      catch (InterruptedException ex)
      {
        // do nothing
      }

    System.out.println("You have come across your first enemy and if you have more than 1 damage, you may "
    + "be able to defeat it."
    + "\n--------------------------------");
      //pause...
      try {
        Thread.sleep(2000);
      }
      catch (InterruptedException ex)
      {
        // do nothing
      }
      System.out.println("...");
      try {
        Thread.sleep(4000);
      }
      catch (InterruptedException ex)
      {
        // do nothing
      }
    if(damage>1){
        System.out.println("Well done, you defeated your first enemy!"
        + "\n--------------------------------");
    }
    else if(damage<=0){
        System.out.println("You lost the battle."
        + "\n--------------------------------");
        System.exit(0);
    }

    //pause...#11
    try {
      Thread.sleep(2000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("...");
    try {
      Thread.sleep(4000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }

    //first random event
    System.out.println("You find a wounded person lying on the ground. Do you want to help him? Press" + ANSI_BLUE + " 1 " + ANSI_RESET +
      "for " + ANSI_BLUE + " YES " + ANSI_RESET + "or" + ANSI_BLUE + " 2 " + ANSI_RESET + "for" + ANSI_BLUE + " NO \n" + ANSI_RESET +
      "\n Somebody help! I'm badly hurt!! :(" +
      "\n              ,;;;," +
      "\n             ;;;;;;;" +
      "\n          .-'`\\  '/_" +
      "\n        .'   \\ (\"`(_)\"" +
      "\n       / `-,.'\\ \\_/" +
      "\n       \\  \\/\\  `--` " +
      "\n        \\  \\ \\" +
      "\n         / /| |" +
      "\n        /_/ |_|" +
      "\n       ( _\\ ( _\\ ...................... ");

      //pause...#12
    try {
      Thread.sleep(2000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("");
    try {
      Thread.sleep(3000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }

    int FRE1= input.nextInt();
    if(FRE1==1){
        System.out.println("He thanks you and gives you a new sword upgrade (+1 damage).");
        System.out.println("Thank you, young traveler!");
        damage = damage + 1;
        System.out.println("You now have " + damage + " damage.");
    }

    if(FRE1==2){
        System.out.println("You walk by him without helping him, and he tells you that you will regret it "
        + "later."
        + "\n Curse you, you meddling kid!"
        + "\nYou now have " + damage + " damage."
        + "\nYou now have " + money + " dollars left.");
    }

    //pause...#13
    try {
      Thread.sleep(2000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("");
    try {
      Thread.sleep(4000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }

    //first job
    System.out.println("--------------------------------"
    + "\nYou are worried that you are running low on money. You encounter a farm and you get offered a job."
    + "\nThis job could earn you +$5, but it could potentially lower your HP by half as you will get tired."
    + "\nHealth is very important as when you come to fight enemies, HP is a multiplier to add to damage."
    + "\n****YOU HAVE GAINED A NEW PERK****: If you have half HP you will do half damage."
    + "\n--------------------------------"
    + "\nWould you like to take the job? (+5 money -half HP)"
    + "\nPress 1 if YES 2 if NO: ");

    //pause...#14
    try {
      Thread.sleep(2000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("--------------------------------");
    try {
      Thread.sleep(4000);
    }
    catch (InterruptedException ex)
    {
    // do nothing
    }

    int Job1 = input.nextInt();
    if(Job1==1){
        System.out.println("You took the job so you have +5 money but half HP");
        money = money + 5;
        HP = HP - 0.5;
        System.out.println("You now have " + money + " dollars left"
        + "\nYou now have " + damage + " damage"
        + "\nYou now have " + HP + " HP");
    }

    if(Job1==2){
        System.out.println("You didnt take the job so you did not lose or gain anything."
        + "\nYou now have " + money + " dollars left."
        + "\nYou now have " + damage + " damage."
        + "\nYou now have " + HP + " HP.");
    }

    //pause...#15
    try {
      Thread.sleep(3000);
    }
    catch (InterruptedException ex)
    {
      // do nothing
    }
    System.out.println("--------------------------------");
    try {
      Thread.sleep(5000);
    }
    catch (InterruptedException ex)
    {
    // do nothing
    }

    //second target
    System.out.println("You see footprints on the wet ground and start following it. You encounter a mysterious cave and hear roaring sounds."
      + "It comes out of the cave and spots you inside.");

   //pause...#16
    try {
      Thread.sleep(2000);
    }
    catch (InterruptedException ex)
    {
    // do nothing
    }
    System.out.println("--------------------------------");
    try {
      Thread.sleep(4000);
    }
    catch (InterruptedException ex)
    {
    // do nothing
    }

    System.out.println("\nOOGA OOGA OOGA OOOOOOGA!!");
    System.out.println(ANSI_RED + "                   (    )" +
      "\n                  ((((()))" +
      "\n                  |o\\ /o)|" +
      "\n                  ( (  _')" +
      "\n                   (._.  /\\__" +
      "\n                  ,\\___,/ '  ')" +
      "\n    '.,_,,       (  .- .   .    )" +
      "\n     \\   \\\\     ( '        )(    )" +
      "\n      \\   \\\\    \\.  _.__ ____( .  |" +
      "\n       \\  /\\\\   .(   .'  /\\  '.  )" +
      "\n        \\(  \\\\.-' ( /    \\/    \\)" +
      "\n         '  ()) _'.-|/\\/\\/\\/\\/\\|" +
      "\n             '\\\\ .( |\\/\\/\\/\\/\\/|" +
      "\n               '((  \\    /\\    /" +
      "\n               ((((  '.__\\/__.')" +
      "\n                ((,) /   ((()   )" +
      "\n                  _//.   ((() .\"" +
      "\n                         ((  )\n" + ANSI_RESET);
    System.out.println("--------------------------------"
    + "\nIf you have 2 damage or more you will win unless your HP is too low.");
    if(damage*HP>=2){
        System.out.println("Wow! Good job! You cleared the second enemy. But the mystery remains unfold. "
        + "\nYou hear crying from inside the cave. You go in and see dead bodies of people lying on one side"
        + "\nand in the corner you see a bunch of people trapped in a cocoon weaved by the enormous monster. "
        + "\nYou help them out and they tell you about how the monster had hold them in captive and would "
        + "\neat each one of them as its meal everyday. Although you couldn't save everyone, you should be "
        + "\nglad about the fact that you resolved the mystery and now the town can be a happy place again!");

        //pause...#17
         try {
           Thread.sleep(2000);
         }
         catch (InterruptedException ex)
         {
         // do nothing
         }
         System.out.println("--------------------------------");
         try {
           Thread.sleep(4000);
         }
         catch (InterruptedException ex)
         {
         // do nothing
         }

        System.out.println("\n--------------------------------" + ANSI_RED +
          "\n┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼" +
          "\n███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀" +
          "\n██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼" +
          "\n██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀" +
          "\n██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼" +
          "\n███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄" +
          "\n┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼" +
          "\n███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼" +
          "\n██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼" +
          "\n██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼" +
          "\n██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼" +
          "\n███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄" +
          "\n┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼" + ANSI_RESET +
          "\n              YOU WIN ! !            ");

    }

    if(damage*HP<2){
        System.out.println("You lost because you did not have enough damage or your HP was too low." + ANSI_WHITE +
          "\n┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼" +
          "\n███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀" +
          "\n██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼" +
          "\n██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀" +
          "\n██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼" +
          "\n███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄" +
          "\n┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼" +
          "\n███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼" +
          "\n██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼" +
          "\n██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼" +
          "\n██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼" +
          "\n███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄" +
          "\n┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼" +
          "\n┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼" +
          "\n┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼" +
          "\n┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼" +
          "\n┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼" +
          "\n┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼" +
          "\n┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼" +
          "\n┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼" +
          "\n┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼" +
          "\n┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼" +
          "\n┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼" +
          "\n┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼" + ANSI_RESET);
        System.exit(0);
    }

    }
}
