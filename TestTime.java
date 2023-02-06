public class Test {
    public static void main(String[] args) {
        Time time = new Time(0,0,1);
        System.out.println(time);
        System.out.println(time.getSecond());
        System.out.println(time.nextSecond(time));
        System.out.println(time.previousSecond(time));
        time.setHour(17);
        time.setMinute(23);
        time.setSecond(43);
        System.out.println(time);
        System.out.println(time.showHour());
        System.out.println(time.showMinute());
        System.out.println(time.showSecond());
        System.out.println(time.nextSecond(time));
        System.out.println(time.previousSecond(time));
    }
}
