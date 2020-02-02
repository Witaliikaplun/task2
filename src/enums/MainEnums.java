package enums;

public class MainEnums {
    public static void main(String[] args) {
        DaiIn(DayOfWeek.SATURDAY);
    }

    public static void DaiIn(DayOfWeek day) {
        if (day.getHours() == 0) {
            System.out.println("Сегодня выходной день!");
        } else {
            DayOfWeek[] mass = DayOfWeek.values();
            int sum = 0;
            for (int i = day.ordinal(); i < mass.length; i++) {
                sum += mass[i].getHours();
            }
            System.out.println(sum);
        }

    }
}
