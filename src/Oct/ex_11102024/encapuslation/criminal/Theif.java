package Oct.ex_11102024.encapuslation.criminal;


import Oct.ex_11102024.encapuslation.police.Cop;

public class Theif {
    public static void main(String[] args) {
        Cop c=new Cop(10);
       // System.out.println(c.gun);  //private function not allow access outside package and classes
        //c.canIShoot();   //not allowed the access in protected function outside package

    }

}
