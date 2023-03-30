package weather_station;

import java.util.ArrayList;

public class WeatherStation implements Subject {
    public ArrayList<Observer> observers = new ArrayList<>();
    private Float humidity;
    private Float temperature;
    private Float pressure;

    public Float getHumidity() {
        return this.humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Float getTemperature() {
        return this.temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getPressure() {
        return this.pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }


    public void addObserver(Observer obs) {
        this.observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        this.observers.remove(obs);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.humidity, this.temperature, this.pressure);
        }
    }

    // Se llama cada vez que las propiedades de este objeto reciben nueva data
    // Por lo que this.propiedad tendrá los valores más actuales.
    // Otra posible implementación podría ser que se pasen como argumentos esos valores y se asignen
    // al objeto dentro del método.
    public void measurementsChanged() {
        notifyObservers();
    }
}

// El flujo sería, otra entidad está haciendo uso de WeatherStation y está llamando a su método measurementChanged
// cada cierto tiempo