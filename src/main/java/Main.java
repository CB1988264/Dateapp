
public class Main {

    public static void main(String[] args) {
        // test your program here!
        
         SimpleDate date = new SimpleDate(30, 12, 2011);
        System.out.println("Friday of the examined week is " + date);
        
        date.advance();
        System.out.println(date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }

        System.out.println("The date after 790 days from the examined Friday is ... ");
        System.out.println(date.afterNumberOfDays(790));
    }
}
