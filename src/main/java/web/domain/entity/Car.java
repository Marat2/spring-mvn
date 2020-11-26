package web.domain.entity;

import javax.persistence.*;

@Entity
@Table(name="car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer series;
    @Column(name = "name")
    private String name;
    @Column(name = "model")
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
