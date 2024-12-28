public class Main {
    public static void main(String[] args) {
//      Adaptee
        CSVReader csvReader=new CSVReader();
//        Adapter
        JSONParser adapter=new CSVtoJsonAdapter(csvReader);
//        Client data processoor
        DataProcessor dataProcessor=new DataProcessor(adapter);
        dataProcessor.proceesData();

    }

}
/*flow - adaptee -> Adapter -> Client
 It acts as a bridge between two incompatible interfaces by converting the interface of one class into an interface expected by clients
Application
When you want to reuse a class but its interface doesn’t match the requirement.
When you have legacy code that needs to interact with modern systems.
To integrate third-party APIs that have incompatible interfaces*/
