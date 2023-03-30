package weather_station;

public class Device {
    public WeatherStation weatherStation;

    public Device(WeatherStation wStation) {
        this.weatherStation = wStation;
        this.startMeasuring(5);
    }

    public void linkToDevice(WeatherStation wStation) {
        this.weatherStation = wStation;
        this.startMeasuring(5);
    }

    private Float getRandomMeasurement() {
        return (float)Math.random() * 3;
    }

    private void startMeasuring(int nTimes) {
        try {
            for (int i = 0; i < nTimes; i++) {
                int interval = (int)Math.floor(Math.random() * 3 * 1000);
                // System.out.println("Started timeout for " + ((float)interval / 1000) + " seconds");
                Thread.sleep(interval);
                // Imagine some HTTP request happening every x seconds and updating this object
                weatherStation.setHumidity(getRandomMeasurement());
                weatherStation.setTemperature(getRandomMeasurement());
                weatherStation.setPressure(getRandomMeasurement());
                weatherStation.measurementsChanged();
            }
        } catch (InterruptedException e) {
            // Intentionally swallowed just for learning purposes
        }
    }
}
