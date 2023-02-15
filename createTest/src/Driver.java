public class Driver {
    public static void main(String Args[]) {

        ObjectiveQuestion[] questionaire = new ObjectiveQuestion[6];
        questionaire[0] = new ObjectiveQuestion(2,1,1,"What is 1 + 1","2");
        questionaire[1] = new MultipleChoiceQuestion(4,2,0,"What is 1 + 2?","3","0\n1\n2\n3\n4\n");
        questionaire[2] = new FillInTheBlankQuestion(6,3,2,"The president lives in the ______ house","white");
        questionaire[3] = new MultipleChoiceQuestion(26,8,0,"What is the answer to this question?","How am I supposed to know?", "Yes\nNo\nHow am I supposed to know?\nI am confident that this is the answer\n");
        questionaire[4] = new ObjectiveQuestion(14,6,2,"What did your grandfather say after he passed?","Nothing");
        questionaire[5] = new FillInTheBlankQuestion(6,2,2,"You are what you ______","eat");
        Test Quiz1 = new Test(questionaire);
        System.out.println(Quiz1);
        System.out.println(Quiz1.answerKey());
        System.out.println(Quiz1.totalPoints);
    }
}