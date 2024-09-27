package Sept.ex_23092024;

public class Lab073 {
    public static void main(String[] args) {
        //Web automation real time question
        // i will ask from user which browser you want me to run the code
        // chrome-execute code
        // firefox-execute code
        // edge-execute code
        String browser="Chrome";
        switch (browser){
            default:
                System.out.println("I have not idea which browser is this");
                break;
            case "Chrome":
                System.out.println("Starting from the chrome");
                break;
            case "Firefox":
                System.out.println("Starting from the Firefox");
                break;
            case "Edge":
                System.out.println("Starting from the Edge");
                break;
        }
    }
}
