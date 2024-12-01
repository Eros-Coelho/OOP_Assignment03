/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

import java.time.LocalDate;

public class Assessment {

//    enum for submission with 4 states: either not yet submitted, submitted, updated or late
    public enum Submission {
        NO_SUBMISSION,
        SUBMITTED,
        UPDATED,
        LATE
    }

    private final String title;
    private final String content;
    private Submission status;
    private LocalDate timeStamp;

//    setting the standard value of status for not yet submitted
    public Assessment (String title, String content){
        this.title = title;
        this.content = content;
        this.status = Submission.NO_SUBMISSION;
        this.timeStamp = null;
    }

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public Submission getStatus() {
        return status;
    }

    public void setStatus(Submission status) {
        this.status = status;
    }

    public void setTimeStamp (LocalDate timeStamp){
        this.timeStamp = timeStamp;
    }
}
