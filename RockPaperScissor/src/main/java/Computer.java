import java.util.Random;


public class Computer {
    public int choice;

    /** Random Number Generator **/
    public void getRandomChoice()
    {
        int min = 1;
        int max = 3;
        Random r = new Random();
        this.choice = r.nextInt((max - min) + 1) + min;
    }

    public int getChoice(){
        return choice;
    }

    public void displayChoice(){
        switch(choice){
            case 1: System.out.println("The computer chose Rock!");
                break;
            case 2: System.out.println("The computer chose Paper!");
                break;
            case 3: System.out.println("The computer chose Scissors!");
                break;
            default: System.out.println("The computer was too lazy to choose an option.");
        }
    }
}
