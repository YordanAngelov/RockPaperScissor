public class App {
    public static void main(String[] args) {

        Game rps = new Game();
        Player main = new Player();
        Player other = new Player();
        Computer comp = new Computer();
        boolean draw = true;
        int result;

        /** Legend: Result = 0 is a win
         *          Result = 1 is a loss
         *          Result = 2 is a draw
         *
         *          Game Mode = 1 is Player vs Computer
         *          Game Mode = 2 is Player vs Player**/

        /** The draw needs to be in the App because you set the choice here. You would not be able to
         * set your choice in Game because it would not have the same Player object.**/

        main.chooseGameMode();
        switch(main.getGameMode()){
            case 1:
                main.setName();
                while(draw) {
                    main.setChoice(main.getName());
                    comp.getRandomChoice();
                    comp.displayChoice();
                    result = rps.playGame(main.getChoice(), comp.getChoice(),true);
                    if (result == 0) {
                        System.out.println("The winner is " + main.getName());
                        draw = false;
                    }
                    if (result == 1) {
                        System.out.println("The winner is Computer!");
                        draw = false;
                    }
                    if (result == 2) {
                        System.out.println("It's a draw! Go again.");
                        draw = true;  /** the line is unnecessary, but it acts as a reminder/clarifies it**/
                    }
                }
                break;

            case 2:
                main.setName();
                other.setName();
                while(draw) {
                    main.setChoice(main.getName());
                    other.setChoice(other.getName());
                    result = rps.playGame(main.getChoice(), other.getChoice(),false);
                    if (result == 0) {
                        System.out.println("The winner is " + main.getName());
                        draw = false;
                    }
                    if (result == 1) {
                        System.out.println("The winner is " + other.getName());
                        draw = false;
                    }
                    if (result == 2) {
                        System.out.println("It's a draw! Go again.");
                        draw = true;  /** the line is unnecessary, but it acts as a reminder/clarifies it**/
                    }
                }
                break;

            default:
                System.out.println("Invalid game mode has been chosen. Restart game."); /** Could enter a variable that loops if invalid game mode has been chosen**/
                break;
        }

    }
}
