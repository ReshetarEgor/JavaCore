import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerChoice, computerChoice, result;
        String playAgain;

        System.out.println("Добро пожаловать в игру Камень-Ножницы-Бумага!");

        do {
            System.out.print("Сделайте выбор (Камень, Ножницы, Бумага): ");
            playerChoice = scanner.nextLine();

            while (!playerChoice.equals(Field.ROCK) && !playerChoice.equals(Field.PAPER) && !playerChoice.equals(Field.SCISSORS)) {
                System.out.print("Неправильный выбор. Пожалуйста, выберите снова (Камень, Ножницы, Бумага): ");
                playerChoice = scanner.nextLine();
            }

            computerChoice = Field.getRandomChoice();
            System.out.println("Компьютер выбрал: " + computerChoice);

            result = GameLogic.determineWinner(playerChoice, computerChoice);
            System.out.println(result);

            System.out.print("Хотите сыграть еще раз? (да/нет): ");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("да"));

        System.out.println("Спасибо за игру!");
        scanner.close();
    }
}
