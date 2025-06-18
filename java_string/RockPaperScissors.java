import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if (user.equals("rock") && computer.equals("scissors")) return "User";
        if (user.equals("paper") && computer.equals("rock")) return "User";
        if (user.equals("scissors") && computer.equals("paper")) return "User";
        return "Computer";
    }

    public static String[][] getGameStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[3][3];
        stats[0][0] = "Player Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", (userWins * 100.0 / totalGames));

        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", (computerWins * 100.0 / totalGames));

        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(totalGames - userWins - computerWins);
        stats[2][2] = "-";

        return stats;
    }

    public static void displayResults(int rounds) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0;
        int computerWins = 0;

        for (int i = 1; i <= rounds; i++) {
            System.out.println("Round " + i + ": Enter rock, paper, or scissors");
            String user = sc.next().toLowerCase();
            String computer = getComputerChoice();
            String winner = getWinner(user, computer);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            System.out.println("User: " + user + " | Computer: " + computer + " | Winner: " + winner);
        }

        String[][] stats = getGameStats(userWins, computerWins, rounds);
        System.out.println("\nGame Summary:");
        System.out.printf("%-15s %-10s %-15s\n", "Result", "Count", "Percentage");
        for (String[] row : stats) {
            System.out.printf("%-15s %-10s %-15s\n", row[0], row[1], row[2]);
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rounds");
        int rounds = sc.nextInt();
        displayResults(rounds);
        sc.close();
    }
}
