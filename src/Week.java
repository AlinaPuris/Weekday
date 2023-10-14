public class Week {

        public enum Weekday {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }
        public static void isHoliday(Weekday A){
            if (A == Weekday.SATURDAY || A == Weekday.SUNDAY){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }

}


