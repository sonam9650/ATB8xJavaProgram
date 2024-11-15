package Oct.ex_11102024.encapuslation;

public class Lab141 {
    public static void main(String[] args) {
        ICICIBank sonam=new ICICIBank("Sonam",1000);

        //sonam.bal=100000; //private not allowed
        System.out.println(sonam.getBal());      //before balance change
        boolean isAdmin=true;
        sonam.setBal(1000000,isAdmin);      //this should allow only to admin
        System.out.println(sonam.getBal());      //after balance change
    }
}
