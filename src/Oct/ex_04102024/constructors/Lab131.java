package Oct.ex_04102024.constructors;

public class Lab131 {
    public static void main(String[] args) {
        Dog simple=new Dog();

        Dog bd=new Dog("bull_Dog");
        System.out.println(bd.name);
        System.out.println(bd.breed);
        System.out.println(bd.legs);
        System.out.println(bd.age);   //not set all values

        Dog gs=new Dog("lucy",2,4,"german_shephered");
        System.out.println(gs.breed);
        System.out.println(gs.age);
        System.out.println(gs.legs);
        System.out.println(gs.name);    //set all values
    }
}
