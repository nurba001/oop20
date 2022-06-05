package Laba;

public enum Week {
    MONDAY("learn Java "),
    TUESDAY("learn Javapractice"),
    WEDNESDAY("learn Soft skill "),
    THURSDAY("learn English"),
    FRIDAY("learn Java,practice "),
    SATRUDAY("Holiday "),
    SUNDAY("Holiday");


    private String in;
    Week(String in) {
        this.in = in;
    }
    Week(){}
    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }


}
