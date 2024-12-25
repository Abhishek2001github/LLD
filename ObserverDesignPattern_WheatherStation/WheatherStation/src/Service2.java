public class Service2 implements Observer {

    private String serviceName;

    public Service2(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public void update(double temprature, double humidity) {
        System.out.println("current Service2 temperature:" + temprature + " " + "Current Service2 Humidity:" + humidity);

    }
}
