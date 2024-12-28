import java.util.ArrayList;
import java.util.List;
//Adaptee read data in csv
public class CSVReader {
    public List<String[]> data;
    public CSVReader(){
        data=new ArrayList<>();
        data.add(new String[]{"Name","Age","City"});
        data.add(new String[]{"Alice","18","Varanasi"});
        data.add(new String[]{"Bob","19","Prayagraj"});
        data.add(new String[]{"Abhi","24","Kacchwa Road"});

    }
    public List<String[]> getCSVdata(){
        return data;
    }
}
