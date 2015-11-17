#Singleton Pattern

**Singleton Pattern: Ensure a class has only one instance and provide a global point of access to it**


One of the inherent issue with the singleton Pattern is multithreading, so what is favorable to do in that case:
* Instanciate when declaring it (private static Singleton uniqueInstance = new Singleton())
* After checking if there are no instances, use synchronized(Singleton.class)
* Last resort: use synchronized keyword on the getInstance() method