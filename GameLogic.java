public class GameLogic {
    // Метод для определения победителя
    public static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "Ничья!";
        } else if ((playerChoice.equals(Field.ROCK) && computerChoice.equals(Field.SCISSORS)) ||
                (playerChoice.equals(Field.PAPER) && computerChoice.equals(Field.ROCK)) ||
                (playerChoice.equals(Field.SCISSORS) && computerChoice.equals(Field.PAPER))) {
            return "Вы победили!";
        } else {
            return "Компьютер победил!";
        }
    }
}
