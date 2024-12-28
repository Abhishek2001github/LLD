//Client :application consuming json data
public class DataProcessor {
    private JSONParser jsonParser;
    public DataProcessor(JSONParser jsonParser){
        this.jsonParser=jsonParser;
    }
    public void proceesData(){
        System.out.println("processing data");


    }
}
