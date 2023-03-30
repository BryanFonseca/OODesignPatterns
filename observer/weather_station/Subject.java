package weather_station;

public interface Subject {
    // Subject is aware of its observers
    public void addObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObservers();
}
