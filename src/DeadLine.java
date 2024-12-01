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

    public boolean beforeDeadLine(LocalDate time){
        return time.isBefore(date);
    }
}