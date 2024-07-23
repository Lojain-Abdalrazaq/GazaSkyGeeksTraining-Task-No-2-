import java.util.HashMap;
import java.util.Map;

public class CacheManager {

    // variable to hold the instance of the cache manager
    private static CacheManager cache_instance;
    // the map of the cache
    private Map<String,String> cache;

    private CacheManager(){
        cache = new HashMap<>();
    }
    // getting the instance if exists or creating the instance in case of first time calling the function
    public static CacheManager getCacheInstance(){
        System.out.println("=============================================");
        if(cache_instance == null){
            synchronized (CacheManager.class) {
                if (cache_instance == null) {
                    System.out.println("The instance is created....");
                    cache_instance = new CacheManager();
                }
            }
        }
        return cache_instance;
    }
    // function to add on the cache
    public void addToCache(String key, String value){
        System.out.println("=============================================");
        System.out.println("Adding to cache "+ key+ " " + value);
        cache.put(key, value);
        System.out.println("Added to cache sucessfully!!");
    }
    // function for getting item from the cache
    public void getItem(String key){
        System.out.println("=============================================");
        System.out.println(cache.get(key));
    }
    // function to check if the item exits in the cache using the key
    public boolean containsItem(String key){
        System.out.println("=============================================");
        if (cache.containsKey(key)){
            System.out.println("Yes! The cache contains the item with key" +key +" and the value is " + cache.get(key));
            return true;
        }
        System.out.println("No. The cache does not contain and item with key "+key);
        return false;
    }

}
