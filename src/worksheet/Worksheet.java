package worksheet;

import java.util.ArrayList;

public class Worksheet {

    private ArrayList<Problem> worksheet;
    private Float score;

    public Worksheet() {
        Context context = new Context();

        SetUpState startState = new SetUpState();
        startState.doAction(context);
        worksheet = startState.getProblems();

        StudentState stopState = new StudentState(worksheet);
        stopState.doAction(context);
        score = stopState.getScore();
    }

    public ArrayList<Problem> getWorksheet() {
        return worksheet;
    }

    public Float getScore() {
        return score;
    }

}
