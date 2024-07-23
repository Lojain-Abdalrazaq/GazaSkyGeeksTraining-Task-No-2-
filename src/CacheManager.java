import java.util.HashMap;
import java.util.Map

public class CacheManager {
    private static CacheManager cache_instance;
    private Map<String,String> cache;

    private CacheManager(){
        cache = new HashMap<>();
    }


}
