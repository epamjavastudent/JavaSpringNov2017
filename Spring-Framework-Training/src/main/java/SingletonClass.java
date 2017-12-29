
import sun.misc.Unsafe;

/*double check locking: */
public class SingletonClass {

    private SingletonClass() {
    }

    private static SingletonClass ourInstance ;

    public static SingletonClass getInstance() {

        if (ourInstance == null){
            synchronized (SingletonClass.class){
                    if (ourInstance == null) {
                        ourInstance = new SingletonClass();
                    }
                //ourInstance = new SingletonClass();
            }
        }
        return ourInstance;
    }

    public static void main(){

    }

}
