package enums;

public enum DayOfWeek {
    MANDAY("Понедельник", 8), TUESDAY("Вторник", 8),
    WEDNESDAY("Среда", 8), THURSDAY("Четверг", 8),
    FRIDAY("Пятница", 8), SATURDAY("Суббота", 0), SUNDAY("Воскресение", 0);

    private String rusName;
    private int hours;

    DayOfWeek(String rusName, int hours) {
        this.rusName = rusName;
        this.hours = hours;
    }

    String getRusName(){
        return rusName;
    }

    public int getHours() {
        return hours;
    }
}
