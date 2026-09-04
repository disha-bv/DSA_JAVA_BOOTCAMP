package DAY3.Session2;
class Home{
    interface window{
        void onClose();
        private void play(){
            

        }
        static void play2(){

        }
        default void play3(){

        }
    }
} 
class app implements Home.window{
    @Override
    public void onClose(){
        System.out.println("Window is closed");
    }
}
public class FunctinalInterface {
    public static void main(String[] args){

    }    
}
