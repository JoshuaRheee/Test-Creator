public class Question {
    public int points;
    public int difficulty;
    public int answerSpace;
    public String questionText;
    public Question(int ipoints, int idifficulty, int ianswerSpace, String iquestionText) {
        points = ipoints;
        difficulty = idifficulty;
        answerSpace = ianswerSpace;
        questionText = iquestionText;
    }
    public String toString() {
        String tempstring = "\n";
        for (int i = 0; i < answerSpace; i ++) {
            tempstring += "\n";
        }
        return (points + " points\t Difficulty: " + difficulty + "\n" + questionText + tempstring);
    }
}