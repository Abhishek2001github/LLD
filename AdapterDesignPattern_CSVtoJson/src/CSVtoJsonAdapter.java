//Adapter converting CSV to Json
public class CSVtoJsonAdapter implements JSONParser{
    private CSVReader csvReader;
    public CSVtoJsonAdapter(CSVReader csvReader){
        this.csvReader=csvReader;

    }

    @Override
    public void parse() {
        //logic to convert CSV to Json
    }
}
