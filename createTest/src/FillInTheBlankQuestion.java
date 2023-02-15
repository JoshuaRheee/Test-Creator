public class FillInTheBlankQuestion extends ObjectiveQuestion {
    public FillInTheBlankQuestion(int ipoints, int idifficulty, int ianswerSpace, String iquestionText,String icorrectAnswer) {
        super(ipoints,idifficulty,ianswerSpace,iquestionText,icorrectAnswer);
    }
    public String answerKey() {
        int startIndex = questionText.indexOf("______");
        String newString = questionText.substring(0,startIndex + 1) + "___" + correctAnswer + "___" + questionText.substring(startIndex + correctAnswer.length() + 1) + "\n";
        return newString;
    }
}