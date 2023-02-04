public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void  setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String showHour(){
        return "Hour: "+hour;
    }

    public String showMinute(){
        return "Minute: "+minute;
    }

    public String showSecond(){
        return "Second: " +second;
    }

    @Override
    public String toString() {
        return getHour()+":"+getMinute()+":"+getSecond();
    }

    public Time nextSecond(Time time) {
        time.setSecond(time.getSecond() + 1);
        if (time.getSecond() > 59) {
            time.setMinute(time.getMinute() + 1);
            time.setSecond(0);
            if (time.getMinute() > 59) {
                time.setHour(time.getHour() + 1);
                time.setMinute(0);
                if (time.getHour() > 23) {
                    time.setHour(0);
                    time.setMinute(0);
                    time.setSecond(0);
                }
            }

        }
        return time;
    }
    public Time previousSecond(Time time){
        time.setSecond(second - 1);
        if (time.getSecond() < 0) {
            time.setMinute(minute - 1);
            time.setSecond(0);
            if (time.minute < 0) {
                time.setHour(hour - 1);
                time.setMinute(0);
                if (time.hour < 0) {
                    time.setHour(23);
                    time.setMinute(59);
                    time.setSecond(59);
                }
            }
        }
        return time;
    }
}
