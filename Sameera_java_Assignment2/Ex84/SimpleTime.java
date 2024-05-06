package Ex84;

    
public class SimpleTime {
    private int hour; // 0-23
    private int minute; // 0-59
    private int second; // 0-59

    // construct
    public SimpleTime(int hour, int minute, int second) {
        this.hour = hour; //set "this" object's hour
        this.minute = minute;
        this.second = second;
    }

    // method to convert to string in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    // method to build string representation
    public String buildString() {
        return String.format("%24s:%s%n%24s: %s", "this.toUniversalString()", this.toUniversalString(),"toUniversalString()",toUniversalString());
    }

}
