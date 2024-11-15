package Oct.ex_11102024.encapuslation.police;

public class SuperSenior {
    public static void main(String[] args) {
        Cop superSenior=new Cop(12);
        //System.out.println(superSenior.gun); //private function not allow access outside classes
        superSenior.canIShoot(); //allowed protected within the package

    }
}
