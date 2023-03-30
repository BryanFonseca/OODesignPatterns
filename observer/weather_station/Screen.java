package weather_station;

public abstract class Screen implements Observer{
    public Screen(Subject subject) {
        subject.addObserver(this);
    }

    public void update(float humidity, float temperature, float pressure) {
        display(humidity, temperature, pressure);
    }

    public void display(float humidity, float temperature, float pressure) {
        System.out.println("---Displaying updated data---");
        System.out.println(humidity + " " + temperature + " " + pressure);
        System.out.println("------------------------------");
    }
}
