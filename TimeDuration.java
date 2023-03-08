public class TimeDuration {

    private int h;
    private int m;
    private int s;

    public TimeDuration(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public String toString(){
        String result = "";
        if (h < 10){
            result += "0" + h + ":";
        }else{
            result += h + ":";
        }
        if (m < 10){
            result += "0" + m + ":";
        }else{
            result += m + ":";
        }
        if (s < 10){
            result += "0" + s;
        }else{
            result += s;
        }
        return result;
    }

    public static parseFromString(String time){
        
    }

    public static void main(String[] args) {
        TimeDuration time = new TimeDuration(1, 2, 3);
        System.out.println(time);
        System.out.println(parseFromString("2s"));
    }
}
