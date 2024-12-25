import java.util.ArrayList;

public class WheatherStation implements Subject {

    private double humidity;
    private double temprature;
    private ArrayList<Observer> ObserverList;

    public WheatherStation() {
        ObserverList = new ArrayList<>();
    }


    @Override
    public void register(Observer observer) {
        if (!ObserverList.contains(observer)) {
            ObserverList.add(observer);
        } else {
            System.out.println("observer is already registerd:" + observer);
        }


    }

    @Override
    public void unRegister(Observer observer) {
        if (!ObserverList.contains(observer)) {
            System.out.println("observer is not yet register");
        } else {
            ObserverList.remove(observer);
        }

    }


    @Override
    public void update(double temprature, double humidity) {
        this.humidity = humidity;
        this.temprature = temprature;
        notifies();


    }

    @Override
    public void notifies() {
        for (int i = 0; i < ObserverList.size(); i++) {
            Observer observer = ObserverList.get(i);
            System.out.println("notifying ::" + observer);
            observer.update(this.temprature, this.humidity);
        }

    }
}
