package Oct.ex_11102024.encapuslation.police;

public class Cop {
    private int gun;
    private String idCard;

    public Cop(int gun){
        this.gun=gun;
    }

    protected void canIShoot(){
        System.out.println("yes you can");
    }
}
