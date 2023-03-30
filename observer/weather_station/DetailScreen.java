package weather_station;

public class DetailScreen extends Screen{
    public DetailScreen(Subject subject) {
        super(subject);
    }

    @Override
    public void display(float humidity, float temperature, float pressure) {
        System.out.println("Detail Screen");
        super.display(humidity, temperature, pressure);
    }
}
