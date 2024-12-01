/*
Name: Eros Lima Coelho
Student ID: 3151957
 */

import java.time.LocalDate;

public final class DeadLine {

    private final LocalDate date;

    public DeadLine(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate(){
        return date;
    }

//    boolean that returns true if the date is before the due date aka deadline for the assignment
    public boolean beforeDeadLine(LocalDate time){
        return time.isBefore(date);
    }
}