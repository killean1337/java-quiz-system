public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.addQuestion(new Question(
            "What is the capital of Austria?",
            "Vienna"
        ));

        quiz.addQuestion(new Question(
            "Which language runs in the JVM?",
            "Java"
        ));

        quiz.addQuestion(new Question(
            "What does OOP stand for?",
            "Object Oriented Programming"
        ));

        quiz.start();
    }
}