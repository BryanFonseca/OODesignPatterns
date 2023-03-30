package weather_station;

public class MainScreen extends Screen {
    public MainScreen(Subject subject) {
        super(subject);
    }

    @Override
    public void display(float humidity, float temperature, float pressure) {
        System.out.println("Main Screen");
        super.display(humidity, temperature, pressure);
    }
}
