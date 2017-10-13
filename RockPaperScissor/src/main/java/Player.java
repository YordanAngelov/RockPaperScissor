import java.util.Scanner;

public class Player {
    public String name;
    public int choice;
    public int gameMode;

    Scanner user_input = new Scanner(System.in);

    public void chooseGameMode(){
        System.out.println("Choose play mode:");
        System.out.println("1. Player vs Computer");
        System.out.println("2. Player vs Player");
        this.gameMode=user_input.nextInt();
    }

    public int getGameMode(){
        return gameMode;
    }

    public void setName(){
        System.out.println("Please enter player name:");
        this.name = user_input.next();
    }

    public void setChoice(String playerName){
        System.out.println(playerName + ", please select your choice by writing out the number: ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        this.choice = user_input.nextInt();
    }

    public String getName(){
        return name;
    }

    public int getChoice(){
        return choice;
    }
}
