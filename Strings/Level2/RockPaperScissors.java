import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); 
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    public static String findWinner(String userChoice, String compChoice) {
        if (userChoice.equalsIgnoreCase(compChoice)) return "Draw";

        if (userChoice.equalsIgnoreCase("Rock")) {
            return (compChoice.equals("Scissors")) ? "User" : "Computer";
        } else if (userChoice.equalsIgnoreCase("Paper")) {
            return (compChoice.equals("Rock")) ? "User" : "Computer";
        } else if (userChoice.equalsIgnoreCase("Scissors")) {
            return (compChoice.equals("Paper")) ? "User" : "Computer";
        }
        return "Invalid";
    }


    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        String[][] stats = new String[2][3]; 

        double userWinPercent = (userWins * 100.0) / totalGames;
        double compWinPercent = (compWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userWinPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f%%", compWinPercent);

        return stats;
    }

    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s %-15s %-15s %-10s\n", "Game", "User Choice", "Computer Choice", "Winner");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-10d %-15s %-15s %-10s\n", 
                    (i + 1), gameResults[i][0], gameResults[i][1], gameResults[i][2]);
        }

        System.out.println("\nOverall Stats:");
        System.out.printf("%-10s %-10s %-10s\n", "Player", "Wins", "Win %");
        for (String[] row : stats) {
            System.out.printf("%-10s %-10s %-10s\n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); 

        String[][] gameResults = new String[totalGames][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nEnter your choice (Rock, Paper, Scissors): ");
            String userChoice = sc.nextLine();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = compChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, totalGames);
        displayResults(gameResults, stats);
    }
}
