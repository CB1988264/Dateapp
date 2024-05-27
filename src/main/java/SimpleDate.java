
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance () {    // advance by one day
        this.day += 1;          // adds 1 to this day
        if (this.day > 30) {    // if this day value is above 30, 
            this.month += 1;    // then add 1 to the month
            this.day = 1;       // and reset the day to 1
            
            if (this.month > 12) {  // if the month value exceeds 12
                this.year += 1;     // then add 1 to year value
                this.month = 1;     // then reset month value to 1
            }   // End of months > 12 if statement
        }   // End of day > 30 statement
    }
    
    public void advance (int numberOfDays) {    
        for (int i = 0; i < numberOfDays; i++) { // return the advance method until integer i
                                                 // iterates to the numberOfDays passed
            this.advance();    
        }   // End of for loop
        
    } 
    
    public SimpleDate afterNumberOfDays (int days) {
        SimpleDate newDate = new SimpleDate (this.day, this.month, this.year); 
        // newDate set taking the initial day, month and year.
        
        newDate.advance(days);  // call the advance method, pass the int days from afterNumberOfDays method
                                   
        return newDate;     // Return the newDate value after advancing for the specified number of days
        
//        for (int i = 0; i < days; i++) {
//            newDate.advance();
//        }
        
        //return newDate;
    }
    
   

}
