package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private long id;

    private String model;

    private int serial;

    public Car() {
    }

    public Car(long id, String model, int serial) {
        this.id = id;
        this.model = model;
        this.serial = serial;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", serial=" + serial +
                '}';
    }
}
