/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        DeadLine deadline = new DeadLine(LocalDate.of(2024, 12, 8));
        AssignmentSubmission submissionManager = AssignmentSubmission.getInstance(deadline);
    }
}
