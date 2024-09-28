package Sept.ex_25092024;

public class Lab117_Task03_Prime_Numbers {
       //Prime Number from 1 to 100. (for loop)

    public void count(int num){
        int count = 1;
        int i = 2;
        for (int k=i; k<=num; k++){
            if (num%k==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("It is a prime number" + num);
        }
        else{
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int num = 100;
        int count = 1;
        for ( int i=2; i <= num; i++) {

            Lab117_Task03_Prime_Numbers obj = new Lab117_Task03_Prime_Numbers();
            obj.count(i);
        }
    }
}

