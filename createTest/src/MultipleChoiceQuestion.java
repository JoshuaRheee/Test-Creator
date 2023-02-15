public class MultipleChoiceQuestion extends ObjectiveQuestion {
    public String possibleAnswers;
    public MultipleChoiceQuestion(int ipoints, int idifficulty, int ianswerSpace, String iquestionText,String icorrectAnswer,String ipossibleAnswers) {
        super(ipoints,idifficulty,ianswerSpace,iquestionText,icorrectAnswer);
        possibleAnswers = ipossibleAnswers;
    }
    public String toString() {
        String tempstring = "\n";
        for (int i = 0; i < answerSpace; i ++) {
            tempstring += "\n";
        }
        return (points + " points\t Difficulty: " + difficulty + "\n" + questionText + tempstring + possibleAnswers);
    }
    public String answerKey() {
        int startIndex = possibleAnswers.indexOf(correctAnswer);
        String newString = questionText + "\n" + possibleAnswers.substring(0,startIndex) + "***" + correctAnswer + "***" + possibleAnswers.substring(startIndex + correctAnswer.length()) + "\n";
        return newString;
    }
}