package Models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.lang.reflect.Type;

public class Json implements FileOperation{
    private Gson gson;
    private static final String FILE_NAME_CUSTOMER="./people.json";
    private static final String FILE_NAME_TSHIRT="./tshirt.json";
    public JsonFO(){
        gson=new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
    }
    @Override
    public ListZakazniku load(){

            Type targetType=new TypeToken<ListZakazniku>(){}.getType();
            FileReader reader=new FileReader(FILE_NAME_CUSTOMER,FILE_NAME_TSHIRT);
            ListZakazniku listZakazniku=gson.fromJson(reader,targetType);
            return listZakazniku;

    }
}
