package weather_station;

public class Program {
    public static void main (String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        // Se crean los subscribers y se suscriben al subject
        Screen detailScreen = new DetailScreen(weatherStation);
        Screen mainScreen = new MainScreen(weatherStation);
        // Se vincula la estación con el dispositivo físico para recibir actualizaciones de mediciones
        Device device = new Device(weatherStation);
    }
}