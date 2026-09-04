package DAY3.Session2;
class Home{
    interface window{
        void onClose();
    }
} 
class app implements Home.window{
    @Override
    public void onClose(){
        System.out.println("Window is closed");
    }
}
public class NestedInterface {
    public static void main(String[] args) {
        Home.window obj = new app();
        obj.onClose();
    }
    
}
