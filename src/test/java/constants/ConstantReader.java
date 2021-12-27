package constants;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

public class ConstantReader {
    public static <T> T reader(Class<? extends Config> clazz){
        return (T) ConfigFactory.create(clazz);
    }
}
