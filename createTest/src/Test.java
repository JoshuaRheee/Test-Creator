public class Test {
    public ObjectiveQuestion[] questions;
    public int totalPoints;
    public Test(ObjectiveQuestion[] iquestions) {
        questions = iquestions;
        totalPoints = 0;
        for (int i = 0; i < questions.length; i ++) {
            totalPoints += questions[i].points;
        }
    }
    public String toString() {
        String tempString = "";
        for (int i = 0; i < questions.length; i ++) {
            tempString += "\nQUESTION NUMBER " + (i+1) + "\n" + questions[i].toString();
        }
        return "TEST\n" + tempString;
    }
    public String answerKey() {
        String tempString = "";
        for (int i = 0; i < questions.length; i ++) {
            tempString += "\nQUESTION NUMBER " + (i+1) + "\n" + questions[i].answerKey();
        }
        return "ANSWER MANUAL" + tempString;
    }
}