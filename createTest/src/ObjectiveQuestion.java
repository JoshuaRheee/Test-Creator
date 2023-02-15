public class ObjectiveQuestion extends Question {
    public String correctAnswer;
    public ObjectiveQuestion(int ipoints, int idifficulty, int ianswerSpace, String iquestionText, String icorrectAnswer) {
        super(ipoints,idifficulty,ianswerSpace,iquestionText);
        correctAnswer = icorrectAnswer;
    }
    public String answerKey() {
        return correctAnswer + "\n";
    }
}