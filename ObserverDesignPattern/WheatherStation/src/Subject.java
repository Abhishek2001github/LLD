public interface Subject {
    public void register(Observer observer);
    public void unRegister(Observer observer);
    public void update(double temprature,double humidity);


    public void notifies();
}
