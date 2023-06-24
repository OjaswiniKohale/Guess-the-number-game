import java.util.Random;
import java.util.Scanner;

class Game
{
    int noOfGuesses=1;
    int userInp;
    int value;

    Game()
    {
        Random r = new Random();
        value=r.nextInt(100);
    }
    
    void takeUserInp()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInp = sc.nextInt();
    }

    int getGuess()
    {
        return noOfGuesses;
    }

    void setGuess()
    {
        noOfGuesses=noOfGuesses+1;
    }

}

public class GuessTheNo {
    public static void main(String[] args)
    {
        Game g1 = new Game();
        System.out.println("The number to be found is in between 1 to 100 ");
        g1.takeUserInp();

        while(true)
        {

        if(g1.userInp>g1.value)
        {
            System.out.println("The number is smaller than your input");
            g1.takeUserInp();
            g1.setGuess();
        }
        else if(g1.userInp<g1.value)
        {
            System.out.println("The number is greater than your input");
            g1.takeUserInp();
            g1.setGuess();
        }
        else
        {
            System.out.println("You got the number!!");
            System.out.println("Your score is: "+g1.noOfGuesses);
            System.out.println("The ans is: "+g1.value);
            System.exit(0);
        }
    }
    }
}
