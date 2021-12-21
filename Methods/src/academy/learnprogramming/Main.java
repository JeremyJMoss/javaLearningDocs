package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println("Your final score was " + calculateScore(true, 800, 5, 100));

        System.out.println("Your final score was " + calculateScore(true, 10000, 8, 200));

        displayHighScorePosition("Player 1", calculateHighScorePosition(1500));

        displayHighScorePosition("Player 2", calculateHighScorePosition(900));

        displayHighScorePosition("Player 3", calculateHighScorePosition(400));

        displayHighScorePosition("Player 4", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
            return -1;
    }

    public static void displayHighScorePosition(String playerName, int positionOnTable) {
        System.out.println(playerName + " managed to get into position " + positionOnTable + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500){
            return 2;
        }
        else if (playerScore >= 100) {
            return 3;
        }
        else {
            return 4;
        }
    }
}
