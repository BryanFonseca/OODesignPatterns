package weather_station;

public interface Observer {
    public void update(float humidity, float temperature, float pressure);
}
