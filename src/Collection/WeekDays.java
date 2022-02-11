package Collection;

public enum WeekDays {

    MONDAY(1),
    TUESDAY(2),
    WENSDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int dayNumberOfWeek;

    WeekDays(int dayNumberOfWeek) {
        this.dayNumberOfWeek = dayNumberOfWeek;
    }

    public int getDayNumberOfWeek() {
        return dayNumberOfWeek;
    }
}
