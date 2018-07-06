package fi.vtt.nubotest;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by root on 18-6-28.
 */

public class SerializableHashMap implements Serializable {
    private HashMap map=new HashMap();
    public HashMap getMap(){
        return map;
    }
    public void setMap(HashMap map){
        this.map=map;
    }
}
