public enum Planet {
    MERCURY("Mercury", "58d 15h 30m", "58 million km", "74.8 million km"),
    VENUS("Venus", "116d 18h 0m", "108 million km", "460.2 million km"),
    EARTH("Earth", "23h 56m", "150 million km", "510.1 million km"),
    MARS("Mars", "24h 37m", "228 million km", "144.8 million km"),
    JUPITER("Jupiter", "9h 56m", "778 million km", "61.42 billion km"),
    SATURN("Saturn", "10h 33m", "1.4 billion km", "42.7 billion km"),
    URANUS("Uranus", "17h 14m", "2.9 billion km", "8.08 billion km"),
    NEPTUNE("Neptune", "16h 6m", "4.5 billion km", "7.64 billion km");

    private final String planetName;
    private final String lengthOfDay;
    private final String distanceFromSun;
    private final String area;

    Planet(String planetName, String lengthOfDay, String distanceFromSun, String area) {
        this.planetName=planetName;
        this.lengthOfDay=lengthOfDay;
        this.distanceFromSun=distanceFromSun;
        this.area=area;
    }

    public String getPlanetName() {
        return planetName;
    }

    public String getLengthOfDay() {
        return lengthOfDay;
    }

    public String getDistanceFromSun() {
        return distanceFromSun;
    }

    public String getArea() {
        return area;
    }
}
