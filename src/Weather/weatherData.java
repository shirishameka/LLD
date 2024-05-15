package Weather;

import java.util.ArrayList;
import java.util.List;

public class weatherData implements Subject{
    float temp;
    float humidity;

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("Observer added");
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println("Observer removed");
    }

    @Override
    public void notifyObserver() {
        for (Observer o: observers){
            o.update(temp, humidity);
        }
    }

    public void setMeasurements(float temp, float humidity){

        this.temp = temp;
        this.humidity = humidity;
        notifyObserver();


    }
}
