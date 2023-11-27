package ObserverDesignPattern;

public class ObserverMain {
    public static void main(String args[]){
        NewsAgenecy newsAgenecy=new NewsAgenecy();
        Pogo pogo=new Pogo();
        CartoonNetwork cartoonNetwork= new CartoonNetwork();
        newsAgenecy.addChannel(pogo);
        newsAgenecy.addChannel(cartoonNetwork);
        newsAgenecy.setProgramName("Made In heaven season2");
        cartoonNetwork.getProgramInfo();
        pogo.getProgramInfo();

    }
}
