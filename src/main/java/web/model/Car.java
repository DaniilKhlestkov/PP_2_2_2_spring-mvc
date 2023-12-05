package web.model;

public class Car {
    private String model;
    private String driveTrain;
    private int series;

    public Car(String model, String driveTrain, int series) {
        this.model = model;
        this.driveTrain = driveTrain;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", driveTrain='" + driveTrain + '\'' +
                ", series=" + series +
                '}';
    }
}
