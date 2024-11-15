package Oct.ex_11102024.encapuslation.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop=new Cop(15);
        //System.out.println(jrCop.gun); //private access not allowed the outside of classes
        jrCop.canIShoot();  //allowed protected within the package
    }

}
