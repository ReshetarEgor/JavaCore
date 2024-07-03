public class Field {
    public static final String ROCK = "Камень";
    public static final String PAPER = "Бумага";
    public static final String SCISSORS = "Ножницы";

    // Метод для получения случайного выбора
    public static String getRandomChoice() {
        String[] choices = { ROCK, PAPER, SCISSORS };
        int index = (int) (Math.random() * choices.length);
        return choices[index];
    }
}
