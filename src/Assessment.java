/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

import java.time.LocalDate;

public class Assessment {

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
