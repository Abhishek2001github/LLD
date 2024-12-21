public class Service1 implements Observer {
    private String ServiceName;

    public Service1(String ServiceName){
        this.ServiceName=ServiceName;
    }
    @Override
    public void update(double temprature, double humidity) {
        System.out.println("current Service1 temperature:"+temprature+" "+"Current Service1 Humidity:"+humidity);

    }
}
