package task3;

public enum Week {

    Monday("Monday",1),
    Tuesday("Tuesday",2),

    Wednesday("Wednesday",3 ),
    Thursday ("Thursday",4),

    Friday("Friday",5),
    Saturday("Saturday",6),
    Sunday ("Sunday",6);

    private String name;

    private Integer day;


    Week(String name,Integer day) {
        this.name=name;
        this.day=day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}

