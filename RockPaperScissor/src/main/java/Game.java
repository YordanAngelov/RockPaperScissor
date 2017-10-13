public class Game {
    public int result;

    /** Specifying the different combinations
     *          Choice = 1 is rock
     *          Choice = 2 is paper
     *          Choice = 3 is scissors**/

    /** Legend: Result = 0 is a win
     *          Result = 1 is a loss
     *          Result = 2 is a draw**/



    public int playGame(int playerChoice, int computerChoice, boolean computer) {
        if (playerChoice == 1) {
            if (computerChoice == 1) {
                result = 2;
            }
            if (computerChoice == 2) {
                result = 1;
            }
            if (computerChoice == 3) {
                result = 0;
            }
        }
        if (playerChoice == 2) {
            if (computerChoice == 1) {
                result = 0;
            }
            if (computerChoice == 2) {
                result = 2;
            }
            if (computerChoice == 3) {
                result = 1;
            }
        }
        if (playerChoice == 3)
        {
            if (computerChoice == 1) {
                result = 0;
            }
            if (computerChoice == 2) {
                result = 1;
            }
            if (computerChoice == 3) {
                result = 2;
            }
        }
        return result;
    }
}
