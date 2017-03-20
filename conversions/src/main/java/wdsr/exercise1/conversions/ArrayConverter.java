package wdsr.exercise1.conversions;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Marek on 14.02.2016.
 */
public class ArrayConverter {
	private static final Logger log = LogManager.getLogger();

    public int[] convertToInts(String[] strings) {
    	log.debug("ConvertToInts entered [strings={}]", Arrays.toString(strings));
    	String cos=Arrays.stream(strings).mapToInt(Integer::valueOf).toArray().toString();

    	log.debug("ConvertToInts exiting",Arrays.toString(Arrays.stream(strings).mapToInt(Integer::valueOf).toArray()));
        return Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();
    
    }
}
