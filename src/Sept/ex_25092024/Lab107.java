package Sept.ex_25092024;

public class Lab107 {
    public static void main(String[] args) {
        // print the value of even or odd numbers from 0 to 50
        for (int i=0; i<=50;i++){
            if (i%2==0){
                System.out.println("Even number -> "+ i);
                continue;
            }
            System.out.println(i);

        }
    }
}
