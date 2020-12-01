package web.domain.entity;


public class Car {

    private Integer series;

    private String name;

    private String serial;

    public Car() {

    }

    public Car(Integer series, String name, String serial) {
        this.series = series;
        this.name = name;
        this.serial = serial;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", name='" + name + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}
