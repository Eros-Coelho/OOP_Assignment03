/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AssignmentSubmission {

    private static AssignmentSubmission instance;
    private static DeadLine DeadLine;
    private final List<Assessment> assessments;
    private final DeadLine deadline;

    private AssignmentSubmission (DeadLine deadline){
        this.assessments = new ArrayList<>();
        this.deadline = deadline;
    }

//    implementing the singleton pattern here, ensuring this can only be instanced once in the entire code
    public static AssignmentSubmission getInstance (DeadLine deadline){
        if (instance == null){
            instance = new AssignmentSubmission(deadline);
        } return instance;
    }

//    normal getters for private attributes
    public static DeadLine getDeadLine() {
        return DeadLine;
    }

    public List<Assessment> getAssessments() {
        return assessments;
    }

//    checks if the assignment is late, submitted or on time
    public void submit (Assessment assessment){
        LocalDate currentTime = LocalDate.now();
        if (assessment.getStatus() == Assessment.Submission.NO_SUBMISSION){
            assessment.setStatus(Assessment.Submission.SUBMITTED);
        } else if (deadline.beforeDeadLine(currentTime)){
            assessment.setStatus(Assessment.Submission.UPDATED);
        } else {
            assessment.setStatus(Assessment.Submission.LATE);
        }
        assessment.setTimeStamp(currentTime);
        assessments.add(assessment);
    }
}
