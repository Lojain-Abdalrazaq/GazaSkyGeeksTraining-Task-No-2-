/**
 * Lojain Abdalrazaq - Task No.2
 *
 * In my task, I used the concept of cache manager as an example and an application of Singleton design pattern. In cache manager application,
 * we need only one instance of the cache in order to use it in saving , reading or retreving items on it, and the singleton patterns solves the problem.
 * Using the singleton pattern ensures that we have one cache accessable among the application and ovoide to have multiple instances of caches
 * which could be resource-intensive.
 */
public class Main {
    public static void main(String[] args) {

        // firstly, we want to get the singleton instance of te cache manager
        CacheManager cacheManager =  CacheManager.getCacheInstance();

        // adding items to the cache map using the addToCache function
        cacheManager.addToCache("user1", "Lojain Abdalrazaq");
        cacheManager.addToCache("user2", "ahmad mahmoud");

        // accessing data from the cache using getItem function
        cacheManager.getItem("user1");

        // checking of the item is exists in the cache or not using containsItem function
        cacheManager.containsItem("user2");
        cacheManager.containsItem("user10");
    }
}