public class SingletonClient {
    public static void main(String[] args) {
        SingletonClass singleton = SingletonClass.getInstance();
        singleton.showMessage();
    }
}


