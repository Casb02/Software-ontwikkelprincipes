package nl.saxion.sdp;

import java.awt.dnd.InvalidDnDOperationException;

public class Birthdate {

    private final int day;
    private final int month;
    private final int year;

    public Birthdate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    @Override
    public String toString() {
        return "born on the " +  day +  " of " + getMonth(month) + " " + year  ;
    }



    private String getMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "Februari";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new InvalidDnDOperationException("month must be in range 1 to 12");
        }
    }
}
