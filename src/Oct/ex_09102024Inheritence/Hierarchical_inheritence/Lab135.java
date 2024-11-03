package Oct.ex_09102024Inheritence.Hierarchical_inheritence;

public class Lab135 {
    public static void main(String[] args) {

        Kusum k = new Kusum();
        k.gold();
        k.home();

        Sonam s=new Sonam();
        s.money();
        s.home();

        Vivek v=new Vivek();
        v.bike();
        v.home();

        Father f =new Father();
        f.home();
    }
}