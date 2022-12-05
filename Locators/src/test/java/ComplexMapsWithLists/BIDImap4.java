package ComplexMapsWithLists;

import org.apache.commons.collections.BidiMap;
import org.bouncycastle.asn1.eac.BidirectionalMap;
import org.testng.annotations.Test;

import java.text.Bidi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BIDImap4 {

    @Test
    public Map<Integer, String> getmapsos() {
        HashMap map000 = new HashMap();
        BidiMap maoo = (BidiMap) new BidirectionalMap();
        maoo.put(3, "fffd");
        maoo.inverseBidiMap();
        // maoo.inverseBidiMap();
        // for (Map.Entry<Integer,String> entry : maoo.entrySet()){
        // System.out.println("Key = " + entry.getKey() +
        //", Value = " + entry.getValue());
        System.out.println("ddddd");
        return maoo;

    }

}


