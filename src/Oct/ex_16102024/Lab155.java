package Oct.ex_16102024;

public class Lab155 {
    public static void main(String[] args) {

        System.out.println(color.RED.getHexcode());
        System.out.println(color.GREEN.getHexcode());

        if (color.GREEN.getHexcode()=="#00FF00"){
            System.out.println("Color is Green");
        }
    }

}

enum color{
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String hexcode;

    private color(String hexcode){
        this.hexcode=hexcode;  //Parameterized constructor
    }

    public String getHexcode(){
        return this.hexcode;     //Getter
    }
}
